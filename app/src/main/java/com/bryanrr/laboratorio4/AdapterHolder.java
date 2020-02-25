package com.bryanrr.laboratorio4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.bryanrr.laboratorio4.adapter.StudentAdapterHolder;
import com.bryanrr.laboratorio4.model.Student;

import java.util.ArrayList;
import java.util.List;

public class AdapterHolder extends AppCompatActivity {
    List<Student> students = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adapter_holder);

        ListView listView = findViewById(R.id.lv_holder);
        students.add(new Student("xxxfffx", "filosfo", "av-socrates"));
        students.add(new Student("mileny", "rockera", "av-tupac"));
        students.add(new Student("diana", "bailarina", "av-dnx"));
        students.add(new Student("Aracelli", "Millenials", "av-liertad"));
        students.add(new Student("Renata", "Administradora", "av-dolares"));
        StudentAdapterHolder holder = new StudentAdapterHolder(this,students);

        listView.setAdapter(holder);
    }
}
