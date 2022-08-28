package com.example.a_zpharmacy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Baby : AppCompatActivity(),OnCardItemClickListener {
    lateinit var list: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_baby)
        list=findViewById(R.id.recyclerView11)

// this creates a vertical layout Manager
        list.layoutManager = LinearLayoutManager(this)

        // ArrayList of class ItemsViewModel
        val data = ArrayList<CardViewModel>(2)



        data.add(CardViewModel(R.drawable.sho, "Shower Gel" ))
        data.add(CardViewModel(R.drawable.sham, "Shampoo"))


        // This will pass the ArrayList to our Adapter
        val adapter = CardAdapter(data,this)

        // Setting the Adapter with the recyclerview
        list.adapter = adapter

    }

    override fun onClick(c: CardViewModel?) {
        if(c?.name.equals("Shower Gel")){
            val doneIntent = Intent(this,Shower_Gel::class.java)
            startActivity(doneIntent)
        }else if(c?.name.equals("Shampoo")){

            val doneIntent = Intent(this,Shampoo_Baby::class.java)
            startActivity(doneIntent)
        }
    }
}
