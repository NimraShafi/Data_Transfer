package com.example.takeinputfromuseranddispalythisinnewactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.jar.Attributes;

public class MainActivity extends AppCompatActivity {
    Button btn;
    EditText edit, edit1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.btn1);
        edit = (EditText) findViewById(R.id.ed);
        edit1 = (EditText) findViewById(R.id.ed1);



        //we initialize input
        /*Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        intent.putExtra("Name","Nimra Shafi");
        intent.putExtra("Age",20);*/

        btn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this, MainActivity2.class);
            intent.putExtra("Name", String.valueOf(edit.getText().toString()));
            intent.putExtra("Age", Integer.valueOf(edit1.getText().toString()));
            startActivity(intent);
        }
    });
    }
}