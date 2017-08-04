package com.example.tkkil.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Student student = (Student) getIntent().getSerializableExtra("student");
        Fragment fragment = (Fragment) getFragmentManager().findFragmentById(R.id.fragmentInfoMain);
        fragment.setData(student);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.anim_enter2, R.anim.anim_exit2);
    }
}
