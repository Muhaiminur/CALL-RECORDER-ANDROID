package com.muhaiminurabir.recorder4;

import android.app.Activity;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;



public class DatabaseSingleton {
    public static SQLiteDatabase database;

    public static SQLiteDatabase getInstance(Context activity){
        if(database==null)
            database = new DatabaseHandler(activity).getWritableDatabase();
        return database;
    }
}
