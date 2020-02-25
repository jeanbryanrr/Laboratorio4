package com.bryanrr.laboratorio4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.bryanrr.laboratorio4.adapter.StringAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<String> arrList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ListView listView = findViewById(R.id.lv_items);
        arrList.add("Adapter simple");
        arrList.add("Adapter holder");
        arrList.add("GridView Holder");
        arrList.add("RecyclerView");
        StringAdapter stringAdapter = new StringAdapter(this, android.R.layout.simple_list_item_1, arrList);
        listView.setAdapter(stringAdapter);


    }


}

