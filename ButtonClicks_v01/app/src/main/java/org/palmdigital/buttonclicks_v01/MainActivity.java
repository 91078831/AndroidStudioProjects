package org.palmdigital.buttonclicks_v01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Button button = (Button) findViewById(R.id.button);
    }

    public void getName(View v)
    {
        Toast.makeText(this, "This button works", Toast.LENGTH_SHORT).show();
    }

    public void testMethod(View hi)
    {
        Toast.makeText(this, "Testing second button!",Toast.LENGTH_SHORT).show();
    }

    
}
