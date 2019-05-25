package com.hfad.karankumar_bmi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Actvity2 extends AppCompatActivity {

    EditText a;
    EditText b;
    EditText r;

    Button c;

    Double d;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actvity2);

        a=findViewById(R.id.ht);
        b=findViewById(R.id.wt);
        r=findViewById(R.id.res);

        c=findViewById(R.id.b2);

        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double d1 = Double.parseDouble(a.getText().toString());
                double d2 = Double.parseDouble(b.getText().toString());

                d= d2/(d1*d1);

                r.setText(Double.toString(d));

                if(d>25.0)
                { Toast.makeText(getApplicationContext(),"You're Overweight!",Toast.LENGTH_SHORT).show();}

                if(d<18.5)
                { Toast.makeText(getApplicationContext(),"You're Underweight",Toast.LENGTH_SHORT).show();}

                if(d>18.5&&d<25.0)
                {Toast.makeText(getApplicationContext(),"You're Healthy!",Toast.LENGTH_SHORT).show();}


            }
        });


    }
}
