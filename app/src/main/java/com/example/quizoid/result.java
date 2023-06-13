package com.example.quizoid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class result extends AppCompatActivity {

    TextView show,total,percent,right,wrong;
    Button calc,done;
    DatabaseHelper zain;
    quiz abc = new quiz();
    ogenerate quizz = new ogenerate();
    float percentage = (float)(abc.marks*100)/(float)(quizz.num);
    String Spercentage = String.valueOf(percentage);
    boolean check;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        zain = new DatabaseHelper(this);
        total= findViewById(R.id.totalmarks);
        percent= findViewById(R.id.percentage);
        right= findViewById(R.id.correctans);
        wrong= findViewById(R.id.wrongans);
        show= findViewById(R.id.markshow);
        calc= findViewById(R.id.finalm);
        done= findViewById(R.id.finalm4);

                total.setText("TOTAL MARKS = "+(String.valueOf(Objectivee.subtotal)));
                percent.setText("PERCENTAGE = "+(String.valueOf(percentage))+"%");
                right.setText("CORRECT ANSWER = "+(String.valueOf(abc.marks)));
                wrong.setText("WRONG ANSWERS = "+(String.valueOf(quizz.num-abc.marks)));
                show.setText(String.valueOf("OBTAINED MARKS = "+(abc.marks*Objectivee.obmark)));

                calc.setVisibility(View.INVISIBLE);
                done.setVisibility(View.VISIBLE);



        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check = zain.AddData(studentstart.name,studentstart.reg , Spercentage );
                if (check==false){
                    Toast.makeText(getApplicationContext() , "Something Went Wrong" , Toast.LENGTH_LONG).show();
                }
                else{
                    Toast.makeText(getApplicationContext() , "Data Successfully Added" , Toast.LENGTH_LONG).show();
                 }
                Intent intent = new Intent(result.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}