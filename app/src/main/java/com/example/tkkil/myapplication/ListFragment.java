package com.example.tkkil.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
/**
 * Created by tkkil on 01-08-2017.
 */

public class ListFragment extends android.app.ListFragment {
    ArrayList<Student> students;
    StudentAdapter adapter;
    SelectData selectData;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.list_fragment,container,false);
        selectData = (SelectData) getActivity();
        addSV();
        adapter = new StudentAdapter(students,getActivity());
        setListAdapter(adapter);
        return view;
    }

    private void addSV() {
        students = new ArrayList<>();
        students.add(new Student("Nguyen Van A",21,"Male"));
        students.add(new Student("Nguyen Van B",22,"Female"));
        students.add(new Student("Nguyen Van C",23,"Male"));
        students.add(new Student("Nguyen Van D",24,"Male"));
        students.add(new Student("Nguyen Van E",25,"Female"));
        students.add(new Student("Nguyen Van F",26,"Male"));
        students.add(new Student("Nguyen Van G",27,"Male"));
        students.add(new Student("Nguyen Van H",28,"Female"));
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        selectData.SelectData(students.get(position));
        super.onListItemClick(l, v, position, id);
    }
}
