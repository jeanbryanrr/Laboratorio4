package com.bryanrr.laboratorio4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.bryanrr.laboratorio4.adapter.StudentAdapterSimple;
import com.bryanrr.laboratorio4.model.Student;

import java.util.ArrayList;
import java.util.List;

public class AdapterSimple extends AppCompatActivity {
    List<Student> students = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adapter_simple);


        ListView listView = findViewById(R.id.lv_simple);
        students.add(new Student("jean", "filosfo", "av-socrates"));
        students.add(new Student("mileny", "rockera", "av-tupac"));
        students.add(new Student("diana", "bailarina", "av-dnx"));
        students.add(new Student("Aracelli", "Millenials", "av-liertad"));
        students.add(new Student("Renata", "Administradora", "av-dolares"));

        StudentAdapterSimple adapterSimple = new StudentAdapterSimple(this, students);
        listView.setAdapter(adapterSimple);
    }
}
