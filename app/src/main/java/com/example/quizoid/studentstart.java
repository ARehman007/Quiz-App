package com.example.quizoid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class studentstart extends AppCompatActivity {

    Button startq;
    EditText sname,sreg,id;
    static String name,reg,idcheck ;
    int check;
    static int i=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_studentstart);

        startq= findViewById(R.id.startquiz);
        sname= findViewById(R.id.studentname);
        sreg= findViewById(R.id.studentreg);
        id= findViewById(R.id.idd);

        startq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                name = sname.getText().toString();
                reg = sreg.getText().toString();
                idcheck = id.getText().toString();


                if (name.equals("") || reg.equals("") || idcheck.equals("")) {
                    Toast.makeText(getApplicationContext(), "PLEASE FILL ALL DETAILS", Toast.LENGTH_LONG).show();
                }
                else {
                    check = Integer.parseInt(idcheck);
                    if (check == objectiveQ.l) {
                        i++;
                        Intent intent = new Intent(studentstart.this, quiz.class);
                        startActivity(intent);
                        finish();

                    } else if (check == subjectiveQ.k) {
                        i++;
                        Intent intent = new Intent(studentstart.this, squiz.class);
                        startActivity(intent);
                        finish();
                    } else
                        Toast.makeText(getApplicationContext(), "WRONG ID PLEASE CHECK AGAIN" , Toast.LENGTH_LONG).show();
                }
            }
        });

    }

}
