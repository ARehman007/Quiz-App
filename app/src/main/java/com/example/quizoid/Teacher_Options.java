package com.example.quizoid;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Teacher_Options extends AppCompatActivity {
    Button exam,results;
    TextView a,b;
    DatabaseHelper zain_database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher__options);


        zain_database = new DatabaseHelper(this);
        exam = findViewById(R.id.move);
        results = findViewById(R.id.database);

        exam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Teacher_Options.this , QuestionType.class);
                startActivity(intent);
            }
        });

                results.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View view) {

                        Cursor data = zain_database.showData();
                        if (data.getCount()==0) {
                            display("ERROR" , "NO DATA FOUND");
                            return;
                        }
                        StringBuffer buffer = new StringBuffer();
                        while (data.moveToNext()){
                            buffer.append("NAME: "+data.getString(0)+"\n");
                            buffer.append("REG_NO: "+data.getString(1)+"\n");
                            buffer.append("Percentage: "+data.getString(2)+"\n\n");
                        }
                        display("STUDENT RECORDS: " , buffer.toString());
                    }
                });
            }


    public void display(String title , String Message){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(Message);

        builder.show();
    }
}
