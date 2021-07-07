package com.example.recyclerview_i;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<Student> studentList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        buildStudentList();
        setRecyclerView();
    }

    private void buildStudentList() {
        studentList = new ArrayList<>();
        Student student1 = new Student("Anush", 22, "EMP123");
        studentList.add(student1);
        for (int i = 0; i < 14; i++) {
            Student student = new Student("XYZ-" + i, 22, "EMP125");
            studentList.add(student);
        }

    }

    private void setRecyclerView() {

        StudentAdapter studentAdapter = new StudentAdapter(studentList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(studentAdapter);
    }

    private void initView() {
        recyclerView = findViewById(R.id.recyclerView);
    }

}