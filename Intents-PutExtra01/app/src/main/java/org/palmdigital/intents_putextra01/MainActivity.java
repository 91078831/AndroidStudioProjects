package org.palmdigital.intents_putextra01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void next01(View view)
    {
        EditText et_adj01 = (EditText) findViewById(R.id.edit_text_adj01);
        EditText et_nation = (EditText) findViewById(R.id.edit_Text_nation);
        EditText et_name = (EditText) findViewById(R.id.edit_Text_name);
        EditText et_noun = (EditText) findViewById(R.id.edit_Text_noun);

        String str_adj01 = et_adj01.getText().toString();
        String str_nation = et_nation.getText().toString();
        String str_name = et_name.getText().toString();
        String str_noun = et_noun.getText().toString();

        String story = "Pizza was invited by a " + str_adj01 + " " + str_nation+" "+ str_name +" "+ str_noun+ "chef.";


        Intent i = new Intent(this,Main2Activity.class);
        i.putExtra("STORY_SO_FAR",story);

        startActivity(i);
    }
}
