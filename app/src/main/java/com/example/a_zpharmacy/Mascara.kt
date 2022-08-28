package com.example.a_zpharmacy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.a_zpharmacy.database.DatabaseHolder
import com.example.a_zpharmacy.database.data

class Mascara : AppCompatActivity(),OnItemRecycleClickListener {
    lateinit var list: RecyclerView
    var cream_list :List<data> = ArrayList<data>()
    var Db : DatabaseHolder?=null
    var adapter : ItemAdapter?=null
    var layoutmanager: LinearLayoutManager ?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mascara)
        list = findViewById(R.id.recyclerView5)

        // this creates a vertical layout Manager
        Db = DatabaseHolder(this)

        add("Oreflam Mascara","130")
        add("Max Factor Mascara","130")
        add("Mac Mascara","250")
        add("Maybellin Mascara","340")
        add("Remmil Mascara","190")


        // This will pass the ArrayList to our Adapter

    }

    override fun onClick(c: ItemViewModel?) {
        val toast = Toast.makeText(applicationContext, c?.name, Toast.LENGTH_LONG)
        toast.show()
    }
    fun get()
    {
        cream_list = Db!!.getmascara()
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

        success=Db?.addmascara(data) as Boolean
        if (success)
        {

        }else{
            Toast.makeText(this,"Some Error ..!",Toast.LENGTH_SHORT).show()
        }


    }
}