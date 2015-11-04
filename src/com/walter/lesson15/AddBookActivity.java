package com.walter.lesson15;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class AddBookActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_add_book);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.add_book, menu);
		return true;
	}
	public void add(View v)
	{
		Database db=new Database(this);
		db.save_book("Man Of The People", "Chinua Achebe");
		db.save_book("The River Between", "Chinua Achebe");
		db.save_book("Animal Farm", "Geoge Orwel");
		db.save_book("Bourne Identity", "Robert Ludlum");
		db.save_book("Bourne Supremacy", "Robert Ludlum");
		db.save_book("Bourne Legacy", "Robert Ludlum");
		db.save_book("Bourne Ultimutum", "Robert Ludlum");
		db.save_book("The Voter", "Chinua Achebe");
	}
	public void fetch(View v)
	{
	   startActivity(new Intent(this,MainActivity.class));	
	}
}
