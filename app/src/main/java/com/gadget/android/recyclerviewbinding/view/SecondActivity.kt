package com.gadget.android.recyclerviewbinding.view

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.gadget.android.recyclerviewbinding.R
import com.gadget.android.recyclerviewbinding.adapter.AdapterListView
import kotlinx.android.synthetic.main.activity_main.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.activity_main)

        recyclerview.layoutManager = LinearLayoutManager(this)

        val adapter = AdapterListView()
        recyclerview.adapter = adapter


    }
}