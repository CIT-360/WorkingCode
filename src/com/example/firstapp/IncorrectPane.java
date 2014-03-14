package com.example.firstapp;

import java.util.ArrayList;

import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;

public class IncorrectPane extends Activity {
	GridView gridView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
	
		super.onCreate(savedInstanceState);
		setContentView(R.layout.incorrect_answer);
		
		// Intent intent = getIntent();
		
		// gridView = (GridView) findViewById(R.id.cbLayout);
		
		// gridView.setAdapter(new TestAdapter(getApplicationContext()));
		// GridView gridView = new GridView (this);
		// setContentView(gridView);
		/*final Button answer1Button = (Button) findViewById(R.id.button4);
		answer1Button.setOnClickListener(
		new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent userCreationIntent = new Intent(v.getContext(),OpenTestPane.class);
				startActivityForResult(userCreationIntent, 0);
			}
		});

		final Button answer2Button = (Button) findViewById(R.id.button5);
		answer2Button.setOnClickListener(
		new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent userCreationIntent = new Intent(v.getContext(),OpenTestPane.class);
				startActivityForResult(userCreationIntent, 0);
			}
		});*/
		
		
		/*gridView.setOnItemClickListener(new OnItemClickListener() {
			public void onItemClick(AdapterView parentView, View iv, int position, long id) {
				Toast.makeText(getApplicationContext(), ((TextView) iv.findViewById(R.id.label)).getText(), Toast.LENGTH_LONG).show();
			}
			
		});*/
	}
	
}

