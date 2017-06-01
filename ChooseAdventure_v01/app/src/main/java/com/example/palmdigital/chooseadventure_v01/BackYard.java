package com.example.palmdigital.chooseadventure_v01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class BackYard extends AppCompatActivity implements View.OnClickListener
{
    // fields

    //Button
    Button leftButton;
    Button rightButton;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_back_yard);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // references

        // TextView
        TextView textView_story = (TextView) findViewById(R.id.textView_story);
        TextView textView_question = (TextView) findViewById(R.id.textView_question);

        textView_story.setText("Do you want to train to be a NINJA?  'Yes' or 'HECK YES'?");
        textView_question.setText("Do you want to 'wake up' or 'explore' the dream?");

        //Buttons
        leftButton     =(Button) findViewById(R.id.button_left);
        rightButton    =(Button) findViewById(R.id.button_right);

        leftButton.setText("Yes");
        rightButton.setText("HECK YES");

        // set clickListeners
        leftButton.setOnClickListener(this);
        rightButton.setOnClickListener(this);
        // end
    }

    @Override
    public void onClick(View view)
    {
        if (view.getId() == R.id.button_left)
        {
            Intent i = new Intent(this,WakeUp.class);
            startActivity(i);


        } // explore
        else if (view.getId() == R.id.button_right)
        {
            Intent i = new Intent(this,ExploreActivity.class);
            startActivity(i);
       }
    }
}
