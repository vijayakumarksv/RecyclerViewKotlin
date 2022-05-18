package com.gadget.android.recyclerviewbinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.gadget.android.recyclerviewbinding.adapter.AdapterListView
import com.gadget.android.recyclerviewbinding.viewmodel.MainActivityViewModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val fruits = listOf<String>("Apple", "Mango","Orange","Guava","Pine Apple" ,"Staberry", "Apple", "Mango","Orange","Guava","Pine Apple" ,"Staberry",
        "Apple", "Mango","Orange","Guava","Pine Apple" ,"Staberry")
    private lateinit var mainActivityViewModel: MainActivityViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerview.layoutManager = LinearLayoutManager(this)

        val adapter =  AdapterListView()
        adapter.ItemView(fruits)
        recyclerview.adapter = adapter

        mainActivityViewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)
        //mainActivityViewModel.getUserData()
        /*mainActivityViewModel.userMutableLiveData.observe(this, Observer {userList ->
            userList.forEach {
                Log.e("MVVM", ""+it.name)
            }
        })*/
        mainActivityViewModel.users.observe(this, Observer {userList ->
            userList.forEach {
                Log.e("MVVM", ""+it.name)
            }
        })
    }
}