package com.fikranakbar.bisamasak

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvCooks: RecyclerView
    private var list: ArrayList<Cook> = arrayListOf()



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvCooks = findViewById(R.id.rv_foods)
        rvCooks.setHasFixedSize(true)

        list.addAll(CooksData.listData)
        showRecyclerList()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.aboutme, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val intent = Intent(this, AboutMeActivity::class.java)
        startActivity(intent)
        return super.onOptionsItemSelected(item)
    }

    private fun showRecyclerList() {
        rvCooks.layoutManager = LinearLayoutManager(this)
        val listCookAdapter = ListCookAdapter(list)
        rvCooks.adapter = listCookAdapter

        listCookAdapter.setOnItemClickCallback(object: ListCookAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Cook) {
                showSelectedCook(data)
            }
        })
    }

    private fun showSelectedCook(cook: Cook){
        val intent = Intent(this, DetailActivity::class.java)
        intent.putExtra(DetailActivity.KEY_NAME, cook.name)
        intent.putExtra(DetailActivity.KEY_IMAGE, cook.photo)
        intent.putExtra(DetailActivity.KEY_DESC, cook.description)
        intent.putExtra(DetailActivity.KEY_INGREDIENT, cook.ingredient)
        intent.putExtra(DetailActivity.KEY_STEP, cook.step)
        intent.putExtra(DetailActivity.KEY_FAVORITE, cook.isFavorite)
        startActivity(intent)
    }
}