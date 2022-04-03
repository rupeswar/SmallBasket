package com.example.smallbasket.adapters

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.smallbasket.FeedbackActivity
import com.example.smallbasket.R

class OrdersAdapter : RecyclerView.Adapter<OrdersAdapter.OrdersViewHolder>() {
    class OrdersViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val name: TextView = itemView.findViewById(R.id.name)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OrdersViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_order, parent, false)

        return OrdersViewHolder(view)
    }

    override fun onBindViewHolder(holder: OrdersViewHolder, position: Int) {
//        TODO("Not yet implemented")
        holder.name.text = "Product ${position + 1}"
        holder.itemView.setOnClickListener {
            val intent = Intent(it.context, FeedbackActivity::class.java)
            it.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
//        TODO("Not yet implemented")
        return 1000
    }
}