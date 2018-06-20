package com.digitalhouse.myfirstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public final static String TEXT_LOG = "MainActivity";

    Button button;
    TextView textView;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.buttonAccept);
        textView = (TextView) findViewById(R.id.textViewName);
        editText = (EditText) findViewById(R.id.editTextName);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                awesomeButtonClicked();
            }
        });

        Log.v(TEXT_LOG, "onCreate");
        Toast.makeText(this, "App Started", Toast.LENGTH_LONG).show();
    }

    private void awesomeButtonClicked() {
        Toast.makeText(this, editText.getText(), Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        setContentView(R.layout.activity_main);

        Log.v(TEXT_LOG, "onStop");
        Toast.makeText(this, "App Stopped", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        setContentView(R.layout.activity_main);

        Log.v(TEXT_LOG, "onDestroy");
        Toast.makeText(this, "App Closed", Toast.LENGTH_LONG).show();
    }
}
