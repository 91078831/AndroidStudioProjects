package com.example.palmdigital.botton02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import static android.R.attr.id;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonObject1 = (Button) findViewById(R.id.buttonMyButton1);
        buttonObject1.setOnClickListener(this); // this refers to this class
        // end of onClick

        public void onClick(View View)
     {
         Log.i("info", "Hey, you pressed Button1");

         Toast.makeText(MainActivity.this, "You pressed Button1", Toast.LENGTH_SHORT).show();

     }

    }
}
