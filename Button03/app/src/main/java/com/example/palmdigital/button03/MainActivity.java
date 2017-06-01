package com.example.palmdigital.button03;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import static android.R.attr.button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonObject01 = (Button) findViewById(R.id.buttonMyButton01);
        Button buttonObject02 = (Button) findViewById(R.id.buttonMyButton02);

        buttonObject01.setText("The Blue Pill");
        //buttonObject02.setText("The Red Pill");

        // set background color on buttons
        buttonObject01.setBackgroundColor(0xff0000ff); // blue
        buttonObject02.setBackgroundColor(0xffff0000);// red

        // change button margin on button01


        buttonObject01.setOnClickListener(this);
        buttonObject02.setOnClickListener(this);
    }


    public void onClick(View view)
    {
       if(View.getId() == R.id.buttonMyButton01)

           Log.i("info", "You took the blue pill");
        Toast.makeText(this, "You took the Blue Pill!!!!",Toast.LENGTH_SHORT ).show();
        {
            else

        }
        
        {
            Log.i("info", "You took the red pill");
            Toast.makeText(this, "You took the Red Pill!!!!",Toast.LENGTH_SHORT).show();
        }


    }

}

