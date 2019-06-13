package com.example.final_test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void bir(View v){
        String sex="";
        RadioButton rb1 = (RadioButton) findViewById(R.id.sex1);

        if (rb1.isChecked()) {
            sex = "Male";
        }
        else {
            sex = "Female";
        }
        Intent intent = new Intent();
        intent.setClass(MainActivity.this,BMI.class);

        Bundle bndl = new Bundle();
        bndl.putString("sex",sex);
        intent.putExtras(bndl);

        startActivity(intent);

    }

    public void bsa(View view){
        String sex="";
        RadioButton rb1 = (RadioButton) findViewById(R.id.sex1);

        if (rb1.isChecked()) {
            sex = "Male";
        }
        else {
            sex = "Female";
        }
        Intent intent = new Intent();
        intent.setClass(MainActivity.this,BSA.class);

        Bundle bndl = new Bundle();
        bndl.putString("sex",sex);
        intent.putExtras(bndl);

        startActivity(intent);

    }

    public void  exit(View v){ finish(); }
}
