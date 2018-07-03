package com.example.mahadev.assignment3;


import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {
EditText E9,E10;
Button b3;
SharedPreferences sps;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_main2);
        sps=getSharedPreferences("pref",MODE_PRIVATE);
         E9=(EditText)findViewById(R.id.editText9);
         E10=(EditText)findViewById(R.id.editText10);
         b3=(Button)findViewById(R.id.button3);
         final String username=sps.getString("username","");
         final String password=sps.getString("password","");
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String s1 = E9.getText().toString();
                final String s2 = E10.getText().toString();
                if ((username.equals(s1)&&(password.equals(s2))))
                {
                    Intent i = new Intent(getApplicationContext(), Main3Activity.class);
                    startActivity(i);
                }
            }
        });
    }
}
