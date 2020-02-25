package com.bryanrr.laboratorio4.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bryanrr.laboratorio4.R;
import com.bryanrr.laboratorio4.model.Student;
import com.bumptech.glide.Glide;

import java.util.List;

public class StudentAdapterGrid extends BaseAdapter {

    private static class ViewHolder {
        TextView name;
        ImageView photo;

    }

    private Context context;
    private List<Student> students;

    @Override
    public int getCount() {
        return students.size();
    }

    @Override
    public Object getItem(int position) {
        return students.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Student student = students.get(position);
        ViewHolder viewHolder;
        if (convertView == null) {
            viewHolder = new ViewHolder();
            LayoutInflater layoutInflater = LayoutInflater.from(context);
            convertView = layoutInflater.inflate(R.layout.item_grid_student, parent, false);
            viewHolder.photo = convertView.findViewById(R.id.imagen);
            viewHolder.name = convertView.findViewById(R.id.txtName);
            convertView.setTag(viewHolder);
        } else {

            viewHolder = (ViewHolder) convertView.getTag();
        }
        viewHolder.name.setText(student.getName());
        Glide.with(context)
                .load(student.getImageResource())
                .placeholder(R.drawable.placeholder)
                .into(viewHolder.photo);

        return convertView;
    }


    public StudentAdapterGrid(Context context, List<Student> students) {

        this.context = context;
        this.students = students;
    }
}
