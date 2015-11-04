package com.walter.lesson15;

import java.util.ArrayList;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Database extends SQLiteOpenHelper {

	public Database(Context context) {
		super(context, "library", null, 1);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		String sql = "CREATE TABLE IF NOT EXISTS books( "
					+ "_id INTEGER PRIMARY KEY AUTOINCREMENT,"
					+ "title TEXT NOT NULL,"
					+ "author TEXT NOT NULL)";

		db.execSQL(sql);
	}

	@Override
	public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {
		// TODO Auto-generated method stub

	}

	public void save_book(String title,String author)
	{
		SQLiteDatabase database = this.getWritableDatabase(); 
		ContentValues values = new ContentValues();
        values.put("title",title);
        values.put("author", author);
        database.insert("books", null, values);
        database.close();       
	}
	
	public Cursor fetch_books()
	{
;
        String selectQuery = "SELECT  * FROM books";
        SQLiteDatabase database = this.getWritableDatabase();
        Cursor cursor = database.rawQuery(selectQuery, null);
        return cursor;
		
	}
		
}
