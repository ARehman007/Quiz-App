package com.example.quizoid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class ogenerate extends AppCompatActivity {

    TextView display;
    Button show,finalize;
    static int j=4;
    int i=0,count=0,check,k,Qnum=1;
    static int num=Objectivee.objnumm;
    Random rand = new Random();

    String objt[][] = {{" Which of these operators is used to allocate memory to array variable in Java?\r\n" +
            "a) malloc\n" +
            "b) alloc\n" +
            "c) new\n" +
            "d) new malloc",

            " Which of these is an incorrect array declaration?\r\n" +
                    "a) int arr[] = new int[5]\r\n" +
                    "b) int [] arr = new int[5]\r\n" +
                    "c) int arr[] = new int[5]\r\n" +
                    "d) int arr[] = int [5] new",

            " What will be the output of the following Java code?\r\n" +
                    "\r\n" +
                    "    int arr[] = new int [5];\r\n" +
                    "    System.out.print(arr);\r\n" +
                    "a) 0\r\n" +
                    "b) value stored in arr[0]\r\n" +
                    "c) 00000\r\n" +
                    "d) Class name@ hashcode in hexadecimal form",

            " Which of these is an incorrect Statement?\r\n" +
                    "a) It is necessary to use new operator to initialize an array\r\n" +
                    "b) Array can be initialized using comma separated expressions surrounded by curly braces\r\n" +
                    "c) Array can be initialized when they are declared\r\n" +
                    "d) None of the mentioned",

            " Which of the following can be operands of arithmetic operators?\r\n" +
                    "a) Numeric\r\n" +
                    "b) Boolean\r\n" +
                    "c) Characters\r\n" +
                    "d) Both Numeric & Characters",

            " Modulus operator, %, can be applied to which of these?\r\n" +
                    "a) Integers\r\n" +
                    "b) Floating – point numbers\r\n" +
                    "c) Both Integers and floating – point numbers\r\n" +
                    "d) None of the mentioned",

            "With x = 0, which of the following are legal lines of Java code for changing the value of x to 1?\r\n" +
                    "\r\n" +
                    "   1. x++;\r\n" +
                    "   2. x = x + 1;\r\n" +
                    "   3. x += 1;\r\n" +
                    "   4. x =+ 1;\r\n" +
                    "a) 1, 2 & 3\r\n" +
                    "b) 1 & 4\r\n" +
                    "c) 1, 2, 3 & 4\r\n" +
                    "d) 3 & 2",

            " Decrement operator, −−, decreases the value of variable by what number?\r\n" +
                    "a) 1\r\n" +
                    "b) 2\r\n" +
                    "c) 3\r\n" +
                    "d) 4",

            " Which error will be produced if private members are accessed?\n" +
                    "a) Can’t access private message\n" +
                    "b) Code unreachable\n" +
                    "c) Core dumped\n" +
                    "d) Bad code",

            " Can main() function be made private?\n" +
                    "a) Yes, always\n" +
                    "b) Yes, if program doesn’t contain any classes\n" +
                    "c) No, because main function is user defined\n" +
                    "d) No, never",

            " If a function in java is declared private then it __________________\n" +
                    "a) Can’t access the standard output\n" +
                    "b) Can access the standard output\n" +
                    "c) Can’t access any output stream\n" +
                    "d) Can access only the output streams",

            " How many basic types of inheritance are provided as OOP feature?\n" +
                    "a) 4\n" +
                    "b) 3\n" +
                    "c) 2\n" +
                    "d) 1",

            " Which among the following best defines single level inheritance?\n" +
                    "a) A class inheriting a derived class\n" +
                    "b) A class inheriting a base class\n" +
                    "c) A class inheriting a nested class\n" +
                    "d) A class which gets inherited by 2 classes",

            " Which among the following is correct for multiple inheritance?\n" +
                    "a) class student{public: int marks;}s; class stream{int total;}; class topper:public student, public stream{ };\n" +
                    "b) class student{int marks;}; class stream{ }; class topper: public student{ };\n" +
                    "c) class student{int marks;}; class stream:public student{ };\n" +
                    "d) class student{ }; class stream{ }; class topper{ };",

            " Which programming language doesn’t support multiple inheritance?\n" +
                    "a) C++ and Java\n" +
                    "b) C and C++\n" +
                    "c) Java and SmallTalk\n" +
                    "d) Java",

            " Which among the following is correct for hierarchical inheritance?\n" +
                    "a) Two base classes can be used to be derived into one single class\n" +
                    "b) Two or more classes can be derived into one class\n" +
                    "c) One base class can be derived into other two derived classes or more\n" +
                    "d) One base class can be derived into only 2 classes",

            " Which is the correct syntax of inheritance?\n" +
                    "a) class derived_classname : base_classname{ /*define class body*/ };\n" +
                    "b) class base_classname : derived_classname{ /*define class body*/ };\n" +
                    "c) class derived_classname : access base_classname{ /*define class body*/ };\n" +
                    "d) class base_classname :access derived_classname{ /*define class body*/ };",

            " Which type of inheritance leads to diamond problem?\n" +
                    "a) Single level\n" +
                    "b) Multi-level\n" +
                    "c) Multiple\n" +
                    "d) Hierarchical",

            " Which access type data gets derived as private member in derived class:\n" +
                    "a) Private\n" +
                    "b) Public\n" +
                    "c) Protected\n" +
                    "d) Protected and Private",

            " If a base class is inherited in protected access mode then which among the following is true?\n" +
                    "a) Public and Protected members of base class becomes protected members of derived class\n" +
                    "b) Only protected members become protected members of derived class\n" +
                    "c) Private, Protected and Public all members of base, become private of derived class\n" +
                    "d) Only private members of base, become private of derived class",

            " Hiding the implementation complexity can ____________\n" +
                    "a) Make the programming easy\n" +
                    "b) Make the programming complex\n" +
                    "c) Provide more number of features\n" +
                    "d) Provide better features",

            " Class is _________ abstraction.\n" +
                    "a) Object\n" +
                    "b) Logical\n" +
                    "c) Real\n" +
                    "d) Hypothetical",

            " If there are 5 classes, E is derived from D, D from C, C from B and B from A. Which class constructor will be called first if the object of E or D is created?\n" +
                    "a) A\n" +
                    "b) B\n" +
                    "c) C\n" +
                    "d) A and B",

            " If all the classes use private inheritance in multilevel inheritance then ______________\n" +
                    "a) It will not be called multilevel inheritance\n" +
                    "b) Each class can access only non-private members of its parent\n" +
                    "c) Each subsequent class can access all members of previous level parent classes\n" +
                    "d) None of the members will be available to any other class",

            " Multilevel inheritance allows _________________ in the program.\n" +
                    "a) Only 7 levels of inheritance\n" +
                    "b) At least 7 levels of inheritance\n" +
                    "c) At most 16 levels of inheritance\n" +
                    "d) As many levels of inheritance as required",

            " If all the classes used parameterized constructors and no default constructor then ___________\n" +
                    "a) The object of lower level classes can’t be created\n" +
                    "b) Object of lower level classes must call parent class constructors explicitly\n" +
                    "c) Object of lower level classes must define all the default constructors\n" +
                    "d) Only object of first class can be created, which is first parent",

            " Is it compulsory for all the classes in multilevel inheritance to have constructors defined explicitly if only last derived class object is created?\n" +
                    "a) Yes, always\n" +
                    "b) Yes, to initialize the members\n" +
                    "c) No, it not necessary\n" +
                    "d) No, Constructor must not be defined",

            " Which among the following is correct to call a private member from outside the class?\n" +
                    "a) object.memberfunction( parameters );\n" +
                    "b) object->memberfunction( parameters );\n" +
                    "c) object->memberfunction( parameteres); or object.memberfunction( parameters );\n" +
                    "d) Not possible",

            " Which among the following is true?\n" +
                    "a) Private member functions can’t be overloaded\n" +
                    "b) Private member functions can be overridden\n" +
                    "c) Private member functions can’t be overloaded with a public member\n" +
                    "d) Private member function can’t be overridden",

            " If pointer to an object is declared __________\n" +
                    "a) It can store any type of address\n" +
                    "b) It can store only void addresses\n" +
                    "c) It can only store address of integer type\n" +
                    "d) It can only store object address of class type specified"
    }
            ,{"c","d","d","a","d","c","c","a","a","d","b","a","b","a","d","c","c","c","a","a","a","b","a","b","d","b","c","d","d","d"}};
    static String objj[][] = new String[num][num];

    String questions="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ogenerate);

        display= findViewById(R.id.qdisplay);
        show= findViewById(R.id.display);
        finalize= findViewById(R.id.doneobj);

        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                while (count<num)
                {
                    check=0;
                    k=rand.nextInt(30);
                    objj[0][count]=objt[0][k];
                    objj[1][count]=objt[1][k];
                    for(int i=0;i<num;i++)
                    {
                        if(objj[0][count]==objj[0][i])
                        {
                            check++;
                        }
                    }
                    if(check==1)
                        count++;
                }



                if (i<(num-3))
                {
                    questions+= Qnum+"\t"+objj[0][i+0]+"\n\n"+(Qnum+1)+"\t"+objj[0][i+1]+"\n\n"+(Qnum+2)+"\t"+objj[0][i+2]+"\n\n"+(Qnum+3)+"\t"+objj[0][i+3]+"\n\n";
                    display.setText(questions);
                    questions="";
                    i+=4;
                    Qnum+=4;
                }
                else if(i<num)
                {
                    for(int k=0;k<=(num-i);k++)
                    {
                        questions+=(Qnum+k)+"\t"+objj[0][i]+"\n\n";
                        i++;
                    }
                    display.setText(questions);
                }
                else
                {
                    display.setText("By pressing AGREE Button, the quiz will be saved and finalized.\nThe student will be shown the saved quiz" +
                            "\nIf another quiz is created before it is presented to student, new quiz will be over written on the available quiz");
                    show.setVisibility(View.INVISIBLE);
                    finalize.setVisibility(View.VISIBLE);
                }
//                else if(num-(i-3)!=0)
//                {
//                    questions="";
//                    for(int k=num-(i-3);k<num;k++)
//                    {
//                        questions+=objt[0][k]+"\n";
//                    }
//                    display.setText(questions);
//                }
                }
        });
        finalize.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ogenerate.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}