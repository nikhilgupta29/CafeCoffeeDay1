package com.e.cafecoffeeday1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
static int count = 0;
static int amt1 = 0;
static int amt2 = 0;
static int a= 0;
static int b = 0;
Button butn1, butn2, butn3, butn4;
TextView tv1,tv2;
CheckBox cb1, cb2;








    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        butn1 = findViewById(R.id.button1);
        butn2 = findViewById(R.id.button2);
        butn3 = findViewById(R.id.button3);
        butn4 = findViewById(R.id.button4);

        tv1 = findViewById(R.id.textView1);
        tv2 = findViewById(R.id.textView3);

        cb1 = findViewById(R.id.checkBox);
        cb2 = findViewById(R.id.checkBox2);


        butn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                tv1.setText(Integer.toString(count));


            }


        });
        butn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(count>0){
                    count--;

                }
                else{
                    count=0;
                }
                tv1.setText(Integer.toString(count));
            }
        });
        butn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cb1.isChecked()){
                     amt1=100 * count;
                    tv2.setText(Integer.toString(amt1));
                }
                if(cb2.isChecked())
                {
                    amt2 =150 * count;
                    tv2.setText(Integer.toString(amt2));
                }
                if(cb1.isChecked()&& cb2.isChecked())
                {
                    a = amt1 + amt2;
                    tv2.setText(Integer.toString(a));
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Only Order Content is checked !!!!", Toast.LENGTH_SHORT).show();
                }

            }
        });
        butn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cb1.setChecked(false);
                cb2.setChecked(false);
                b = 0;
                tv1.setText(Integer.toString(b));
                tv2.setText("");

            }
        });


    }
}
