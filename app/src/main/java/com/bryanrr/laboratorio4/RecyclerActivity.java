package com.bryanrr.laboratorio4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ListView;

import com.bryanrr.laboratorio4.adapter.StudentRecyclerAdapter;
import com.bryanrr.laboratorio4.model.Student;

import java.util.ArrayList;
import java.util.List;

public class RecyclerActivity extends AppCompatActivity {
    private List<Student> students = new ArrayList<>();
    private RecyclerView recyclerView;
    private StudentRecyclerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);


        students.add(new Student("jean", "filosfo", "av-socrates"));
        students.add(new Student("mileny", "rockera", "av-tupac"));
        students.add(new Student("diana", "bailarina", "av-dnx"));
        students.add(new Student("Aracelli", "Millenials", "av-liertad"));
        students.add(new Student("Renata", "Administradora", "av-dolares"));
        recyclerView = (RecyclerView) findViewById(R.id.rcv_main);
        adapter = new StudentRecyclerAdapter(students);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
       // RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(getApplicationContext(), 3, GridLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setAdapter(adapter);

    }
}
