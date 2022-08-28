package com.example.a_zpharmacy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.a_zpharmacy.database.DatabaseHolder
import com.example.a_zpharmacy.database.data

class Shampoo : AppCompatActivity(),OnItemRecycleClickListener {
    lateinit var list: RecyclerView
    var cream_list :List<data> = ArrayList<data>()
    var Db : DatabaseHolder?=null
    var adapter : ItemAdapter?=null
    var layoutmanager: LinearLayoutManager ?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shampoo)
        list = findViewById(R.id.recyclerView12)

        Db = DatabaseHolder(this)



        add("SunSilk", "90")
        add("Dove", "120")
        add("Tresemma", "450")
        add("Clear Shampo", "140")
        get()
    }

    override fun onClick(c: ItemViewModel?) {
        val toast = Toast.makeText(applicationContext, c?.name, Toast.LENGTH_LONG)
        toast.show()
    }
    fun get()
    {
        cream_list = Db!!.getshampoo()
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

        success=Db?.addshampoo(data) as Boolean
        if (success)
        {

        }else{
            Toast.makeText(this,"Some Error ..!",Toast.LENGTH_SHORT).show()
        }


    }
}