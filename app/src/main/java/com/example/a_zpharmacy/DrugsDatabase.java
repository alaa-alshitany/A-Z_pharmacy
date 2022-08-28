package com.example.a_zpharmacy;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;

public class DrugsDatabase extends SQLiteOpenHelper {

    public static final String DB_NAME="Drugs";
    public static final int DB_VERSION=1;
    public DrugsDatabase(Context context){
        super(context,DB_NAME,null,DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("CREATE TABLE Drugs(id INTEGER PRIMARY KEY AUTOINCREMENT, title TEXT , price TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS Drugs");
        onCreate(sqLiteDatabase);
    }


    public boolean insertDrug(ItemViewModel drug){
        SQLiteDatabase dp=getWritableDatabase();
        ContentValues values=new ContentValues();
        values.put("title",drug.getName());
        values.put("price",drug.getPrice());
        long r = dp.insert("Drugs",null,values);
        return r!=-1;
    }

    public long getDrugsCount(){
        SQLiteDatabase dp=getReadableDatabase();
        return DatabaseUtils.queryNumEntries(dp,"Drugs");
    }

    public boolean deleteDrug(ItemViewModel drug){
        SQLiteDatabase dp=getWritableDatabase();
        String args[]={drug.getName()};
        int result=dp.delete("Drugs", "title=?",args);
        return (result>0);
    }

    public ArrayList<ItemViewModel> getAllDrugs(){
        ArrayList<ItemViewModel>allDrugs=new ArrayList<>();
        SQLiteDatabase dp=getReadableDatabase();
        Cursor c=dp.rawQuery("SELECT * from Drugs",null );
        if(c.moveToFirst()){
            do{
                String title=c.getString(1);
                String price=c.getString(2);
                ItemViewModel drug=new ItemViewModel(1,title,Integer.parseInt(price));
                allDrugs.add(drug);
            }while (c.moveToNext());
        }
        return allDrugs;
    }

    public boolean updateDrug(ItemViewModel drug){
        SQLiteDatabase db=getWritableDatabase();
        ContentValues values=new ContentValues();
        values.put("title",drug.getName());
        values.put("price",drug.getPrice());
        String args[]={drug.getName()};
        int r = db.update("Drugs",values,"title=?",args);
        return r>0;
    }

    public ItemViewModel getDrug(String name){
        ItemViewModel n = null;
        SQLiteDatabase dp=getReadableDatabase();
        Cursor c=dp.rawQuery("SELECT * from Drugs",null );
        if(c.moveToFirst()){
            do{
                if(name.equals(c.getString(1))){
                    n=new ItemViewModel(1,c.getString(1),Integer.parseInt(c.getString(2)));
                    break;
                }
            }while (c.moveToNext());
        }
        return n;
    }

}
