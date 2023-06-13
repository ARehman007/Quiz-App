package com.example.quizoid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class sresult extends AppCompatActivity {

    TextView total,obtained,percent,wrong,correct;
    Button show,done;
    Boolean check;
    DatabaseHelper zain;
    float percentage= (squiz.marks*100)/squiz.total;
    String Spercentage = String.valueOf(percentage);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sresult);
        zain = new DatabaseHelper(this);
        total=findViewById(R.id.textView58);
        obtained=findViewById(R.id.textView59);
        percent=findViewById(R.id.textView62);
        wrong=findViewById(R.id.textView61);
        correct=findViewById(R.id.textView60);
        show=findViewById(R.id.button5);
        done =  findViewById(R.id.button7);
        total.setText("TOTAL MARKS = "+ (Subjective.summ));
        obtained.setText("OBTAINED MARKS = "+String.valueOf(Subjective.markpq*squiz.marks));
        wrong.setText("INCORRECT ANSWERS = "+String.valueOf((squiz.total-squiz.marks)));
        correct.setText("CORRECT ANSWERS = "+String.valueOf(squiz.marks));
        percent.setText("PERCENTAGE = "+String.valueOf(percentage)+"%");
        show.setVisibility(View.INVISIBLE);
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

                Intent intent = new Intent(sresult.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
