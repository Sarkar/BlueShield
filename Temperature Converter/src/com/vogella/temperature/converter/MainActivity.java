package com.vogella.temperature.converter;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends Activity {
	private EditText text;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = (EditText) findViewById(R.id.editText1);
    }
    
    public void onClick(View view) {
    	String result;
    	
        switch (view.getId()) {
        case R.id.button1:
          RadioButton celsiusButton = (RadioButton) findViewById(R.id.radio0);
          RadioButton fahrenheitButton = (RadioButton) findViewById(R.id.radio1);
          if (text.getText().length() == 0) {
            Toast.makeText(this, "Please enter a valid number",
                Toast.LENGTH_LONG).show();
            return;
          }

          float inputValue = Float.parseFloat(text.getText().toString());
          if (celsiusButton.isChecked()) {
        	result = String.valueOf(convertFahrenheitToCelsius(inputValue));
            text.setText(result);
            celsiusButton.setChecked(false);
            fahrenheitButton.setChecked(true);
          } else {
            result = String.valueOf(convertCelsiusToFahrenheit(inputValue));
            text.setText(result);
            fahrenheitButton.setChecked(false);
            celsiusButton.setChecked(true);
          }
          
          break;
        case R.id.button2:
        	
        }
      }
    
    // Converts to celsius
    private float convertFahrenheitToCelsius(float fahrenheit) {
      return ((fahrenheit - 32) * 5 / 9);
    }
    
 // Converts to fahrenheit
    private float convertCelsiusToFahrenheit(float celsius) {
      return ((celsius * 9) / 5) + 32;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
}
