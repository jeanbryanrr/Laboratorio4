package com.bryanrr.laboratorio4.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bryanrr.laboratorio4.R;
import com.bryanrr.laboratorio4.model.Student;

import java.util.List;

public class StudentRecyclerAdapter extends RecyclerView.Adapter<StudentRecyclerAdapter.RecyclerViewHolderx> {
    private List<Student> studentList;

    public StudentRecyclerAdapter(List<Student> list) {
        studentList = list;
    }

    @NonNull
    @Override
    public RecyclerViewHolderx onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_student, parent, false);

        return new RecyclerViewHolderx(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolderx holder, int position) {

        Student student = studentList.get(position);
        holder.tvName.setText(student.getName());
        holder.tvAddress.setText(student.getAddress());
        holder.tvDescription.setText(student.getDescription());
    }

    @Override
    public int getItemCount() {
        return studentList.size();
    }

    public static class RecyclerViewHolderx extends RecyclerView.ViewHolder {

        public TextView tvName;
        public TextView tvDescription;
        public TextView tvAddress;

        public RecyclerViewHolderx(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.txt_name);
            tvDescription = itemView.findViewById(R.id.txt_description);
            tvAddress = itemView.findViewById(R.id.txt_address);
        }
    }
}
