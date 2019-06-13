package com.example.final_test;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class BSA extends AppCompatActivity {

    EditText w,h,bmrb ;
    double weight,height,bmrd;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bsa);
    }

    public void click(View view){

        w = findViewById(R.id.wb);
        weight = Double.parseDouble(w.getText().toString());
        h = findViewById(R.id.hb);
        height = Double.parseDouble(h.getText().toString());
        bmrb = findViewById(R.id.eee);
        double BMI = weight/(height*height);
        bmrd = Double.parseDouble(bmrb.getText().toString());
        tv = findViewById(R.id.textView16);

        Bundle bnde = this.getIntent().getExtras();
        String sex = bnde.getString("sex");
        if (sex.equals("Male")) {
            double mbsa = (0.000579479) * Math.pow(weight,0.38) * Math.pow(height,1.24);
            double mocr = 209 * bmrd * mbsa/60;
            tv.setText("Body Surface Area :\n" + mbsa + "  m*m" +"\n" +
                    "Oxygen Consume Rate: \n" + mocr +"ml/min");
        }
        else {
            double fbsa = (0.000975382) * Math.pow(weight,0.46) * Math.pow(height,1.08);
            double focr = 209 * bmrd * fbsa/60;
            tv.setText("Body Surface Area :\n" + fbsa + "  m*m" +"\n" +
                    "Oxygen Consume Rate: \n" + focr +"ml/min");
        }

    }

    public void home (View view){ finish();}

}
