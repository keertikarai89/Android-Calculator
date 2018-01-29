package edu.depaul.csc472.mycalc;

import android.app.Activity;
import android.app.Notification;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Button;
import android.view.View;

public class MainActivity extends Activity {
    int total=0;
    boolean screen_clear=true;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView tv = findViewById(R.id.text1);
        Button b1 = findViewById(R.id.button1);
        Button b2 = findViewById(R.id.button2);
        Button b3 = findViewById(R.id.button3);
        Button b4 = findViewById(R.id.button4);
        Button b5 = findViewById(R.id.button5);
        Button b6 = findViewById(R.id.button6);
        Button b7 = findViewById(R.id.button7);
        Button b8 = findViewById(R.id.button8);
        Button b9 = findViewById(R.id.button9);
        Button b10 = findViewById(R.id.button10);
        Button bEqual = findViewById(R.id.button11);
        Button bAdd = findViewById(R.id.button12);
        Button bClear = findViewById(R.id.button13);

        b1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (tv.getText().equals("") || (screen_clear)) {
                    tv.setText("1");
                    screen_clear = false;
                }

                else {
                    tv.setText(tv.getText().toString().concat("1"));
                }

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (tv.getText().equals("") || (screen_clear)) {
                    tv.setText("2");
                    screen_clear = false;
                }
                else {
                    tv.setText(tv.getText().toString().concat("2"));
                }
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (tv.getText().equals("") || (screen_clear)) {
                    tv.setText("3");
                    screen_clear = false;
                }
                else {
                    tv.setText(tv.getText().toString().concat("3"));
                }
            }

        });

        b4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (tv.getText().equals("") || (screen_clear)) {
                    tv.setText("4");
                    screen_clear = false;
                }
                else {
                    tv.setText(tv.getText().toString().concat("4"));
                }
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (tv.getText().equals("") || (screen_clear)) {
                    tv.setText("5");
                    screen_clear = false;
                }
                else {
                    tv.setText(tv.getText().toString().concat("5"));
                }
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (tv.getText().equals("") || (screen_clear)) {
                    tv.setText("6");
                    screen_clear = false;
                }
                else {
                    tv.setText(tv.getText().toString().concat("6"));
                }
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (tv.getText().equals("") || (screen_clear)) {
                    tv.setText("7");
                    screen_clear = false;
                }
                else {
                    tv.setText(tv.getText().toString().concat("7"));
                }
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (tv.getText().equals("") || (screen_clear)) {
                    tv.setText("8");
                    screen_clear = false;
                }
                else {
                    tv.setText(tv.getText().toString().concat("8"));
                }
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (tv.getText().equals("") || (screen_clear)) {
                    tv.setText("9");
                    screen_clear = false;
                }
                else {
                    tv.setText(tv.getText().toString().concat("9"));
                }
            }
        });

        b10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (tv.getText().equals("") || (screen_clear)) {
                    tv.setText("0");
                    screen_clear = false;
                }
                else {
                    tv.setText(tv.getText().toString().concat("0"));
                }
            }
        });

        bClear.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                total=0;
                tv.setText("");
            }
        });


        bAdd.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (tv.getText().equals("")) {
                    tv.setText("");
                }

                else if (tv.getText().toString().contains("+")) {
                    String[] str = tv.getText().toString().split("\\+");

                    for (int i = 0; i < str.length; ++i) {
                        if (!str[i].equals(""))
                            total = total + Integer.parseInt(str[i]);
                    }

                    tv.setText(String.valueOf(total).concat("+"));
                    total=0;

                }
                else{
                        tv.setText(tv.getText().toString().concat("+"));
                        screen_clear = false;

                    }
                }
        });


        bEqual.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                total=0;
                String[] str = tv.getText().toString().split("\\+");

                for (int i =0; i<str.length; ++i) {
                    if (!str[i].equals(""))
                        total = total + Integer.parseInt(str[i]);
                }
                    screen_clear = true;
                    tv.setText(String.valueOf(total));
                    total=0;

            }



    });
    }}







