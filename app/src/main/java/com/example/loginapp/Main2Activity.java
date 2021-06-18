package com.example.loginapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    EditText ed1;
    EditText ed2;
    EditText ed3;
    EditText ed4;
    EditText ed5;
    EditText ed6;
    EditText ed7;
    EditText ed8;
    EditText ed9;
    EditText ed10;
    TextView tv1;
    TextView tv2;
    Button bt1;
    Button bt2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1 = findViewById(R.id.ed1);
        ed2 = findViewById(R.id.ed2);
        ed3 = findViewById(R.id.ed3);
        ed4 = findViewById(R.id.ed4);
        ed5 = findViewById(R.id.ed5);
        ed8 = findViewById(R.id.ed8);
        ed10 = findViewById(R.id.ed10);
        bt1 = findViewById(R.id.bt1);
        bt2 = findViewById(R.id.bt2);

    }
    public void submit(View view)
            {
                Toast.makeText(Main2Activity.this,"Submitted Successfully", Toast.LENGTH_SHORT).show();
            }
            }
