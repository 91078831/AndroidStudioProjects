package org.palmdigital.ceasarcipher_v01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


import static org.palmdigital.ceasarcipher_v01.R.id.Encrypted;
import static org.palmdigital.ceasarcipher_v01.R.id.EnterAMessage;



public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void activity_main(View view)
    {
         String MyOutput = "I LOVE COUNTRY MUSIC";
        System.out.println("the unencrypted string is " + MyOutput);
        TextView EnterAMessage = (TextView) findViewById(R.id.EnterAMessage);
        EditText encrypted = (EditText) findViewById(R.id.encrypted_1);
        EditText Number = (EditText) findViewById(R.id.Number);
        EditText Decrypted = (EditText) findViewById(R.id.Decrypted);
        TextView Shift = (TextView) findViewById(R.id.Shift);
        Button button = EnterAMessage.getText().toString()
        Button button1 = encrypted.getText().toString()
        Button button2 = Number.getText().toString()
        Button button3 = Decrypted.getText().toString()
        Button button4 = Shift.getText().toString()




        int size = 26;
        char[] alphabet = new char[size];
        alphabet[0] = 'A';
        alphabet[1] = 'B';
        alphabet[2] = 'C';
        alphabet[3] = 'D';
        alphabet[4] = 'E';
        alphabet[5] = 'F';
        alphabet[6] = 'G';
        alphabet[7] = 'H';
        alphabet[8] = 'I';
        alphabet[9] = 'J';
        alphabet[10] = 'K';
        alphabet[11] = 'L';
        alphabet[12] = 'M';
        alphabet[13] = 'N';
        alphabet[14] = '0';
        alphabet[15] = 'P';
        alphabet[16] = 'Q';
        alphabet[17] = 'R';
        alphabet[18] = 'S';
        alphabet[19] = 'T';
        alphabet[20] = 'U';
        alphabet[21] = 'V';
        alphabet[22] = 'W';
        alphabet[23] = 'X';
        alphabet[24] = 'Y';
        alphabet[25] = 'Z';
        int shift = 24;
        int shiftCharIndex;
        int fixedCharIndex;
        String output = "";
        for (int i = 0; i < MyOutput.length(); i++)
        {
            for (int j = 0; j < alphabet.length; j++)
            {
                if (MyOutput.charAt(i) == alphabet[j])
                {
                    shiftCharIndex = j + shift;
                    fixedCharIndex = shiftCharIndex % 26;
                    output = output + alphabet[fixedCharIndex];
                }
            }
        }
        System.out.println("The ecrypted string is" + output);
    }
}































































































































