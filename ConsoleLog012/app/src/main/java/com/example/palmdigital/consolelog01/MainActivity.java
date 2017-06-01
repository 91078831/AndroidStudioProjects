package com.example.palmdigital.consolelog01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity
{
    // fields - class level variable
    private int myInt;
    private double myDouble;
    private String myString;



    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myInt = setIntVaule();
        Log.i("info", "myInt = " + myInt);
        double myDouble = setDoubleVaule(); // myDouble should be set to 10.987
    }

    public int setIntVaule()
    {
        return 10;
    }

    public double setDoubleVaule()
    {
     return 10.987;
    }
}
