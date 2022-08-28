package com.example.a_zpharmacy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.a_zpharmacy.database.DatabaseHolder
import com.example.a_zpharmacy.database.data

class Oils : AppCompatActivity() ,OnItemRecycleClickListener{
    lateinit var list: RecyclerView
    var cream_list :List<data> = ArrayList<data>()
    var Db : DatabaseHolder?=null
    var adapter : ItemAdapter?=null
    var layoutmanager: LinearLayoutManager ?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_oils)
        list = findViewById(R.id.recyclerView10)

       Db = DatabaseHolder(this)

        add("Jojoba Oil", "230")
        add("Jasmine Black Castor Oil", "320")
        add("Marula Oils Bader Cream", "450")
        add("Briogeo Oil", "640")
        get()


    }
    override fun onClick(c: ItemViewModel?) {
        val toast = Toast.makeText(applicationContext, c?.name, Toast.LENGTH_LONG)
        toast.show()
    }
    fun get()
    {
        cream_list = Db!!.getoit()
        adapter = ItemAdapter(cream_list,applicationContext)
        layoutmanager = LinearLayoutManager(applicationContext)
        list.layoutManager=layoutmanager
        list.adapter=adapter
        adapter?.notifyDataSetChanged()




    }
    fun add(name:String , price:String){
        var success :Boolean= false
        val data = data()
        data.name=name
        data.price=price

        success=Db?.addoil(data) as Boolean
        if (success)
        {

        }else{
            Toast.makeText(this,"Some Error ..!",Toast.LENGTH_SHORT).show()
        }


    }
}