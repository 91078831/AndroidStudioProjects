package com.example.palmdigital.textviewoutput1;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    TextView textViewDisplayTop;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageView imageViewNum1 = (ImageView) findViewById(R.id.imageView1);
        ImageView imageViewNum2 = (ImageView) findViewById(R.id.imageView2);
        ImageView imageViewNum3 = (ImageView) findViewById(R.id.imageView3);

        imageViewNum1.setOnClickListener(this);
        imageViewNum2.setOnClickListener(this);
        imageViewNum3.setOnClickListener(this);


}
    public void onClick(View view)
    {
        if(view.getId() == R.id.imageView1)
        {
            textViewDisplayTop.setText("1");
        }

    }
}
