package com.example.quizoid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class quiz extends AppCompatActivity {

    TextView ques,namee,markss,regg,remain, xyz;
    Button a,b,c,d,finish;

    static int count=0,marks=0;

    private int time = Objectivee.Objtime;
    private int a1=10;
    private int b1=5;

    ogenerate quizz = new ogenerate();
    studentstart start = new studentstart();
    Objectivee total = new Objectivee();

    int rem = total.objnumm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        remain= findViewById(R.id.remaining);
        namee = findViewById(R.id.studentname);
        regg = findViewById(R.id.studentreg);
        markss = findViewById(R.id.totalmarks);
        ques = findViewById(R.id.question);
        a= findViewById(R.id.aa);
        b= findViewById(R.id.bb);
        c= findViewById(R.id.cc);
        d= findViewById(R.id.dd);
        finish = findViewById(R.id.finishquiz);
        xyz = findViewById(R.id.xyz);

        remain.setText(String.valueOf(rem));
        namee.setText(start.name);
        regg.setText(start.reg);
        markss.setText(String.valueOf(total.subtotal) );
        ques.setText(quizz.objj[0][count]);





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
                        else if (count==(quizz.num)){

                        }
                        else{
                            xyz.setText("00:00");
                            Toast.makeText(getApplicationContext(), "Time Finished", Toast.LENGTH_LONG).show();
                            Intent intent = new Intent(quiz.this, finish.class);
                            startActivity(intent);
                            finish();
                        }
                    }
                });
            }

        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(quizz.objj[1][count].equals("a"))
                {
                    marks++;
                }

                count++;
                if(count != quizz.num)
                {
                    rem--;
                    remain.setText(String.valueOf(rem));
                    ques.setText(quizz.objj[0][count]);
                }

                if(count==(quizz.num))
                {
                    Intent intent = new Intent(quiz.this, finish.class);
                    startActivity(intent);
                    finish();
                }
            }
        });

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(quizz.objj[1][count].equals("b"))
                {
                    marks++;
                }

                count++;
                if(count != quizz.num)
                {
                    rem--;
                    remain.setText(String.valueOf(rem));
                    ques.setText(quizz.objj[0][count]);
                }


                if(count==(quizz.num))
                {
                    Intent intent = new Intent(quiz.this, finish.class);
                    startActivity(intent);
                    finish();
                }
            }
        });

        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(quizz.objj[1][count].equals("c"))
                {
                    marks++;
                }
                count++;
                if(count != quizz.num)
                {
                    rem--;
                    remain.setText(String.valueOf(rem));
                    ques.setText(quizz.objj[0][count]);
                }


                if(count==(quizz.num))
                {
                    Intent intent = new Intent(quiz.this, finish.class);
                    startActivity(intent);
                    finish();
                }
            }
        });

        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(quizz.objj[1][count].equals("d"))
                {
                    marks++;
                }

                count++;
                if(count != quizz.num)
                {
                    rem--;
                    remain.setText(String.valueOf(rem));
                    ques.setText(quizz.objj[0][count]);
                }


                if(count==(quizz.num))
                {

                    Intent intent = new Intent(quiz.this, finish.class);
                    startActivity(intent);
                    finish();
                }
            }
        });

        finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(quiz.this,result.class);
                startActivity(intent);
                finish();
            }
        });

    }
}
