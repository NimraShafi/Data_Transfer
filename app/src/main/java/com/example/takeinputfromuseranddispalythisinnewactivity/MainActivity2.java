package com.example.takeinputfromuseranddispalythisinnewactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent receiveData = getIntent();
        String name = receiveData.getStringExtra("Name");
        int age = receiveData.getIntExtra("Age", 0);

        TextView txt,txt1;

        txt = (TextView) findViewById(R.id.text1);
        txt1 = (TextView) findViewById(R.id.text2);

        txt.setText("Name" +": " +name);
       txt1.setText("Age" +": " +age);

    }
}