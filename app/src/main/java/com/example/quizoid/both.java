package com.example.quizoid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class both extends AppCompatActivity {

    EditText numobj,numsub,marksobj,markssub;
    Button calculate,next;
    TextView show;
    String obnum,sbnum,obmarks,sbmarks,bothtotal;
    int total,subtotal,objtotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_both);

        numobj= findViewById(R.id.objnum);
        numsub= findViewById(R.id.subnum);
        marksobj= findViewById(R.id.objmarks);
        markssub= findViewById(R.id.submarks);
        calculate= findViewById(R.id.bothcalc);
        next= findViewById(R.id.bothnext);
        show= findViewById(R.id.bothshow);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                obnum=numobj.getText().toString();
                sbnum=numsub.getText().toString();
                obmarks=marksobj.getText().toString();
                sbmarks=markssub.getText().toString();
                subtotal=(Integer.parseInt(sbnum)*Integer.parseInt(sbmarks));
                objtotal=(Integer.parseInt(obnum)*Integer.parseInt(obmarks));
                total=subtotal+objtotal;
                bothtotal= String.valueOf(total);
                show.setText(bothtotal);
                next.setVisibility(View.VISIBLE);
            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(both.this,subjectiveQ.class);
                startActivity(intent);
                finish();

            }
        });
    }
}
