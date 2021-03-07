package com.fikranakbar.bisamasak

import android.content.SharedPreferences
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListCookAdapter(private val listCook: ArrayList<Cook>) : RecyclerView.Adapter<ListCookAdapter.ListViewHolder>() {
    private lateinit var onItemClickCallback: OnItemClickCallback

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.name_cook)
        var tvDesc: TextView = itemView.findViewById(R.id.description_cook)
        var imgFood: ImageView = itemView.findViewById(R.id.img_item_photo)
        var imgBtnShare: ImageButton = itemView.findViewById(R.id.button_share)
        var imgBtnStar: ImageButton = itemView.findViewById(R.id.button_star)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_food, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val cook = listCook[position]
        holder.tvDesc.text = cook.description
        holder.tvName.text = cook.name

        Glide.with(holder.itemView.context)
                .load(cook.photo)
                .apply(RequestOptions().override(150))
                .into(holder.imgFood)

        holder.itemView.setOnClickListener { onItemClickCallback.onItemClicked(listCook[holder.adapterPosition]) }
        holder.imgBtnShare.setOnClickListener {
            Toast.makeText(it.context,"Resep " + listCook[holder.adapterPosition].name + " Telah Dibagikan", Toast.LENGTH_SHORT).show()
        }
        holder.imgBtnStar.setOnClickListener {
            onClickStarButton(holder.imgBtnStar, listCook[holder.adapterPosition])
            if (listCook[holder.adapterPosition].isFavorite)
                Toast.makeText(it.context,listCook[holder.adapterPosition].name + " telah menjadi favorit", Toast.LENGTH_SHORT).show()
            else
                Toast.makeText(it.context,listCook[holder.adapterPosition].name + " telah dihilangkan dari favorit", Toast.LENGTH_SHORT).show()
        }
    }

    override fun getItemCount(): Int {
        return listCook.size
    }

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback){
        this.onItemClickCallback = onItemClickCallback
    }

    fun onClickStarButton(imgBtnStar: ImageButton, cook: Cook) {
        cook.isFavorite = !cook.isFavorite
        when(cook.isFavorite){
            true -> imgBtnStar.setImageResource(R.drawable.ic_baseline_star_24)
            else -> imgBtnStar.setImageResource(R.drawable.ic_baseline_star_outline_24)
        }
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: Cook)
    }


}