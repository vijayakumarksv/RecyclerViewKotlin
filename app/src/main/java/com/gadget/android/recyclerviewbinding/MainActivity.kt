package com.gadget.android.recyclerviewbinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.gadget.android.recyclerviewbinding.adapter.AdapterListView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val fruits = listOf<String>("Apple", "Mango","Orange","Guava","Pine Apple" ,"Staberry", "Apple", "Mango","Orange","Guava","Pine Apple" ,"Staberry",
        "Apple", "Mango","Orange","Guava","Pine Apple" ,"Staberry")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerview.layoutManager = LinearLayoutManager(this)

        val adapter =  AdapterListView()
        adapter.ItemView(fruits)
        recyclerview.adapter = adapter
    }
}