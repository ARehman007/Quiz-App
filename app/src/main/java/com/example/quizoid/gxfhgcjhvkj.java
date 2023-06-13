package com.example.quizoid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class gxfhgcjhvkj extends AppCompatActivity {
    TextView checking;
    Button displayss,next;
    static int j=4;
    int i=0,count=0,check,k,Qnum=1;
    static int num=Integer.parseInt(Subjective.marksub);
    Random rand = new Random();

    static String subjt[][]={{"class Test { \n" +
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
                    "} \n",
            "public static void main(String[] args) \n" +
                    "    { \n" +
                    "        int[] x = { 1, 2, 3, 4 }; \n" +
                    "        int[] y = x; \n" +
                    "  \n" +
                    "        x = new int[2]; \n" +
                    "  \n" +
                    "        for (int i = 0; i < x.length; i++) \n" +
                    "            System.out.print(y[i] + \" \"); \n" +
                    "    } ",
            "class Test { \n" +
                    "public\n" +
                    "    static void main(String[] args) \n" +
                    "    { \n" +
                    "        // we are assiging 8 byte data to 4 byte variable \n" +
                    "        float f = 10l; \n" +
                    "        System.out.println(f); \n" +
                    "    } \n" +
                    "}",
            "int main() \n" +
                    "{ \n" +
                    "    static int i; \n" +
                    "    for (i++; ++i; i++) { \n" +
                    "        printf(\"%d \", i); \n" +
                    "        if (i == 6) \n" +
                    "            break; \n" +
                    "    } \n" +
                    "    return 0; \n" +
                    "}",
            "int fun(); \n" +
                    "int main() \n" +
                    "{ \n" +
                    "    for (fun(); fun(); fun()) { \n" +
                    "        printf(\"%d \", fun()); \n" +
                    "    } \n" +
                    "    return 0; \n" +
                    "} \n" +
                    "int fun() \n" +
                    "{ \n" +
                    "    int static num = 10; \n" +
                    "    return num--; \n" +
                    "}",
            "int main() \n" +
                    "{ \n" +
                    "    char i = 0; \n" +
                    "    for (; i++; printf(\"%d\", i)) \n" +
                    "        ; \n" +
                    "    printf(\"%d\", i); \n" +
                    "    return 0; \n" +
                    "}",
            "int main() \n" +
                    "{ \n" +
                    "    int i; \n" +
                    "    if(i=0,2,3) \n" +
                    "        printf(\"Geeksforgeeks \"); \n" +
                    "    else\n" +
                    "        printf(\"Hello \"); \n" +
                    "    printf(\"%d\\n\",i); \n" +
                    "}",
            "int main() \n" +
                    "{ \n" +
                    "    int i; \n" +
                    "    if(i=(2,1,0)) \n" +
                    "        printf(\"Geeksforgeeks \"); \n" +
                    "    else\n" +
                    "        printf(\"Hello \"); \n" +
                    "    printf(\"%d\\n\",i); \n" +
                    "} ",
            "int main() \n" +
                    "{ \n" +
                    "    float a=0.7d;  \n" +
                    "    if(a<0.7) \n" +
                    "         printf(\"C\"); \n" +
                    "        else\n" +
                    "         printf(\"C++\"); \n" +
                    "    return 0; \n" +
                    "}"
    },

            {"0 0","Hello","Hello","20","20","1 2","10.0","2 4 6","8 5 2","1","Geeksforgeeks 0","Hello 0","C"}};
    static String subb[][] = new String [num][num];
    String questions = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gxfhgcjhvkj);
        checking = (TextView) findViewById(R.id.textView);
        displayss = (Button) findViewById(R.id.abc);
        next= findViewById(R.id.abc2);



        displayss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                while (count<num)
                {
                    check=0;
                    k=rand.nextInt(13);
                    subb[0][count]=subjt[0][k];
                    subb[1][count]=subjt[1][k];
                    for(int i=0;i<num;i++)
                    {
                        if(subb[0][count]==subb[0][i])
                        {
                            check++;
                        }
                    }
                    if(check==1)
                        count++;
                }



                if (i<(num-1)) {
                    questions += Qnum + ")   " + subb[0][i+0]+"\n\n"+(Qnum+1) + ")   " + subb[0][i+1];
                    checking.setText(questions);
                    questions = "";
                    i+=2;
                    Qnum+=2;
                }
                else if (i<num)
                {
                    questions += Qnum + ")   " + subb[0][i+0];
                    checking.setText(questions);
                    questions = "";
                    i+=2;
                    Qnum+=2;
                }
                else
                {
                    displayss.setVisibility(View.INVISIBLE);
                    next.setVisibility(View.VISIBLE);
                    checking.setText("By Pressing AGREE Button, The Quiz Qill Be Saved And Finalized.\nThe Student Will Be Shown The Saved Quiz" +
                            "\nIf Another Quiz Is Created Before It Is Presented To Student, New Quiz Will Be Over Written On The Available Quiz");

                }
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(gxfhgcjhvkj.this, MainActivity.class);
                startActivity(intent);
                finish();

            }
        });
    }
}
