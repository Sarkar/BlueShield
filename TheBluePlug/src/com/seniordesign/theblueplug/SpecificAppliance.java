package com.seniordesign.theblueplug;

import android.os.Bundle;
import android.app.ActionBar;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class SpecificAppliance extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().requestFeature(Window.FEATURE_ACTION_BAR);
        setContentView(R.layout.activity_specific_appliance);
        ActionBar actionBar = getActionBar();
        actionBar.show();
        
        final String[] words = {"one", "two", "three"};
        
        //Setting up the list view and constructors
        ListView listView = (ListView) findViewById(R.id.listView2);
        listView.setAdapter(new BaseAdapter() {
        	public int getCount(){
        		return words.length;
        	}
        	
        	public Object getItem(int position) {
        		return words[position];
        	}
        	
        	public long getItemId(int position) {
        		return position;
        	}
        	
        	public View getView(int position, View convertView, ViewGroup parent) {
        		LayoutInflater inflater = (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);
        		View view = inflater.inflate(R.layout.list_row2,  null);
        		TextView textView = (TextView) view.findViewById(R.id.TextView2);
        		textView.setText(words[position]);
        		return view;
        	}
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_specific_appliance, menu);
        return true;
    }
}
