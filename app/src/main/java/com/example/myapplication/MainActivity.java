package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    EditText editText;
    TextView textView, textView2 , textView3, textViewR ;
    Button buttonINRCAD, buttonCADINR;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       editText = findViewById(R.id.editTextNumber);

       textView = findViewById(R.id.textView);
       textView2 = findViewById(R.id.textView2);
       textView3 = findViewById(R.id.textView3);
       textViewR = findViewById(R.id.textViewR);
       buttonINRCAD = (Button) findViewById(R.id.button3);
       buttonCADINR = (Button) findViewById(R.id.button4);

       buttonINRCAD.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Double convert = Double.parseDouble(editText.getText().toString());
               textViewR.setText(String.format("%.2f CAD", convert / 57.07));
           }
       });

       buttonCADINR.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Double convert1 = Double.parseDouble(editText.getText().toString());
                textViewR.setText(String.format("%.2f INR",convert1*57.07));

           }
       });




    }
}