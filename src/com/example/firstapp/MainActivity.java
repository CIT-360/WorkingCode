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
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;

public class MainActivity extends Activity {
	GridView gridView;
	
	static final String[] COURSE_NAMES = new String[] {"FDCNC 350", "CIT 495", "SOC 330", "ENG 350 R", "SOC 355", "FDCA 201"};
		
	@Override
	protected void onCreate(Bundle savedInstanceState) {
	
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		gridView = (GridView) findViewById(R.id.gridView);
		
		gridView.setAdapter(new ImageAdapter(this, COURSE_NAMES));
		
		gridView.setOnItemClickListener(new OnItemClickListener() {
			public void onItemClick(AdapterView parentView, View iv, int position, long id) {
				Toast.makeText(getApplicationContext(), ((TextView) iv.findViewById(R.id.label)).getText(), 
						Toast.LENGTH_LONG).show();
			}
			
		});
		
		final Button testButton = (Button) findViewById(R.id.button1);
		testButton.setOnClickListener(
		new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent userCreationIntent = new Intent(v.getContext(),OpenTestPane.class);
				startActivityForResult(userCreationIntent, 0);
			}
		});
		
		final Button cbquizButton = (Button) findViewById(R.id.button2);
		cbquizButton.setOnClickListener(
		new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent userCreationIntent = new Intent(v.getContext(),CBTestPane.class);
				startActivityForResult(userCreationIntent, 0);
			}
		});

		final Button loginButton = (Button) findViewById(R.id.button3);
		loginButton.setOnClickListener(
		new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent userCreationIntent = new Intent(v.getContext(),LoginActivity.class);
				startActivityForResult(userCreationIntent, 0);
			}
		});
		
		final Button answer1Button = (Button) findViewById(R.id.button4);
		answer1Button.setOnClickListener(
		new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent userCreationIntent = new Intent(v.getContext(),CorrectPane.class);
				startActivityForResult(userCreationIntent, 0);
			}
		});

		final Button answer2Button = (Button) findViewById(R.id.button5);
		answer2Button.setOnClickListener(
		new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent userCreationIntent = new Intent(v.getContext(),IncorrectPane.class);
				startActivityForResult(userCreationIntent, 0);
			}
		});
		
			
		/*final Button rbquizButton = (Button) findViewById(R.id.button3);
		rbquizButton.setOnClickListener(
		new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent userCreationIntent = new Intent(v.getContext(),OpenTestPane.class);
				startActivityForResult(userCreationIntent, 0);
			}
		});
		
		*/
	//protected void openTest (View view) {
		//Intent intent = new Intent(this, OpenTestPane.class);
		//startActivity(intent);
	//}
	}
}