package com.seniordesign.theblueplug;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends Activity {
	
	Button submit;
	EditText login;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        
        submit = (Button)findViewById(R.id.button1);
        login = (EditText)findViewById(R.id.editText1);
        
        submit.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View view)
                    {
                        Log.v("Login", login.getText().toString());
                        if("default".equals(login.getText().toString()))
                        {
                        	Log.v("Correct", "Password accepted");
                        	//From here we want to jump to the next activity
                        }else{
                        	Log.v("Incorrect", "Password was incorrect, please try again.");
                        	//Here we want to go back to login screen but show an error message
                        	//Do we need a whole new activity for this?
                        }
                        
                        
                    }
                }
        );
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_login, menu);
        return true;
    }
}
