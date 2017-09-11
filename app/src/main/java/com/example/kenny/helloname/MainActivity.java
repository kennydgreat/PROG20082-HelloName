package com.example.kenny.helloname;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    TextView txtDisplay;
    EditText editText;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // getting the views (needs to be after setContentView)
        txtDisplay = findViewById(R.id.txtDisplay);
        editText = findViewById(R.id.editTextName);
    }

    public void displayName(View view){
        //txtDisplay.setText(getString(R.id.editTextName, getResources()) );
        String textDisplayFormateString = getResources().getString(R.string.displayNameformateString, editText.getText());
        txtDisplay.setText(textDisplayFormateString);
        Toast.makeText(this, R.string.ToastString, Toast.LENGTH_LONG).show();
        // "this" referes to the instance of the context or screen
    }
}
