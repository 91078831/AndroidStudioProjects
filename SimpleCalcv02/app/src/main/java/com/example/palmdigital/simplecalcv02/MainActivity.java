package com.example.palmdigital.simplecalcv02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import static com.example.palmdigital.simplecalcv02.R.id.imageView0;
import static com.example.palmdigital.simplecalcv02.R.id.imageView1;
import static com.example.palmdigital.simplecalcv02.R.id.minus;
import static com.example.palmdigital.simplecalcv02.R.id.plus;
import static com.example.palmdigital.simplecalcv02.R.id.equal;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    TextView textView_top;
    TextView textView_mid;
    TextView textView_bot;

    ImageView imageView0;
    ImageView imageView1;
    ImageView imageView2;
    ImageView imageView3;
    ImageView imageView4;
    ImageView imageView5;
    ImageView imageView6;
    ImageView imageView7;
    ImageView imageView8;
    ImageView imageView9;
    ImageView equal;
    ImageView plus;
    ImageView minus;
    int num1, num2;
    int operator;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView0=(ImageView)findViewById(R.id.imageView0);
        imageView1=(ImageView)findViewById(R.id.imageView1);
        imageView2=(ImageView)findViewById(R.id.imageView2);
        imageView3=(ImageView)findViewById(R.id.imageView3);
        imageView4=(ImageView)findViewById(R.id.imageView4);
        imageView5=(ImageView)findViewById(R.id.imageView5);
        imageView6=(ImageView)findViewById(R.id.imageView6);
        imageView7=(ImageView)findViewById(R.id.imageView7);
        imageView8=(ImageView)findViewById(R.id.imageView8);
        imageView9=(ImageView)findViewById(R.id.imageView9);
        equal=(ImageView) findViewById(R.id.equal);
        plus=(ImageView) findViewById(R.id.plus);
        minus=(ImageView) findViewById(R.id.minus);
        textView_top =(TextView) findViewById(R.id.TextView_top);
        textView_mid = (TextView) findViewById(R.id.TextView_Mid);
        textView_bot = (TextView) findViewById(R.id.TextView_bot);



        imageView0.setOnClickListener(this);
        imageView1.setOnClickListener(this);
        imageView2.setOnClickListener(this);
        imageView3.setOnClickListener(this);
        imageView4.setOnClickListener(this);
        imageView5.setOnClickListener(this);
        imageView6.setOnClickListener(this);
        imageView7.setOnClickListener(this);
        imageView8.setOnClickListener(this);
        imageView9.setOnClickListener(this);
        equal.setOnClickListener(this);
        plus.setOnClickListener(this);
        minus.setOnClickListener(this);

        

    }
    public void onClick(View view)
    {
        if(view.getId() == R.id.imageView0)
        {
          textView_top.setText("0");
            num1 = 0;
        }
        if(view.getId() == R.id.imageView1)
        {
            textView_top.setText("1");
            num1 = 1;
        }
        if(view.getId() == R.id.imageView2)
        {
           textView_top.setText("2");
            num1 = 2;
        }
        if(view.getId() == R.id.imageView3)
        {
           textView_top.setText("3");
            num1 = 3;
        }
        if(view.getId() == R.id.imageView4)
        {
           textView_top.setText("4");
            num1 = 4;
        }
        if(view.getId() == R.id.imageView5)
        {
            textView_top.setText("5");
            num1 = 5;
        }
        if(view.getId() == R.id.imageView6)
        {
            textView_top.setText("6");
            num1 =6;
        }
        if(view.getId() == R.id.imageView7)
        {
           textView_top.setText("7");
            num1 = 7;
        }
        if(view.getId() == R.id.imageView8)
        {
            textView_top.setText("8");
            num1 = 8;
        }
        if(view.getId() == R.id.imageView9)
        {
            textView_top.setText("9");
            num1 = 9;
        }
        if(view.getId() == R.id.imageView_0)
        {
            textView_mid.setText("0");
            num2 = 0;
        }
        if (view.getId() == R.id.imageView_1)
        {
            textView_mid.setText("1");
            num2 = 1;
        }
        if (view.getId() == R.id.imageView_2)
        {
           textView_mid.setText("2");
            num2 = 2;
        }
        if (view.getId() == R.id.imageView_3)
        {
            textView_mid.setText("3");
            num2 = 3;
        }
        if (view.getId() == R.id.imageView_4)
        {
            textView_mid.setText("4");
            num2 = 4;
        }
        if (view.getId() == R.id.imageView_5)
        {
            textView_mid.setText("5");
            num2 = 5;
        }
        if (view.getId() == R.id.imageView_6)
        {
            textView_mid.setText("6");
            num2 = 6;
        }
        if (view.getId() == R.id.imageView_7)
        {
            textView_mid.setText("7");
            num2 = 7;
        }
        if (view.getId() == R.id.imageView_8)
        {
            textView_mid.setText("8");
            num2 = 8;
        }
        if (view.getId() == R.id.imageView_9)
        {
            textView_mid.setText("9");
            num2 = 9;
        }
        if(view.getId() == R.id.plus)
        {
            operator=1;
            setPlus();
        }
        else if(view.getId() == R.id.minus)
        {
            operator=0;
            setMinus();
        }
        if(view.getId() == R.id.equal)
        {

        }
    }

    public void setPlus()
    {
        plus.setBackgroundColor(0xff888888);
        minus.setBackgroundColor(0xffffffff);

    }
    public void setMinus()
    {
        minus.setBackgroundColor(0xff888888);
        plus.setBackgroundColor(0xffffffff);

    }




}
