package com.example.a_zpharmacy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MakeUpSection : AppCompatActivity(),OnCardItemClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var list: RecyclerView
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_make_up_section)

        list=findViewById(R.id.recyclerView11)

// this creates a vertical layout Manager
        list.layoutManager = LinearLayoutManager(this)

        // ArrayList of class ItemsViewModel
        val data = ArrayList<CardViewModel>(4)



        data.add(CardViewModel(R.drawable.img_2, "Foundation" ))
        data.add(CardViewModel(R.drawable.img_4, "Lip Stick"))
        data.add(CardViewModel(R.drawable.img, "lip Balm" ))
        data.add(CardViewModel(R.drawable.mascara, "Mascara" ))


        // This will pass the ArrayList to our Adapter
        val adapter = CardAdapter(data,this)

        // Setting the Adapter with the recyclerview
        list.adapter = adapter

    }

    override fun onClick(c: CardViewModel?) {
        if(c?.name.equals("Foundation")){
            val doneIntent = Intent(this,Foundation::class.java)
            startActivity(doneIntent)
        }else if(c?.name.equals("Lip Stick")){
            val doneIntent = Intent(this,LipStick::class.java)
            startActivity(doneIntent)
        }else if(c?.name.equals("lip Balm")) {
            val doneIntent = Intent(this, LipBalm::class.java)
            startActivity(doneIntent)
        }else if(c?.name.equals("Mascara")){
            val doneIntent = Intent(this,Mascara::class.java)
            startActivity(doneIntent)
        }
    }
}