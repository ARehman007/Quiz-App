package com.example.quizoid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class subjectiveQ extends AppCompatActivity {

    Button sgen,sset;
    TextView idsub;

    static int k;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subjective_q);

        sgen= findViewById(R.id.subgenerate);
        idsub= findViewById(R.id.subid);


        Random rand = new Random();
        k=rand.nextInt(10000);
        while (k<999){
            k=rand.nextInt(10000);
        }
        idsub.setText(String.valueOf(k));


        sgen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(subjectiveQ.this, gxfhgcjhvkj.class);
                startActivity(intent);
                finish();

            }
        });


    }
}
