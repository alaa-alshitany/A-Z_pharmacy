package com.example.a_zpharmacy.database

import android.annotation.SuppressLint
import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.os.DropBoxManager

class DatabaseHolder(context: Context) :SQLiteOpenHelper(context, DB_NAME ,null, DB_VERSION) {
    companion object{
        private val DB_NAME="AZ pharmacy"
        private val DB_VERSION = 1

        private val TABLE01_NAME="CREAMS"
        private val COL01_ID="id"
        private val COL01_NAME="name"
        private val COL01_PRISE="prise"


        private val TABLE02_NAME="LIP_STICK"
        private val COL02_ID="id"
        private val COL02_NAME="name"
        private val COL02_PRISE="prise"


        private val TABLE03_NAME="TABLETS"
        private val COL03_ID="id"
        private val COL03_NAME="name"
        private val COL03_PRISE="prise"

        private val TABLE04_NAME="MASCARA"
        private val COL04_ID="id"
        private val COL04_NAME="name"
        private val COL04_PRISE="prise"

        private val TABLE05_NAME="LIP_BALM"
        private val COL05_ID="id"
        private val COL05_NAME="name"
        private val COL05_PRISE="prise"


        private val TABLE06_NAME="FOUNDATION"
        private val COL06_ID="id"
        private val COL06_NAME="name"
        private val COL06_PRISE="prise"


        private val TABLE07_NAME="OINTMENTS"
        private val COL07_ID="id"
        private val COL07_NAME="name"
        private val COL07_PRISE="prise"


        private val TABLE08_NAME="SOLUTION"
        private val COL08_ID="id"
        private val COL08_NAME="name"
        private val COL08_PRISE="prise"


        private val TABLE09_NAME="OIL"
        private val COL09_ID="id"
        private val COL09_NAME="name"
        private val COL09_PRISE="prise"


        private val TABLE10_NAME="SHOWER_GEL"
        private val COL10_ID="id"
        private val COL10_NAME="name"
        private val COL10_PRISE="prise"


        private val TABLE11_NAME="SHAMPOO"
        private val COL11_ID="id"
        private val COL11_NAME="name"
        private val COL11_PRISE="prise"


    }

