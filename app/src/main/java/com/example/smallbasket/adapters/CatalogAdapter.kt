package com.example.smallbasket.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.smallbasket.R
import com.example.smallbasket.utils.CartUtil

class CatalogAdapter : RecyclerView.Adapter<CatalogAdapter.CatalogViewHolder>() {
    class CatalogViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val name: TextView = itemView.findViewById(R.id.name)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CatalogViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_catalog, parent, false)

        return CatalogViewHolder(view)
    }

    override fun onBindViewHolder(holder: CatalogViewHolder, position: Int) {
//        TODO("Not yet implemented")
        holder.name.text = "Product ${position + 1}"
        holder.itemView.setOnClickListener {
            CartUtil.itemsInCart++
            Toast.makeText(it.context, "Added Item to Cart", Toast.LENGTH_SHORT).show()
        }
    }

    override fun getItemCount(): Int {
//        TODO("Not yet implemented")
        return 1000
    }
}