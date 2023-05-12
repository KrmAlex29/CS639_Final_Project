package com.example.paceflex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class StudentAccount extends MainActivity {

    EditText studentInfoName, studentInfoAddress, studentInfoEmailAddress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_account);

        studentInfoName = (EditText) findViewById(R.id.studentName);
        studentInfoAddress = (EditText) findViewById(R.id.studentAddress);


    }
    public void studentInfoName(View view)
    {
        Intent intent = getIntent();
        String nameOfStudent = studentInfoName.getText().toString();
    }


}