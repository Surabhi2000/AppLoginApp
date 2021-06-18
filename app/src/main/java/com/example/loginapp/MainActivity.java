package com.example.loginapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etUsn, etPwd;
    Button btnSubmit;
    Button btnReset;
    Button btnSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //initialize the widgets
        etUsn=findViewById(R.id.editTextUserName);
        etPwd=findViewById(R.id.editTextPassword);
        btnSubmit=findViewById(R.id.buttonSubmit);
        btnReset=findViewById(R.id.bt2);
        btnSignUp=findViewById(R.id.bt3);

        //event handler
        //attach a listener for button
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usn = etUsn.getText().toString();
                String Pwd = etPwd.getText().toString();

                if (usn.equals("admin") && Pwd.equals("admin123")) {
                    Toast.makeText(MainActivity.this, "Authenticated Succesfully", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(MainActivity.this, "Authenticated Denied", Toast.LENGTH_SHORT).show();
                     }


            btnSignUp.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                        Toast.makeText(MainActivity.this, "Sign Up page loading soon", Toast.LENGTH_SHORT).show();
                        Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                        startActivity(intent);
                    }

        });
            }
        });
    }
}
