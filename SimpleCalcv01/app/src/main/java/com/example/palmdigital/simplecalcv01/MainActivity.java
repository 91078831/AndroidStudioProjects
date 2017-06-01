package com.example.palmdigital.simplecalcv01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    //fields -- these variables can be seen by whole class, in any method
    ImageView imageView_1;
    ImageView imageView_2;
    ImageView imageView_3;

    TextView textView_top;
    TextView textView_bottom;
    TextView textView_middle;
    int num1, num2;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // references to 1, 2. and 3 imageView
        ImageView imageView_1 = (ImageView) findViewById(R.id.imageView1);
        ImageView imageView_2 = (ImageView) findViewById(R.id.imageView2);
        ImageView imageView_3 = (ImageView) findViewById(R.id.imageView3);
        ImageView imageView_4 = (ImageView) findViewById(R.id.imageView4);
        ImageView imageView_5 = (ImageView) findViewById(R.id.imageView5);
        ImageView imageView_6 = (ImageView) findViewById(R.id.imageView6);
        ImageView equals=(ImageView) findViewById(R.id.equal);


        // set these widgets to listen for click
        imageView_1.setOnClickListener(this);
        imageView_2.setOnClickListener(this);
        imageView_3.setOnClickListener(this);
        imageView_4.setOnClickListener(this);
        imageView_5.setOnClickListener(this);
        imageView_6.setOnClickListener(this);
        equals.setOnClickListener(this);

        // define the references for thr TextViews
        textView_top = (TextView) findViewById(R.id.textView_top);
        textView_middle = (TextView) findViewById(R.id.TextView_middle);
        textView_bottom = (TextView) findViewById(R.id.textView_Bottom);
    }

    public void onClick(View view)
    {
        if(view.getId() == R.id.imageView1)
        {
            textView_top.setText("1");
            num1=1;
        }
        else if(view.getId() == R.id.imageView2)
        {
           textView_top.setText("2");
            num1=2;
        }
        else if(view.getId() == R.id.imageView3)
        {
            textView_top.setText("3");
            num1=3;
        }
        if(view.getId() == R.id.imageView4)
        {
            textView_middle.setText("4");
            num2=4;
        }
        else if(view.getId() == R.id.imageView5)
        {
            textView_middle.setText("5");
            num2=5;
        }
        else if(view.getId() == R.id.imageView6)
        {
           textView_middle.setText("6");
            num2=6;
        }
        if(view.getId() == R.id.equal)
        {
            int sum=num1+num2;
            textView_bottom.setText(""+ sum);

        }

       }

    }

