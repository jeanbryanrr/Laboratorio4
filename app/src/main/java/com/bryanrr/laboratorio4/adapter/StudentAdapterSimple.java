package com.bryanrr.laboratorio4.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.bryanrr.laboratorio4.R;
import com.bryanrr.laboratorio4.model.Student;

import java.util.List;

public class StudentAdapterSimple extends ArrayAdapter<Student> {
    public StudentAdapterSimple(@NonNull Context context, @NonNull List<Student> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Student student = getItem(position);
        if (convertView == null) {
            LayoutInflater layoutInflater = LayoutInflater.from(getContext());
            convertView = layoutInflater.inflate(R.layout.item_student, parent, false);

        }

        TextView name = convertView.findViewById(R.id.txt_name);
        TextView dectiption = convertView.findViewById(R.id.txt_description);
        TextView address = convertView.findViewById(R.id.txt_address);

        name.setText(student.getName());
        dectiption.setText(student.getDescription());
        address.setText(student.getAddress());
        return convertView;

    }
}