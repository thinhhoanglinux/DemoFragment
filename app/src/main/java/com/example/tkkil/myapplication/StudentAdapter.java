package com.example.tkkil.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by tkkil on 01-08-2017.
 */

public class StudentAdapter extends BaseAdapter{
    private List<Student> students;
    private Context mContext;
    public StudentAdapter(List<Student> students, Context mContext) {
        this.students = students;
        this.mContext = mContext;
    }

    @Override
    public int getCount() {
        return students.size();
    }

    @Override
    public Object getItem(int i) {
        return students.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }
    class ViewHolder{
        TextView textViewItem;
    }
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder;
        if(view == null){
            viewHolder = new ViewHolder();
            LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.item,null);
            viewHolder.textViewItem = (TextView) view.findViewById(R.id.textViewItem);
            view.setTag(viewHolder);
        }else{
            viewHolder= (ViewHolder) view.getTag();
        }
        Student student = students.get(i);
        viewHolder.textViewItem.setText(student.getName());
        return view;
    }

}
