package com.example.allclean.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.allclean.databinding.OrderlistBinding

class orderadapter(private val item: List<String>, private val quantity: List<String>):RecyclerView.Adapter<orderadapter.orderViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): orderViewHolder {
        return orderViewHolder(OrderlistBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }



    override fun onBindViewHolder(holder: orderViewHolder, position: Int) {
        val item = item[position]
        val quantity = quantity
        holder.bind(item,quantity)
    }
    override fun getItemCount(): Int {
        return item.size

    }
    class orderViewHolder(private  val binding: OrderlistBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item: String, quantity: List<String>) {
            binding.itemsofcloth.text = item
            binding.noofquantity.text = quantity.toString()
        }
    }
}