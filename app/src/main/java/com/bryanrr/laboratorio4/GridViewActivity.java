package com.bryanrr.laboratorio4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import com.bryanrr.laboratorio4.adapter.StudentAdapterGrid;
import com.bryanrr.laboratorio4.model.Student;

import java.util.ArrayList;
import java.util.List;

public class GridViewActivity extends AppCompatActivity {
    List<Student> students = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view);
        GridView gridView = findViewById(R.id.gv_grid_view);


        students.add(new Student(
                "jean",
                "filosfo",
                "av-socrates", R.drawable.user_1));
        students.add(new Student(
                "mileny",
                "rockera",
                "av-tupac", R.drawable.user_2));
        students.add(new Student(
                "diana",
                "bailarina",
                "av-dnx", R.drawable.user_3));
        students.add(new Student(
                "Aracelli",
                "Millenials",
                "av-liertad", R.drawable.user_4));
        students.add(new Student(
                "Renata",
                "Administradora",
                "av-dolares", R.drawable.user_1));

        StudentAdapterGrid gridStudentAdapter = new StudentAdapterGrid(this, students);
        gridView.setAdapter(gridStudentAdapter);

    }
}
