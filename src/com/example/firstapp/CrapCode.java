/* android:layout_centerHorizontal="true"
        android:layout_centerInParent="true"
        android:layout_centerVertical="true"
        android:layout_marginTop="15sp"
        android:layout_width="150dp"
        android:layout_height="225dp"
        android:layout_width="150dp"
        android:layout_height="150dp"

        <TextView
        android:id="@+id/textView1"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="TextView" />

    <CheckBox
        android:id="@+id/checkBox1"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="CheckBox" />

    <CheckBox
        android:id="@+id/checkBox2"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="CheckBox" />

    <CheckBox
        android:id="@+id/checkBox3"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="CheckBox" />

    <CheckBox
        android:id="@+id/checkBox4"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="CheckBox" />

    <RadioButton
        android:id="@+id/radioButton1"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="RadioButton" />

    <RadioButton
        android:id="@+id/radioButton2"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="RadioButton" />

    <RadioButton
        android:id="@+id/radioButton3"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="RadioButton" />

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

public class CBTestPane extends Activity {
	// GridView gridView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
	
		super.onCreate(savedInstanceState);
		setContentView(R.layout.cbquiz);
		
		// gridView = (GridView) findViewById(R.id.cbLayout);
		// gridView.setAdapter(new ImageAdapter(this, null));
		// GridView gridView = new GridView (this);
		// setContentView(gridView);
		final Button answer1Button = (Button) findViewById(R.id.button4);
		answer1Button.setOnClickListener(
		new View.OnClickListener() {
			
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
	}
}

*/