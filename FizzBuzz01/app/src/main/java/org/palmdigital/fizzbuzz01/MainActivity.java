package org.palmdigital.fizzbuzz01;

import android.renderscript.ScriptGroup;
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
    public void calculate(View view)
    {
        EditText eInput = (EditText)findViewById(R.id.input);
        TextView Output = (TextView)findViewById(R.id.output);

        String strInput = eInput.getText().toString();

        int input = Integer.parseInt(strInput);





        if(input%5 == 0)
        {
            if(input%3 == 0)
            {
                Output.setText("Fizz Buzz");
            }
            else
            {
                Output.setText("Buzz");
            }
        }
        else if(input% 3 == 0)
        {
            Output.setText("Fizz");
        }
        else
        {
            Output.setText(strInput);
        }
        if(eInput == null)
        {
            Output.setText("please enter a number ");
        }
    }
}
