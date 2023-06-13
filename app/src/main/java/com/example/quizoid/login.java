package com.example.quizoid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.net.PasswordAuthentication;

public class login extends AppCompatActivity {

    String username,password,tusername="abc",tpassword="123";
    Button tbtn;
    int count1=0,count2=0;
    EditText user,pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        tbtn=  findViewById(R.id.tlog);
        user= findViewById(R.id.idd);
        pass= (EditText)findViewById(R.id.pw);




        tbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                username = user.getText().toString();
                password = pass.getText().toString();

                if(username.equals(tusername) && (password.equals(tpassword)))
                {


                        Intent intent = new Intent(login.this,Teacher_Options.class);
                        startActivity(intent);
                        finish();

                }
                else
                {

                    Toast.makeText(getApplicationContext() , "INVALID USERNAME OF PASSWORD" , Toast.LENGTH_LONG).show();
                }
            }
        });


    }
}
