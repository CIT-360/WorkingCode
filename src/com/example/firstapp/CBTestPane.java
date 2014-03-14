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
import android.widget.CheckBox;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;

public class CBTestPane extends Activity {
	// GridView gridView;
	CheckBox checkbox;
	RadioButton rbutton, rbutton1, rbutton2, rbutton3, rbutton4, rbutton5, rbutton6;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
	
		super.onCreate(savedInstanceState);
		setContentView(R.layout.cbquiz);
		
		checkbox = (CheckBox) findViewById(R.id.checkBox1);
		checkbox.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if (((CheckBox) v).isChecked()){
					Toast.makeText(CBTestPane.this, "Selected", Toast.LENGTH_LONG).show();
		} else{
			Toast.makeText(CBTestPane.this, "Not selected", Toast.LENGTH_LONG).show();
		}
				
			}
		});
	
		final OnClickListener radio_listener = new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				rbutton = (RadioButton) v;
				Toast.makeText(CBTestPane.this, rbutton.getText(), Toast.LENGTH_LONG).show();
					
				}
				
			
		};
	
		rbutton1 = (RadioButton) findViewById(R.id.radioButton1);	
		rbutton1.setOnClickListener (radio_listener);
		rbutton2 = (RadioButton) findViewById(R.id.radioButton2);	
		rbutton2.setOnClickListener (radio_listener);
		rbutton3 = (RadioButton) findViewById(R.id.radioButton3);	
		rbutton3.setOnClickListener (radio_listener);
		rbutton4 = (RadioButton) findViewById(R.id.radioButton4);	
		rbutton4.setOnClickListener (radio_listener);
		rbutton5 = (RadioButton) findViewById(R.id.radioButton5);	
		rbutton5.setOnClickListener (radio_listener);
		rbutton6 = (RadioButton) findViewById(R.id.radioButton6);	
		rbutton6.setOnClickListener (radio_listener);
};
}