    override fun onCreate(p0: SQLiteDatabase?) {

        val CREATE_TABLE01 =
            "CREATE TABLE $TABLE01_NAME($COL01_ID INTEGER PRIMARY KEY,$COL01_NAME TEXT,$COL01_PRISE TEXT);"
        val CREATE_TABLE02 =
            "CREATE TABLE $TABLE02_NAME($COL02_ID INTEGER PRIMARY KEY,$COL02_NAME TEXT,$COL02_PRISE TEXT);"
        val CREATE_TABLE03 =
            "CREATE TABLE $TABLE03_NAME($COL03_ID INTEGER PRIMARY KEY,$COL03_NAME TEXT,$COL03_PRISE TEXT);"
        val CREATE_TABLE04 =
            "CREATE TABLE $TABLE04_NAME($COL04_ID INTEGER PRIMARY KEY,$COL04_NAME TEXT,$COL04_PRISE TEXT);"
        val CREATE_TABLE05 =
            "CREATE TABLE $TABLE05_NAME($COL05_ID INTEGER PRIMARY KEY,$COL05_NAME TEXT,$COL05_PRISE TEXT);"
        val CREATE_TABLE06 =
            "CREATE TABLE $TABLE06_NAME($COL06_ID INTEGER PRIMARY KEY,$COL06_NAME TEXT,$COL06_PRISE TEXT);"
        val CREATE_TABLE07 =
            "CREATE TABLE $TABLE07_NAME($COL07_ID INTEGER PRIMARY KEY,$COL07_NAME TEXT,$COL07_PRISE TEXT);"
        val CREATE_TABLE08 =
            "CREATE TABLE $TABLE08_NAME($COL08_ID INTEGER PRIMARY KEY,$COL08_NAME TEXT,$COL08_PRISE TEXT);"
        val CREATE_TABLE09 =
            "CREATE TABLE $TABLE09_NAME($COL09_ID INTEGER PRIMARY KEY,$COL09_NAME TEXT,$COL09_PRISE TEXT);"
        val CREATE_TABLE10 =
            "CREATE TABLE $TABLE10_NAME($COL10_ID INTEGER PRIMARY KEY,$COL10_NAME TEXT,$COL10_PRISE TEXT);"
        val CREATE_TABLE11 =
            "CREATE TABLE $TABLE11_NAME($COL11_ID INTEGER PRIMARY KEY,$COL11_NAME TEXT,$COL11_PRISE TEXT);"
        p0?.execSQL(CREATE_TABLE01)
        p0?.execSQL(CREATE_TABLE02)
        p0?.execSQL(CREATE_TABLE03)
        p0?.execSQL(CREATE_TABLE04)
        p0?.execSQL(CREATE_TABLE05)
        p0?.execSQL(CREATE_TABLE06)
        p0?.execSQL(CREATE_TABLE07)
        p0?.execSQL(CREATE_TABLE08)
        p0?.execSQL(CREATE_TABLE09)
        p0?.execSQL(CREATE_TABLE10)
        p0?.execSQL(CREATE_TABLE11)
    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {
        val DROP_TABLE01 ="DROP TABLE IF EXISTS $TABLE01_NAME"
        val DROP_TABLE02 ="DROP TABLE IF EXISTS $TABLE02_NAME"
        val DROP_TABLE03 ="DROP TABLE IF EXISTS $TABLE03_NAME"
        val DROP_TABLE04 ="DROP TABLE IF EXISTS $TABLE04_NAME"
        val DROP_TABLE05 ="DROP TABLE IF EXISTS $TABLE05_NAME"
        val DROP_TABLE06 ="DROP TABLE IF EXISTS $TABLE06_NAME"
        val DROP_TABLE07 ="DROP TABLE IF EXISTS $TABLE07_NAME"
        val DROP_TABLE08 ="DROP TABLE IF EXISTS $TABLE08_NAME"
        val DROP_TABLE09 ="DROP TABLE IF EXISTS $TABLE09_NAME"
        val DROP_TABLE10 ="DROP TABLE IF EXISTS $TABLE10_NAME"
        val DROP_TABLE11 ="DROP TABLE IF EXISTS $TABLE11_NAME"
        p0?.execSQL(DROP_TABLE01)
        p0?.execSQL(DROP_TABLE02)
        p0?.execSQL(DROP_TABLE03)
        p0?.execSQL(DROP_TABLE04)
        p0?.execSQL(DROP_TABLE05)
        p0?.execSQL(DROP_TABLE06)
        p0?.execSQL(DROP_TABLE07)
        p0?.execSQL(DROP_TABLE08)
        p0?.execSQL(DROP_TABLE09)
        p0?.execSQL(DROP_TABLE10)
        p0?.execSQL(DROP_TABLE11)

        onCreate(p0)
    }

    fun addcream(cream: data) :Boolean{

        val Db = this.writableDatabase
        val values = ContentValues()
        values.put(COL01_NAME,cream.name)
        values.put(COL01_PRISE,cream.price)
        val success = Db.insert(TABLE01_NAME,null,values)
        Db.close()
        return Integer.parseInt("$success") !=-1


    }
    fun addlipstick(lip_stick: data) :Boolean{

        val Db = this.writableDatabase
        val values = ContentValues()
        values.put(COL02_NAME,lip_stick.name)
        values.put(COL02_PRISE,lip_stick.price)
        val success = Db.insert(TABLE02_NAME,null,values)
        Db.close()
        return Integer.parseInt("$success") !=-1


    }
    fun addtablets(tablets: data) :Boolean{

        val Db = this.writableDatabase
        val values = ContentValues()
        values.put(COL03_NAME,tablets.name)
        values.put(COL03_PRISE,tablets.price)
        val success = Db.insert(TABLE03_NAME,null,values)
        Db.close()
        return Integer.parseInt("$success") !=-1


    }
    fun addmascara(mascara: data) :Boolean{

        val Db = this.writableDatabase
        val values = ContentValues()
        values.put(COL04_NAME,mascara.name)
        values.put(COL04_PRISE,mascara.price)
        val success = Db.insert(TABLE04_NAME,null,values)
        Db.close()
        return Integer.parseInt("$success") !=-1


    }
    fun addlipbalm(lipbalm: data) :Boolean{

        val Db = this.writableDatabase
        val values = ContentValues()
        values.put(COL05_NAME,lipbalm.name)
        values.put(COL05_PRISE,lipbalm.price)
        val success = Db.insert(TABLE05_NAME,null,values)
        Db.close()
        return Integer.parseInt("$success") !=-1


    }
    fun addfoundation(foundation: data) :Boolean{

        val Db = this.writableDatabase
        val values = ContentValues()
        values.put(COL06_NAME,foundation.name)
        values.put(COL06_PRISE,foundation.price)
        val success = Db.insert(TABLE06_NAME,null,values)
        Db.close()
        return Integer.parseInt("$success") !=-1


    }
    fun addointments(ointments: data) :Boolean{

        val Db = this.writableDatabase
        val values = ContentValues()
        values.put(COL07_NAME,ointments.name)
        values.put(COL07_PRISE,ointments.price)
        val success = Db.insert(TABLE07_NAME,null,values)
        Db.close()
        return Integer.parseInt("$success") !=-1


    }
    fun addsolution(solution: data) :Boolean{

        val Db = this.writableDatabase
        val values = ContentValues()
        values.put(COL08_NAME,solution.name)
        values.put(COL08_PRISE,solution.price)
        val success = Db.insert(TABLE08_NAME,null,values)
        Db.close()
        return Integer.parseInt("$success") !=-1


    }
    fun addoil(oil: data) :Boolean{

        val Db = this.writableDatabase
        val values = ContentValues()
        values.put(COL09_NAME,oil.name)
        values.put(COL09_PRISE,oil.price)
        val success = Db.insert(TABLE09_NAME,null,values)
        Db.close()
        return Integer.parseInt("$success") !=-1


    }
    fun addshower(shower: data) :Boolean{

        val Db = this.writableDatabase
        val values = ContentValues()
        values.put(COL10_NAME,shower.name)
        values.put(COL10_PRISE,shower.price)
        val success = Db.insert(TABLE10_NAME,null,values)
        Db.close()
        return Integer.parseInt("$success") !=-1


    }
    fun addshampoo(shampoo: data) :Boolean{

        val Db = this.writableDatabase
        val values = ContentValues()
        values.put(COL11_NAME,shampoo.name)
        values.put(COL11_PRISE,shampoo.price)
        val success = Db.insert(TABLE11_NAME,null,values)
        Db.close()
        return Integer.parseInt("$success") !=-1


    }



    @SuppressLint("Range")
    fun getcream():List<data>
    {
        val list = ArrayList<data>()
        val Db = writableDatabase
        val selectQuery = "SELECT *FROM $TABLE01_NAME"
        val cursor = Db.rawQuery(selectQuery,null)
        if (cursor!=null)
        {
            if (cursor.moveToFirst())
            {
                do{
                    val cream = data()
                    cream.id=Integer.parseInt(cursor.getString(cursor.getColumnIndex(COL01_ID)))
                    cream.name=cursor.getString(cursor.getColumnIndex(COL01_NAME))
                    cream.price=cursor.getString(cursor.getColumnIndex(COL01_PRISE))
                    list.add(cream)

                }
                while (cursor.moveToNext())
            }

        }
        cursor.close()
        return list




    }
    @SuppressLint("Range")
    fun getlipstick():List<data>
    {
        val list = ArrayList<data>()
        val Db = writableDatabase
        val selectQuery = "SELECT *FROM $TABLE02_NAME"
        val cursor = Db.rawQuery(selectQuery,null)
        if (cursor!=null)
        {
            if (cursor.moveToFirst())
            {
                do{
                    val lip_stick = data()
                    lip_stick.id=Integer.parseInt(cursor.getString(cursor.getColumnIndex(COL02_ID)))
                    lip_stick.name=cursor.getString(cursor.getColumnIndex(COL02_NAME))
                    lip_stick.price=cursor.getString(cursor.getColumnIndex(COL02_PRISE))
                    list.add(lip_stick)

                }
                while (cursor.moveToNext())
            }

        }
        cursor.close()
        return list




    }
    @SuppressLint("Range")
    fun gettablets():List<data>
    {
        val list = ArrayList<data>()
        val Db = writableDatabase
        val selectQuery = "SELECT *FROM $TABLE03_NAME"
        val cursor = Db.rawQuery(selectQuery,null)
        if (cursor!=null)
        {
            if (cursor.moveToFirst())
            {
                do{
                    val lip_stick = data()
                    lip_stick.id=Integer.parseInt(cursor.getString(cursor.getColumnIndex(COL03_ID)))
                    lip_stick.name=cursor.getString(cursor.getColumnIndex(COL03_NAME))
                    lip_stick.price=cursor.getString(cursor.getColumnIndex(COL03_PRISE))
                    list.add(lip_stick)

                }
                while (cursor.moveToNext())
            }

        }
        cursor.close()
        return list




    }
    @SuppressLint("Range")
    fun getmascara():List<data>
    {
        val list = ArrayList<data>()
        val Db = writableDatabase
        val selectQuery = "SELECT *FROM $TABLE04_NAME"
        val cursor = Db.rawQuery(selectQuery,null)
        if (cursor!=null)
        {
            if (cursor.moveToFirst())
            {
                do{
                    val lip_stick = data()
                    lip_stick.id=Integer.parseInt(cursor.getString(cursor.getColumnIndex(COL04_ID)))
                    lip_stick.name=cursor.getString(cursor.getColumnIndex(COL04_NAME))
                    lip_stick.price=cursor.getString(cursor.getColumnIndex(COL04_PRISE))
                    list.add(lip_stick)

                }
                while (cursor.moveToNext())
            }

        }
        cursor.close()
        return list




    }
    @SuppressLint("Range")
    fun getlipbalm():List<data>
    {
        val list = ArrayList<data>()
        val Db = writableDatabase
        val selectQuery = "SELECT *FROM $TABLE05_NAME"
        val cursor = Db.rawQuery(selectQuery,null)
        if (cursor!=null)
        {
            if (cursor.moveToFirst())
            {
                do{
                    val lip_stick = data()
                    lip_stick.id=Integer.parseInt(cursor.getString(cursor.getColumnIndex(COL05_ID)))
                    lip_stick.name=cursor.getString(cursor.getColumnIndex(COL05_NAME))
                    lip_stick.price=cursor.getString(cursor.getColumnIndex(COL05_PRISE))
                    list.add(lip_stick)

                }
                while (cursor.moveToNext())
            }

        }
        cursor.close()
        return list




    }
    @SuppressLint("Range")
    fun getfoundation():List<data>
    {
        val list = ArrayList<data>()
        val Db = writableDatabase
        val selectQuery = "SELECT *FROM $TABLE06_NAME"
        val cursor = Db.rawQuery(selectQuery,null)
        if (cursor!=null)
        {
            if (cursor.moveToFirst())
            {
                do{
                    val lip_stick = data()
                    lip_stick.id=Integer.parseInt(cursor.getString(cursor.getColumnIndex(COL06_ID)))
                    lip_stick.name=cursor.getString(cursor.getColumnIndex(COL06_NAME))
                    lip_stick.price=cursor.getString(cursor.getColumnIndex(COL06_PRISE))
                    list.add(lip_stick)

                }
                while (cursor.moveToNext())
            }

        }
        cursor.close()
        return list




    }
    @SuppressLint("Range")
    fun getointments():List<data>
    {
        val list = ArrayList<data>()
        val Db = writableDatabase
        val selectQuery = "SELECT *FROM $TABLE07_NAME"
        val cursor = Db.rawQuery(selectQuery,null)
        if (cursor!=null)
        {
            if (cursor.moveToFirst())
            {
                do{
                    val lip_stick = data()
                    lip_stick.id=Integer.parseInt(cursor.getString(cursor.getColumnIndex(COL07_ID)))
                    lip_stick.name=cursor.getString(cursor.getColumnIndex(COL07_NAME))
                    lip_stick.price=cursor.getString(cursor.getColumnIndex(COL07_PRISE))
                    list.add(lip_stick)

                }
                while (cursor.moveToNext())
            }

        }
        cursor.close()
        return list




    }
    @SuppressLint("Range")
    fun getselution():List<data>
    {
        val list = ArrayList<data>()
        val Db = writableDatabase
        val selectQuery = "SELECT *FROM $TABLE08_NAME"
        val cursor = Db.rawQuery(selectQuery,null)
        if (cursor!=null)
        {
            if (cursor.moveToFirst())
            {
                do{
                    val lip_stick = data()
                    lip_stick.id=Integer.parseInt(cursor.getString(cursor.getColumnIndex(COL08_ID)))
                    lip_stick.name=cursor.getString(cursor.getColumnIndex(COL08_NAME))
                    lip_stick.price=cursor.getString(cursor.getColumnIndex(COL08_PRISE))
                    list.add(lip_stick)

                }
                while (cursor.moveToNext())
            }

        }
        cursor.close()
        return list




    }
    @SuppressLint("Range")
    fun getoit():List<data>
    {
        val list = ArrayList<data>()
        val Db = writableDatabase
        val selectQuery = "SELECT *FROM $TABLE09_NAME"
        val cursor = Db.rawQuery(selectQuery,null)
        if (cursor!=null)
        {
            if (cursor.moveToFirst())
            {
                do{
                    val lip_stick = data()
                    lip_stick.id=Integer.parseInt(cursor.getString(cursor.getColumnIndex(COL09_ID)))
                    lip_stick.name=cursor.getString(cursor.getColumnIndex(COL09_NAME))
                    lip_stick.price=cursor.getString(cursor.getColumnIndex(COL09_PRISE))
                    list.add(lip_stick)

                }
                while (cursor.moveToNext())
            }

        }
        cursor.close()
        return list




    }
    @SuppressLint("Range")
    fun getshowergel():List<data>
    {
        val list = ArrayList<data>()
        val Db = writableDatabase
        val selectQuery = "SELECT *FROM $TABLE10_NAME"
        val cursor = Db.rawQuery(selectQuery,null)
        if (cursor!=null)
        {
            if (cursor.moveToFirst())
            {
                do{
                    val lip_stick = data()
                    lip_stick.id=Integer.parseInt(cursor.getString(cursor.getColumnIndex(COL10_ID)))
                    lip_stick.name=cursor.getString(cursor.getColumnIndex(COL10_NAME))
                    lip_stick.price=cursor.getString(cursor.getColumnIndex(COL10_PRISE))
                    list.add(lip_stick)

                }
                while (cursor.moveToNext())
            }

        }
        cursor.close()
        return list




    }
    @SuppressLint("Range")
    fun getshampoo():List<data>
    {
        val list = ArrayList<data>()
        val Db = writableDatabase
        val selectQuery = "SELECT *FROM $TABLE11_NAME"
        val cursor = Db.rawQuery(selectQuery,null)
        if (cursor!=null)
        {
            if (cursor.moveToFirst())
            {
                do{
                    val lip_stick = data()
                    lip_stick.id=Integer.parseInt(cursor.getString(cursor.getColumnIndex(COL11_ID)))
                    lip_stick.name=cursor.getString(cursor.getColumnIndex(COL11_NAME))
                    lip_stick.price=cursor.getString(cursor.getColumnIndex(COL11_PRISE))
                    list.add(lip_stick)

                }
                while (cursor.moveToNext())
            }

        }
        cursor.close()
        return list




    }


}