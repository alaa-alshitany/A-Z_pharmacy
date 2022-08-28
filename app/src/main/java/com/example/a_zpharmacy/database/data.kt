package com.example.a_zpharmacy.database

class data {
    var id:Int?=null
    var name:String?=null
    var price :String?=null

     constructor(){}

    constructor(id:Int? , name:String?,price:String?)
    {
        this.id = id
        this.name = name
        this.price=price
    }

}