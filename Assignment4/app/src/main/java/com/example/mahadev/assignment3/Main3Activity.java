package com.example.mahadev.assignment3;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {
    TextView E1,E2,E3,E4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        E1=(TextView) findViewById(R.id.textView);
        E2=(TextView) findViewById(R.id.textView2);
        E3=(TextView) findViewById(R.id.textView3);
        E4=(TextView) findViewById(R.id.textView4);

        SharedPreferences sps=getSharedPreferences("Pref",MODE_PRIVATE);
        final String u=sps.getString("username","");
        final String p=sps.getString("password","");
        final String D=sps.getString("D-O-B","");
        final String e=sps.getString("email","");

        E1.setText(u);
        E2.setText(p);
        E3.setText(D);
        E4.setText(e);
    }

}
