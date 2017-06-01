package com.example.palmdigital.chooseadventure_v01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class WakeUp extends AppCompatActivity implements View.OnClickListener
{

    Button leftButton;
    Button rightButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wake_up);

        TextView textView_story = (TextView) findViewById(R.id.textView_story);
        TextView textView_question = (TextView) findViewById(R.id.textView_question);

        textView_story.setText("You wake up and have a boring day. The end.");
        textView_question.setText("");

        //Buttons
        leftButton     =(Button) findViewById(R.id.button_left);
        rightButton    =(Button) findViewById(R.id.button_right);

        leftButton.setText("WakeUp");
        rightButton.setText("");

        // set clickListeners
        leftButton.setOnClickListener(this);
        rightButton.setOnClickListener(this);
        // end
    }
    
    public void onClick(View view)
    {
        if (view.getId() == R.id.button_left)
        {
            Intent i = new Intent(this,ExploreActivity.class);
            startActivity(i);


        } // explore
        else if (view.getId() == R.id.button_right)
        {
            Intent i = new Intent(this,ExploreActivity.class);
            startActivity(i);
        }


    }
}
