package com.example.a_zpharmacy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class SkinCareSection : AppCompatActivity(),OnCardItemClickListener {
    lateinit var list: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skin_care_section)
        list=findViewById(R.id.recyclerView11)

// this creates a vertical layout Manager
        list.layoutManager = LinearLayoutManager(this)

        // ArrayList of class ItemsViewModel
        val data = ArrayList<CardViewModel>(4)



        data.add(CardViewModel(R.drawable.img_5, "Creams" ))
        data.add(CardViewModel(R.drawable.img_7, "Oils"))
        data.add(CardViewModel(R.drawable.shampoo, "Shampoo" ))
        data.add(CardViewModel(R.drawable.serum, "Serum" ))


        // This will pass the ArrayList to our Adapter
        val adapter = CardAdapter(data,this)

        // Setting the Adapter with the recyclerview
        list.adapter = adapter

    }

    override fun onClick(c: CardViewModel?) {
        if(c?.name.equals("Creams")){
            val doneIntent = Intent(this,Creams::class.java)
            startActivity(doneIntent)
        }else if(c?.name.equals("Oils")){
            val doneIntent = Intent(this,Oils::class.java)
            startActivity(doneIntent)
        }else if(c?.name.equals("Shampoo")) {
            val doneIntent = Intent(this, Shampoo::class.java)
            startActivity(doneIntent)
        }else if(c?.name.equals("Serum")){
            val doneIntent = Intent(this,Serum::class.java)
            startActivity(doneIntent)
        }
    }
}
