package com.example.tkkil.myapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by tkkil on 01-08-2017.
 */

public class Fragment extends android.app.Fragment{
    TextView textViewName, textViewAge, textViewGender;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.info_fragment, container, false);
        textViewName = (TextView) view.findViewById(R.id.textViewName);
        textViewAge = (TextView) view.findViewById(R.id.textViewAge);
        textViewGender = (TextView) view.findViewById(R.id.textViewGender);
        return view;
    }

    public void setData(Student student){
        textViewName.setText("Name: " + student.getName());
        textViewAge.setText("Age: " + String.valueOf(student.getAge()));
        textViewGender.setText("Gender: " + student.getGender());
    }
}
