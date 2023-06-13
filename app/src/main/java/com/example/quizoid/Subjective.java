package com.example.quizoid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Subjective extends AppCompatActivity {

    EditText subnumm,submark,quiztime;
    Button subnext,calc;
    TextView subshows;
    static int summ,markpq,minutes,num;
    static String marksub,numsub,showsub,timer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subjective);

        subnumm= findViewById(R.id.subnum);
        submark= findViewById(R.id.submarks);
        subnext= findViewById(R.id.button);
        subshows= findViewById(R.id.subshow);
        calc= findViewById(R.id.calcu);
        quiztime = findViewById(R.id.quiztime);

        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                marksub=submark.getText().toString();
                timer = quiztime.getText().toString();
                if (Integer.parseInt(marksub)==1){
                    num=2;
                    marksub=String.valueOf(num);
                }
                numsub=subnumm.getText().toString();
                if (marksub.equals("")  || marksub.equals("0") || numsub.equals("") || timer.equals("") || timer.equals("")){
                    Toast.makeText(getApplicationContext() , "PLEASE FILL ALL DETAILS CORRECTLY" , Toast.LENGTH_LONG).show();
                }
                else {
                    calc.setVisibility(View.INVISIBLE);
                    markpq = Integer.parseInt(numsub);
                    minutes = Integer.parseInt(timer);
                    summ = (Integer.parseInt(marksub)) * (Integer.parseInt(numsub));
                    subshows.setText("Total marks = " + summ);
                    subnext.setVisibility(View.VISIBLE);
                }

            }
        });

        subnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Subjective.this,subjectiveQ.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
