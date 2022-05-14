package com.gadget.android.recyclerviewbinding.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.gadget.android.recyclerviewbinding.R
import kotlinx.android.synthetic.main.itemview.view.*

class AdapterListView : RecyclerView.Adapter<AdapterViewHolder>() {
    lateinit var fruits:List<String>
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.itemview, parent, false)
        return AdapterViewHolder(view)
    }

    override fun onBindViewHolder(holder: AdapterViewHolder, position: Int) {
           holder.bind(fruits.get(position))
    }

    fun ItemView(fruits: List<String>) {
        this.fruits = fruits
    }

    override fun getItemCount(): Int {
    return fruits.size
    }

}

class AdapterViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
    fun bind(fruits: String) {
       val textItem = view.txtItem
        textItem.text = fruits.toString()
        view.setOnClickListener { 
            Toast.makeText(view.context, "User clicked ${fruits}", Toast.LENGTH_SHORT).show()
        }
    }
}