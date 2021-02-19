package com.imelda.rollingdicegame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import java.util.concurrent.ThreadLocalRandom;

import static android.widget.Toast.*;

public class MainActivity extends AppCompatActivity {
    Button lower1, higher1;
    TextView textView1;
    TextView textView2,resulttext;
    String result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lower1 = this.findViewById(R.id.lower);
        higher1 = this.findViewById(R.id.higher);
        textView1= this.findViewById(R.id.textView);
        textView2=this.findViewById(R.id.textView2);
        resulttext=this.findViewById(R.id.textView3);
        lower1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            rollDice();
            rollDiceuser();

               resultdata();

            }


        });
        higher1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               rollDice();
               rollDiceuser();
                resultdata();

            }
        });
    }

    private void resultdata() {
        int computer = Integer.parseInt(textView1.getText().toString());
        int user = Integer.parseInt(textView2.getText().toString());

        if(computer>user){
            resulttext.setText("Computer WINS!!!");
        }
        if (computer<user){
            resulttext.setText("USER WINS!!!");
        }
        if (computer==user){
            resulttext.setText("IT is a TIE!!!");
        }
    }


    private void rollDiceuser() {
        int min = 1;
        int max = 6;
        int random = ThreadLocalRandom.current().nextInt(min,max+1);
        textView2.setText(new StringBuilder().append(random));
    }

    private void rollDice() {
        int min = 1;
        int max = 6;
        int random = ThreadLocalRandom.current().nextInt(min,max+1);
        textView1.setText(new StringBuilder().append(random));


    }





}