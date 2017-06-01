package org.palmdigital.madlibpizza;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void makeStory(View view)
    {
        EditText et_adj1 = (EditText) findViewById(R.id.edit_text_adj01);
        EditText et_nationality = (EditText) findViewById(R.id.edit_text_nation);
        EditText et_name = (EditText) findViewById(R.id.edit_text_name);
        EditText et_noun1 = (EditText) findViewById(R.id.edit_text_noun1);
        EditText et_adj2 = (EditText) findViewById(R.id.edit_text_adj2);

        TextView tv_story = (TextView) findViewById(R.id.text_view_story);

        String story = "Pizza was invented by a";
        String str_Adj1 = et_adj1.getText().toString();
        String str_Nationality = et_nationality.getText().toString();
        String str_Name = et_name.getText().toString();
        String str_Noun1 = et_noun1.getText().toString();
        String str_Adj2 = et_adj2.getText().toString();



        story = story + str_Adj1 + str_Nationality;
        story += ". To make a pizza, you need to take a lump of" + str_Noun1;
        story += ", and make a thin, round then cover it with sauce" + str_Name;
        story += ", Cheese, and fresh chopped Next you have to bake it in a very" + str_Adj2;


        tv_story.setText(story);
    }
}
