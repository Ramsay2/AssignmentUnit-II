package com.example.recyclerview_iii;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements ItemClickListener {

    private ArrayList<Employee> employeeList = new ArrayList<>();
    private RecyclerView recyclerView;
    private CardView mEditCardView;
    private EditText mEtName, mEtAge, mEtAddress;
    private Button mBtnDone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        buildEmployeeList();
        setRecyclerView();
    }

    private void setRecyclerView() {
        EmployeeAdapter employeeAdapter = new EmployeeAdapter(employeeList, this);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(employeeAdapter);

    }

    private void buildEmployeeList() {
        for (int i = 0; i < 50; i++) {
            Employee employee = new Employee("Sachin", "hospital sector", i + 1);
            employeeList.add(employee);
        }
    }

    private void initView() {
        recyclerView = findViewById(R.id.recyclerView);
        mEditCardView = findViewById(R.id.editCardView);
        mEtName = findViewById(R.id.etName);
        mEtAge = findViewById(R.id.etAge);
        mEtAddress = findViewById(R.id.etAddress);
        mBtnDone = findViewById(R.id.btnDone);
    }


    @Override
    public void onItemClicked(int position, Employee employee) {
        mEditCardView.setVisibility(View.VISIBLE);
        mEtName.setText(employee.getName());
        mEtAge.setText(employee.getAge() + "");
        mEtAddress.setText(employee.getAddress());

        mBtnDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Employee new_employee = new Employee(mEtName.getText().toString(), mEtAddress.getText().toString()
                        , Integer.parseInt(mEtAge.getText().toString()));
                employeeList.set(position, new_employee);
                mEditCardView.setVisibility(View.GONE);
            }
        });

    }
}