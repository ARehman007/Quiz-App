package com.example.quizoid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class squiz extends AppCompatActivity {

    TextView prob,remain,name,reg,tot,xyz;
    EditText ans;
    Button next,finish;

    static int marks=0, total=Integer.parseInt(Subjective.marksub);
    int count =0,rem=total;
    String answer;

    private int time = Subjective.minutes;
    private int a1=10;
    private int b1=5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_squiz);

        prob= findViewById(R.id.textView55);
        ans= findViewById(R.id.editText);
        next= findViewById(R.id.button4);
        remain= findViewById(R.id.textView57);
        name = findViewById(R.id.textView66);
        reg = findViewById(R.id.textView67);
        tot = findViewById(R.id.textView68);
        finish = findViewById(R.id.button6);
        xyz = findViewById(R.id.xyz2);
        tot.setText(String.valueOf(Subjective.summ));
        name.setText(studentstart.name);
        reg.setText(studentstart.reg);
        prob.setText(gxfhgcjhvkj.subb[0][0]);
        remain.setText(String.valueOf(rem));

      if (studentstart.i==1) {
            final Handler handler = new Handler();
            handler.post(new Runnable() {
                @Override
                public void run() {

                    if (time > 0 ){
                        a1--;
                        if (a1==0){
                            if (time-1 > 9)
                                xyz.setText((time-1)+":"+b1+a1);
                            else
                                xyz.setText("0"+(time-1)+":"+b1+a1);
                            b1--;
                            a1=10;
                            if (b1==-1){
                                time--;
                                b1=5;
                            }
                        }
                        else
                            xyz.setText("0"+(time-1)+":"+b1+a1);
                        handler.postDelayed(this , 1000);
                    }

                    else if (count == total){

                    }

                    else{
                        xyz.setText("00:00");
                        Toast.makeText(getApplicationContext(), "Time Finished", Toast.LENGTH_LONG).show();
                        Intent intent = new Intent(squiz.this, finish.class);
                        startActivity(intent);
                        finish();
                    }
                }
            });
        }

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                answer=ans.getText().toString();
                if (answer.equals("")){
                    Toast.makeText(getApplicationContext() , "Please Note Leaving Output Empty Will Count 0" , Toast.LENGTH_LONG).show();
                }
                if(answer.equals(gxfhgcjhvkj.subb[1][count]))
                {
                    marks++;
                }
                rem--;
                count++;
                if(count != total) {
                    ans.setText("");
                    prob.setText(gxfhgcjhvkj.subb[0][count]);
                    remain.setText(String.valueOf(rem));
                }
                if(count == total)
                {
                    Intent intent = new Intent(squiz.this, sresult.class);
                    startActivity(intent);
                    finish();
                }
            }
        });
        finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(squiz.this, sresult.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
