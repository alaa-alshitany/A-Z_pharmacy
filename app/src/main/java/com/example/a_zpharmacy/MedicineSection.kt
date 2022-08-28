package com.example.a_zpharmacy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MedicineSection : AppCompatActivity(),OnCardItemClickListener {
    lateinit var list: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_medicine_section)

        list=findViewById(R.id.recyclerView11)

// this creates a vertical layout Manager
        list.layoutManager = LinearLayoutManager(this)

        // ArrayList of class ItemsViewModel
        val data = ArrayList<CardViewModel>(4)



        data.add(CardViewModel(R.drawable.tablets, "Tablets" ))
        data.add(CardViewModel(R.drawable.injections, "Injections"))
        data.add(CardViewModel(R.drawable.ointments, "Ointments" ))
        data.add(CardViewModel(R.drawable.solutions, "Solutions" ))


        // This will pass the ArrayList to our Adapter
        val adapter = CardAdapter(data,this)

        // Setting the Adapter with the recyclerview
        list.adapter = adapter

    }

    override fun onClick(c: CardViewModel?) {
        if(c?.name.equals("Tablets")){
            val doneIntent = Intent(this,Tablets::class.java)
            startActivity(doneIntent)
        }else if(c?.name.equals("Injections")){
            val doneIntent = Intent(this,Injections::class.java)
            startActivity(doneIntent)
        }else if(c?.name.equals("Ointments")) {
            val doneIntent = Intent(this, Ointments::class.java)
            startActivity(doneIntent)
        }else if(c?.name.equals("Solutions")){
            val doneIntent = Intent(this,Solutions::class.java)
            startActivity(doneIntent)
        }
    }
}