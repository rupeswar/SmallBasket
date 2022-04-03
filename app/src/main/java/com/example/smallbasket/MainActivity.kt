package com.example.smallbasket

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.smallbasket.adapters.CatalogAdapter
import com.example.smallbasket.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val catalog = binding.catalog
        val adapter = CatalogAdapter()
        catalog.adapter = adapter
        catalog.layoutManager = LinearLayoutManager(this)
        
        binding.fab.setOnClickListener { 
            val intent = Intent(this, OrderActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId) {
            R.id.orders -> {
                launchMyOrdersActivity()
                true
            }

            else -> super.onOptionsItemSelected(item)
        }
    }

    private fun launchMyOrdersActivity() {
        val intent = Intent(this, OrdersActivity::class.java)
        startActivity(intent)
    }
}