package com.fikranakbar.bisamasak

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class DetailActivity : AppCompatActivity() {

    companion object {
        const val KEY_NAME : String = "food_name"
        const val KEY_IMAGE : String = "food_image"
        const val KEY_DESC : String = "food_desc"
        const val KEY_INGREDIENT : String = "food_ingredient"
        const val KEY_STEP : String = "food_step"
        const val KEY_FAVORITE : String = "food_favorite"
    }

    private lateinit var imgFood : ImageView
    private lateinit var tvDescContent : TextView
    private lateinit var tvIngredientContent : TextView
    private lateinit var tvStepContent : TextView
    private lateinit var btnShare: Button
    private lateinit var menuItem: MenuItem

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        actionBar?.setDisplayShowHomeEnabled(true)
        title = intent.getStringExtra(KEY_NAME)

        imgFood = findViewById(R.id.img_cook)
        tvDescContent = findViewById(R.id.descContent)
        tvIngredientContent = findViewById(R.id.ingredientContent)
        tvStepContent = findViewById(R.id.stepContent)
        btnShare = findViewById(R.id.btn_share)

        btnShare.setOnClickListener {
            Toast.makeText(it.context, "Resep " + intent.getStringExtra(KEY_NAME) + " Telah Dibagikan", Toast.LENGTH_SHORT).show()
        }

        Glide.with(this)
            .load(intent.getIntExtra(KEY_IMAGE, 0))
            .into(imgFood)

        tvDescContent.text = intent.getStringExtra(KEY_DESC)
        tvIngredientContent.text = intent.getStringExtra(KEY_INGREDIENT)
        tvStepContent.text = intent.getStringExtra(KEY_STEP)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.favorite, menu)
        if (menu != null) {
            menuItem = menu.findItem(R.id.btn_favorite)
        }
        if(intent.getBooleanExtra(KEY_FAVORITE, false)){
            menuItem.setIcon(R.drawable.ic_baseline_star_24)
        }
        else {
            menuItem.setIcon(R.drawable.ic_baseline_star_outline_24)
        }
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        if(intent.getBooleanExtra(KEY_FAVORITE, false)){
            menuItem.setIcon(R.drawable.ic_baseline_star_24)
        }
        else {
            menuItem.setIcon(R.drawable.ic_baseline_star_outline_24)
        }
        return super.onOptionsItemSelected(item)
    }
}