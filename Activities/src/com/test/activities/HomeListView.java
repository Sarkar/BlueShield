package com.test.activities;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.app.ListActivity;
import android.content.Intent;
import android.widget.AdapterView.OnItemClickListener;

public class HomeListView extends ListActivity{

	public void onCreate(Bundle savedInstanceState) {
		 //Must always call function for super, which will create a ListActivity
		 super.onCreate(savedInstanceState);
		  
		 //Get Strings from XML file into local array: pages
		 String[] pages = getResources().getStringArray(R.array.pages_array);
		 setListAdapter(new ArrayAdapter<String>(this, R.layout.list_item, pages));
		  
		 //Create a new ListView object, lv
		 ListView lv = getListView();
		 lv.setOnItemClickListener(new OnItemClickListener() {
		  public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
		    
		   Intent myIntent = null;
		    
		   if(((TextView) view).getText().equals("Page 1")){
		    myIntent = new Intent(view.getContext(), Page1.class);
		   }
		    
		   if(((TextView) view).getText().equals("Page 2")){
		    myIntent = new Intent(view.getContext(), Page2.class);
		   }

		   if(((TextView) view).getText().equals("Page 3")){
		    myIntent = new Intent(view.getContext(), Page3.class);
		   }

		   if(((TextView) view).getText().equals("Switch to button mode")){
		    myIntent = new Intent(view.getContext(), ButtonPage.class);
		   }

		   startActivity(myIntent);

		  }
		 });
		}
}
