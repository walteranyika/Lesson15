package com.walter.lesson15;

import android.content.Context;
import android.database.Cursor;
import android.support.v4.widget.CursorAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class CustomAdapter extends CursorAdapter {

	public CustomAdapter(Context context, Cursor c, int flags) {
		super(context, c, flags);
	}

	@Override
	public void bindView(View view , Context context, Cursor cursor) {
       TextView tvTitle=(TextView) view.findViewById(R.id.textView1);
       TextView tvAuthor =(TextView) view.findViewById(R.id.textView2);
       String title=cursor.getString(cursor.getColumnIndexOrThrow("title"));
       String author=cursor.getString(cursor.getColumnIndexOrThrow("author"));
       tvTitle.setText(title);
       tvAuthor.setText(author);
	}

	@Override
	public View newView(Context context, Cursor cursor, ViewGroup parent) {
		
		return LayoutInflater.from(context).inflate(R.layout.list_item_layout, parent);
	}

}
