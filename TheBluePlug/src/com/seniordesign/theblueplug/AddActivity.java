package com.seniordesign.theblueplug;

import android.util.Log;
import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.Menu;

public class AddActivity extends Activity{
	private static final String tag = "AddActivity";
	String message = "seriously java?";
	
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addactivity);
        
        // this is the alert dialog that pops up
        final AlertDialog alertDialog = new AlertDialog.Builder(this)
		.setTitle(R.string.appliances)
        .setMessage(R.string.add)
        .setPositiveButton( R.string.cancel, new AlertDialog.OnClickListener(){
	          public void onClick( DialogInterface dialog, int which){
		         return;
	          }
        })
        .create();
        
        // k, let's show it!
        alertDialog.show();
        
        // and, logging!
        Log.i(tag, message);
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu){
	    getMenuInflater().inflate(R.menu.activity_appliances, menu);
	    return true;
	}
}
