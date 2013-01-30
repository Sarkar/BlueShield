package com.test.activities;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.app.ListActivity;
import android.content.Intent;

public class ButtonPage extends ListActivity{
	public void onCreate(Bundle savedInstanceState) {
	     super.onCreate(savedInstanceState);
	     setContentView(R.layout.buttonpage);
	     
	     Button page1 = (Button) findViewById(R.id.Button01);
	     page1.setOnClickListener(new View.OnClickListener() {
	             public void onClick(View view) {
	                 Intent myIntent = new Intent(view.getContext(), Page1.class);
	                 startActivityForResult(myIntent, 0);
	             }

	     });
	     
	     Button page2 = (Button) findViewById(R.id.Button02);
	     page2.setOnClickListener(new View.OnClickListener() {
	             public void onClick(View view) {
	                 Intent myIntent = new Intent(view.getContext(), Page2.class);
	                 startActivityForResult(myIntent, 0);
	             }

	     });
	     
	     Button page3 = (Button) findViewById(R.id.Button03);
	     page3.setOnClickListener(new View.OnClickListener() {
	             public void onClick(View view) {
	                 Intent myIntent = new Intent(view.getContext(), Page3.class);
	                 startActivityForResult(myIntent, 0);
	             }

	     });
	     
	     Button listViewPage = (Button) findViewById(R.id.Button04);
	     listViewPage.setOnClickListener(new View.OnClickListener() {
	             public void onClick(View view) {
	                 Intent myIntent = new Intent(view.getContext(), HomeListView.class);
	                 startActivityForResult(myIntent, 0);
	             }

	     });
	}
}
