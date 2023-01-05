package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity<button> extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView,textView2,textView3,textView4,textView5,textView6,textView7;
        EditText editText,editText2,editText3,edittexttextpassword,edittexttextpassword2;
        Button button;


        textView = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView2);
        textView3 = findViewById(R.id.textView3);
        textView4 = findViewById(R.id.textview4);
        textView5 = findViewById(R.id.textView5);
        textView6 = findViewById(R.id.textView6);
        textView7 = findViewById(R.id.textView7);
        editText = findViewById(R.id.editText);
        editText2 = findViewById(R.id.editText2);
        editText3 = findViewById(R.id.editTextTextEmailAddress);
        edittexttextpassword = findViewById(R.id.editTextTextPassword);
        edittexttextpassword2 = findViewById(R.id.editTextTextPassword2);
        button = findViewById(R.id.button);

        Toast.makeText(this, "Sign up page is opened", Toast.LENGTH_SHORT).show();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Firstname = editText.getText().toString();
                String secname = editText2.getText().toString();
                String mail = editText3.getText().toString();
                String password = edittexttextpassword.getText().toString();
                String confirmp = edittexttextpassword2.getText().toString();
                if (Firstname.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Enter your first name??", Toast.LENGTH_SHORT).show();

                } else if (secname.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Enter your last name", Toast.LENGTH_SHORT).show();

                } else if (mail.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Enter your mail ??", Toast.LENGTH_SHORT).show();
                } else if (password.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Enter your password", Toast.LENGTH_SHORT).show();

                }
                else if(confirmp.isEmpty()){
                   Toast.makeText(MainActivity.this, "Confirm your password password ", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(MainActivity.this, "welcome "+secname, Toast.LENGTH_SHORT).show();
                }

            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflator = getMenuInflater();
        inflator.inflate(R.menu.mymenu,menu);
        return true;
    }




}