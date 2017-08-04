package com.example.tkkil.myapplication;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements SelectData{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void SelectData(Student student) {
        Fragment info = (Fragment) getFragmentManager().findFragmentById(R.id.fragment);
        Configuration configuration = getResources().getConfiguration();

        if(info != null && configuration.orientation == configuration.ORIENTATION_LANDSCAPE){
            info.setData(student);
        }else{
            startActivity(new Intent(MainActivity.this,Main2Activity.class)
                    .putExtra("student",student));
            overridePendingTransition(R.anim.anim_enter,R.anim.anim_exit);
        }
    }
}
