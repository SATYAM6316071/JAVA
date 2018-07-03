package com.example.mahadev.assignment3;

import android.content.Intent;
import android.content.SharedPreferences;
import android.renderscript.Byte4;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button b1, b2;
    EditText E1, E2, E3, E4;
    SharedPreferences sps;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button) findViewById(R.id.button);
        b2 = (Button) findViewById(R.id.button2);
        E1 = (EditText) findViewById(R.id.editText);
        E2 = (EditText) findViewById(R.id.editText2);
        E3 = (EditText) findViewById(R.id.editText3);
        E4 = (EditText) findViewById(R.id.editText8);
   b2.setOnClickListener(new View.OnClickListener() {
       @Override
       public void onClick(View view) {
           Intent i=new Intent(getApplicationContext(),Main2Activity.class);
           startActivity(i);
       }
   });
   b1.setOnClickListener(new View.OnClickListener() {
       @Override
       public void onClick(View view) {
           sps = getSharedPreferences("pref", MODE_PRIVATE);
           SharedPreferences.Editor edi = sps.edit();
           edi.putString("username", E1.getText().toString());
           edi.putString("password", E2.getText().toString());
           edi.putString("D-O-B", E3.getText().toString());
           edi.putString("email", E4.getText().toString());
           edi.commit();
           Intent i = new Intent(getApplicationContext(), Main3Activity.class);
           startActivity(i);
       }
   });


   }
}
