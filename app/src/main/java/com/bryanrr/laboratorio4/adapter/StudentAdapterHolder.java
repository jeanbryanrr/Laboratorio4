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

public class StudentAdapterHolder extends ArrayAdapter<Student> {
    public StudentAdapterHolder(@NonNull Context context, @NonNull List<Student> objects) {
        super(context, 0, objects);
    }

    private static class ViewHolder {
        TextView tvName;
        TextView tvDescription;
        TextView tvAddress;

    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        Student student = getItem(position);
        ViewHolder viewHolder;

        if (convertView == null) {
            viewHolder = new ViewHolder();
            LayoutInflater layoutInflater = LayoutInflater.from(getContext());
            convertView= layoutInflater.inflate(R.layout.item_student,parent,false);

            viewHolder.tvName = convertView.findViewById(R.id.txt_name);
            viewHolder.tvDescription = convertView.findViewById(R.id.txt_description);
            viewHolder.tvAddress = convertView.findViewById(R.id.txt_address);
            convertView.setTag(viewHolder);

        }
        else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        viewHolder.tvName.setText(student.getName());
        viewHolder.tvDescription.setText(student.getDescription());
        viewHolder.tvAddress.setText(student.getAddress());

        return convertView;
    }
}
