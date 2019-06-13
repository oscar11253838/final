package com.example.final_test;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class BMI extends AppCompatActivity {

    EditText w,h,age ;
    double weight,height;
    TextView bmi , bmr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bmi);
    }

    public  void calculate (View view){

        w = findViewById(R.id.editText7);
        weight = Double.parseDouble(w.getText().toString());
        h = findViewById(R.id.editText8);
        height = Double.parseDouble(h.getText().toString());
        double BMI = weight/(height*height);
        bmi = findViewById(R.id.BMI);
        bmr = findViewById(R.id.BMR);
        age = findViewById(R.id.AGE);
        int a = Integer.parseInt(age.getText().toString());

        if(BMI <= 16){
            bmi.setText("Your Body Mass Index\n" + BMI + "\nseverely underweight");
            bmi.setTextColor(this.getResources().getColor(R.color.su));
        }else if(BMI > 16 && BMI <=18.5){
            bmi.setText("Your Body Mass Index\n" +BMI + "\nunderweight");
            bmi.setTextColor(this.getResources().getColor(R.color.u));
        }else if(BMI > 18.5 && BMI <= 25){
            bmi.setText("Your Body Mass Index\n" +BMI + "\nnormal");
            bmi.setTextColor(this.getResources().getColor(R.color.n));
        }else if(BMI > 25 && BMI <= 30 ){
            bmi.setText("Your Body Mass Index\n" +BMI + "\noverweight");
            bmi.setTextColor(this.getResources().getColor(R.color.o));
        }else if(BMI > 30 && BMI <= 35 ){
            bmi.setText("Your Body Mass Index\n" +BMI + "\nmoderately obese");
            bmi.setTextColor(this.getResources().getColor(R.color.mo));
        }
        else {
            bmi.setText("Your Body Mass Index\n" +BMI + "\nseverely obese");
            bmi.setTextColor(this.getResources().getColor(R.color.so));
        }
        Bundle bnde = this.getIntent().getExtras();
        String sex = bnde.getString("sex");

        if (sex.equals("Male")) {
            double mbmr = ((13.4 * weight) + (4.8 * height*100) - (5.7 * a))/1000 + 88.4;
            bmr.setText("Basal Metabolic Rate\n" + mbmr + "  Kcal");
        }
        else {
            double fbmr = ((9.3 * weight) + (3 * height*100) - (4.3 * a))/1000 + 477.6;
            bmr.setText("Basal Metabolic Rate\n" + fbmr + "  Kcal");
        }
    }

    public void home (View view){ finish();}


}
