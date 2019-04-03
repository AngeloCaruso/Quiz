package com.example.gradesapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.util.ArrayList;

public class StudentDetail extends AppCompatActivity {
    private TextView id, name, n1, n2, n3, mean;
    private int selectedStudent;
    private Intent pos;
    private ArrayList<Student> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.student_detail);

        id = (TextView)findViewById(R.id.viewID);
        name = (TextView)findViewById(R.id.viewName);
        n1 = (TextView)findViewById(R.id.viewN1);
        n2 = (TextView)findViewById(R.id.viewN2);
        n3 = (TextView)findViewById(R.id.viewN3);
        mean = (TextView)findViewById(R.id.viewMean);

        pos = getIntent();
        list = StudentsList.listStudents();
        selectedStudent = pos.getIntExtra("position",0);

        id.setText(list.get(selectedStudent).getId());
        name.setText(list.get(selectedStudent).getName() + " " + list.get(selectedStudent).getLastName());
        n1.setText(String.valueOf(list.get(selectedStudent).getN1()));
        n2.setText(String.valueOf(list.get(selectedStudent).getN2()));
        n3.setText(String.valueOf(list.get(selectedStudent).getN3()));
        mean.setText(String.valueOf(list.get(selectedStudent).getMean()));
    }

}
