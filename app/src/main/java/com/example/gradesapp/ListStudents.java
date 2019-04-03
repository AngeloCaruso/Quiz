package com.example.gradesapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListStudents extends AppCompatActivity {
    private ListView lv;
    private ArrayList<Student> students;
    private Intent In;
    private TextView defaultTxt;
    private ArrayList<String> listEachStudent = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.students_list);

        lv = (ListView) findViewById(R.id.orders);
        defaultTxt = (TextView) findViewById(R.id.no_students);
        students = StudentsList.listStudents();

        defaultTxt.setVisibility(View.VISIBLE);
        lv.setVisibility(View.INVISIBLE);

        if (students.size() > 0) {
            lv.setVisibility(View.VISIBLE);
            defaultTxt.setVisibility(View.INVISIBLE);

            for (int i = 0; i < students.size(); i++) {
                listEachStudent.add(students.get(i).getId() + "\n" + students.get(i).getName() + " " + students.get(i).getLastName());
            }
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listEachStudent);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                In = new Intent(ListStudents.this, StudentDetail.class);
                In.putExtra("position", position);
                startActivity(In);
            }
        });
    }
}
