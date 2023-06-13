package com.example.quizoid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class objectiveQ extends AppCompatActivity {

    Button ogen,oset;
    TextView idobj;
    static int l;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_objective_q);

        ogen= findViewById(R.id.objgenerate);
        idobj= findViewById(R.id.objid);

        Random rand = new Random();
        l=rand.nextInt(10000);
        while(l<999){
            l=rand.nextInt(10000);
        }

        idobj.setText(String.valueOf(l));

        ogen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(objectiveQ.this, ogenerate.class);
                startActivity(intent);
                finish();

            }
        });


    }
}
