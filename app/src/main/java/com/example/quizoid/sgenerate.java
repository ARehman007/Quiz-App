package com.example.quizoid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class sgenerate extends AppCompatActivity {

    TextView displayss;
    Button checking;
    static int j=4;
    int i=0,count=0,check=0,k,Qnum=0;
    static int num=Integer.parseInt(Subjective.marksub);
    Random rand = new Random();


    String subjt[][]={{"class Test { \n" +
            "\tprotected int x, y; \n" +
            "} \n" +
            "class Main { \n" +
            "\tpublic static void main(String args[]) { \n" +
            "\t            Test t = new Test(); \n" +
            "\t           System.out.println(t.x + \" \" + t.y); \n" +
            "                  } \n" +
            "} \n",
    "class Test { \n" +
            "\tpublic static void main(String[] args) { \n" +
            "\t            for(int i = 0; i<1; i++) { \n" +
            "\t\tSystem.out.println(\"Hello\"); \n" +
            "\t\tbreak; \n" +
            "\t           } \n" +
            "                    } \n" +
            "} \n",
    "class Test { \n" +
            "    public static void main(String[] args) { \n" +
            "        for(int i = 0; true; i++) { \n" +
            "            System.out.println(\"Hello\"); \n" +
            "            break; \n" +
            "        } \n" +
            "    } \n" +
            "}\n",
    "class Main { \n" +
            "    public static void main(String args[]) {    \n" +
            "        System.out.println(fun()); \n" +
            "    }  \n" +
            "    int fun() { \n" +
            "        return 20; \n" +
            "    }  \n" +
            "}\n",
    "class Main { \n" +
            "    public static void main(String args[]) { \n" +
            "        System.out.println(fun()); \n" +
            "    }  \n" +
            "    static int fun() { \n" +
            "        return 20; \n" +
            "    } \n" +
            "} \n"},{"0 0","Hello","Hello","20","20"}};





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ogenerate);
        checking = (Button)findViewById(R.id.abc);
        displayss= (TextView)findViewById(R.id.textView);

        checking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayss.setText("HELLO");
            }
        });



//        showw.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
////                String questions="";
////                while (count<num)
////                {
////                    check=0;
////                    k=rand.nextInt(15);
////                    objj[0][count]=objt[0][k];
////                    objj[1][count]=objt[1][k];
////                    objj[2][count]=objt[2][k];
////                    for(int i=0;i<count;i++)
////                    {
////                        if(objj[0][count]==objt[0][i])
////                        {
////                            check++;
////                        }
////                        if(check>1)
////                        {
////                            count++;
////                        }
////                    }
////                }
////                questions="";
////                if(Qnum<num)
////                {
////                    questions+= (Qnum+1)+" "+objj[0][Qnum];
////                    display.setText(questions);
////                }
////                else
////                {
////                    display.setText("By pressing FINALIZE Button, the quiz will be saved and finalized.\nThe student will be shown the saved quiz" +
////                            "\nIf another quiz is created before it is presented to student, new quiz will be over written on the available quiz");
////                    showw.setVisibility(View.INVISIBLE);
////                    finalize.setVisibility(View.VISIBLE);
////                }
////                else if(num-(i-3)!=0)
////                {
////                    questions="";
////                    for(int k=num-(i-3);k<num;k++)
////                    {
////                        questions+=objt[0][k]+"\n";
////                    }
////                    display.setText(questions);
////                }
//            }
//
//        });
//
//
//        finalize.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                Intent intent = new Intent(sgenerate.this, MainActivity.class);
//                startActivity(intent);
//            }
//        });
    }
}