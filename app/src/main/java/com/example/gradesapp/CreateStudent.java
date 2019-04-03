package com.example.gradesapp;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class CreateStudent extends AppCompatActivity {

    private EditText id, name, lastName, n1, n2, n3;
    private Resources resources;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_student);

        id = (EditText)findViewById(R.id.txtID);
        name = (EditText)findViewById(R.id.txtName);
        lastName = (EditText) findViewById(R.id.txtLastName);
        n1 = (EditText) findViewById(R.id.inputN1);
        n2 = (EditText) findViewById(R.id.inputN2);
        n3 = (EditText) findViewById(R.id.inputN3);
        resources = this.getResources();

    }
    public void addStudent(View view){
        String studentId = id.getText().toString();
        String studentName = name.getText().toString();
        String studentLastName = lastName.getText().toString();
        double studentN1 = Double.parseDouble(n1.getText().toString());
        double studentN2 = Double.parseDouble(n2.getText().toString());
        double studentN3 = Double.parseDouble(n3.getText().toString());

        if(studentN1 > 5 || studentN2 > 5 || studentN3 > 5){
            Toast.makeText(this, R.string.err, Toast.LENGTH_LONG).show();
        }else{
            Student newStudent = new Student(studentId,studentName,studentLastName,studentN1,studentN2,studentN3);
            newStudent.setMean();
            newStudent.addNewStudent();
        }
    }
}
