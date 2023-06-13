package com.example.quizoid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Objectivee extends AppCompatActivity {

    Button btn,calc2;
    EditText num,marks,time;
    TextView showobj;

    String objmark,objnums,qstring;
    static int obmark,objnumm,subtotal,Objtime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_objectivee);

        btn=findViewById(R.id.button2);
        num=findViewById(R.id.objnum);
        marks=findViewById(R.id.objmarks);
        showobj=findViewById(R.id.objshow);
        calc2=findViewById(R.id.calcu2);
        time = findViewById(R.id.oquiztime);

        calc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                objnums=num.getText().toString();
                objmark=marks.getText().toString();
                qstring = time.getText().toString();

                if (objnums.equals("") || objmark.equals("") || qstring.equals(""))
                    Toast.makeText(getApplicationContext() , "PLEASE FILL ALL DETAILS " , Toast.LENGTH_LONG).show();
                else if (qstring.equals("0"))
                    Toast.makeText(getApplicationContext() , "Time Cannot Be 0 " , Toast.LENGTH_LONG).show();
                else {

                    calc2.setVisibility(View.INVISIBLE);
                    objnumm = Integer.parseInt(objnums);
                    Objtime = Integer.parseInt(qstring);
                    obmark = Integer.parseInt(objmark);
                    subtotal = objnumm * obmark;
                    showobj.setText("Total Marks = " + subtotal);
                    btn.setVisibility(View.VISIBLE);
                }
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Objectivee.this, objectiveQ.class);
                startActivity(intent);
                finish();
            }
        });
    }
}