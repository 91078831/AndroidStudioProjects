package com.example.palmdigital.scope01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

// we are out side the MainActivity class
// we are outside any methods

// Understanding how scope works is very important!!

public class MainActivity extends AppCompatActivity
{
    // in the MainActivity class, but I'm outside any methods

    // fields - these variables have classwide scope -- any code in the class can see
    //          and use these variable
    String myString;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // here, we are inside the OnCreate() method,which is inside
        // the MainActivity class

        // when we 'declare' or 'define' a variable, we use the following format:
        // dataType variable; <--- this is a variable declaration/definition
        //some example:
        int myInt; // <--- this is declaring a variable of dataType 'int' name 'int'
        double myDouble; // <--- this is declaring a variable of dataType 'double' name 'double'
        TextView textView_story; // <--- this is declaring a variable of dataType 'TextView" name
                                          // textView_story
        ImageView imageView_ex; // <--- dataType is ImageView, variableName is ImageView_ex

        // assigning a value to a declared variable
        // after we declare a variable, we can assign a value to it
        //variableName = someValueOfTheSameDataTypeAsTheVariable;
        // some examples:
        myInt = 10; // <--- setting the value of myInt has dataType 'int' & 10 is an int
        myDouble = 20.12; // myDouble gets the value 20.12
        textView_story = (TextView) findViewById(R.id.imageView_st); // set the value of
                                                                    // textView_story to the UI element
                                                                   // R.id.textView_st

        imageView_ex = (ImageView) findViewById(R.id.imageView_android_guy);
        // You know you can declare and assign in the same step
        // dataType variableName = someValueOfTheSameDataTypeAsTheVariable;
        // some examples
        int myInt2 = 25; // <-- this is a declaration AND assigment
        myInt2 = 50; // <-- this is only assigment
        // The 




    } //end of OnCreate method

} // end of class
