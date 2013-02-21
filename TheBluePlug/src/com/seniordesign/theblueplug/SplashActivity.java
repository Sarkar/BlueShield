package com.seniordesign.theblueplug;

import java.util.Timer;
import java.util.TimerTask;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;

public class SplashActivity extends Activity {
	private long splashDelay = 5000; //5 seconds
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        
        TimerTask task = new TimerTask()
        {
        	@Override
        	public void run()
        	{
        		finish();
        		Intent login = new Intent().setClass(SplashActivity.this, LoginActivity.class);
        		startActivity(login);
        	}
        };
        
        Timer timer = new Timer();
        timer.schedule(task, splashDelay);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_splash, menu);
        return true;
    }
}
