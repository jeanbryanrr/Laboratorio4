package com.bryanrr.laboratorio4.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import com.bryanrr.laboratorio4.AdapterHolder;
import com.bryanrr.laboratorio4.AdapterSimple;
import com.bryanrr.laboratorio4.GridViewActivity;
import com.bryanrr.laboratorio4.RecyclerActivity;

import java.util.List;

public class StringAdapter extends ArrayAdapter<String> {

    private List<String> list;
    private Context context;
    private int resource;


    public StringAdapter(@NonNull Context context, int resource, @NonNull List<String> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.list = objects;
    }


    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(getContext());
        View view = layoutInflater.inflate(resource, null, false);
        TextView textView = view.findViewById(android.R.id.text1);

        textView.setText(list.get(position));

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedActivity(position);
            }
        });

        return view;
    }

    private void selectedActivity(int postion) {

        Intent intent;


        switch (postion) {
            case 0:
                intent = new Intent(context, AdapterSimple.class);
                context.startActivity(intent);
                break;
            case 1:
                intent = new Intent(context, AdapterHolder.class);
                context.startActivity(intent);
                break;
            case 2:
                intent = new Intent(context, GridViewActivity.class);
                context.startActivity(intent);
                break;
            case 3:
                intent = new Intent(context, RecyclerActivity.class);
                context.startActivity(intent);
                break;
        }
    }

}
