package com.example.a_zpharmacy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Shampoo_Baby : AppCompatActivity(),OnItemRecycleClickListener {
    lateinit var list: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shampoo_baby)
        list = findViewById(R.id.recyclerView11)
        // this creates a vertical layout Manager
        list.layoutManager = LinearLayoutManager(this)

//        // ArrayList of class ItemsViewModel
//        val data = ArrayList<ItemViewModel>(4)
//
//
//        data.add(ItemViewModel(R.drawable.babydove, "Baby Dove", 190))
//        data.add(ItemViewModel(R.drawable.freezydream, "Freezy Dream", 320))
//        data.add(ItemViewModel(R.drawable.himalaya , "Himalaya", 150))
//        data.add(ItemViewModel(R.drawable.bubchen, "Bubchen", 240))
//
//
//        // This will pass the ArrayList to our Adapter
//        val adapter = ItemAdapter(data,this)
//
//        // Setting the Adapter with the recyclerview
//        list.adapter = adapter

    }

    override fun onClick(c: ItemViewModel?) {
        val toast = Toast.makeText(applicationContext, c?.name, Toast.LENGTH_LONG)
        toast.show()
    }
}