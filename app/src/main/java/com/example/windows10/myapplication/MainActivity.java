package com.example.windows10.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    Switch swt1;
    Chronometer ch1;
    Button bt1,bt2,bt3;
    EditText edt1,edt2,edt3,edt4,edt5,edt6;
    RadioGroup rbg1;
    RadioButton rb1,rb2,rb3;
    ImageView img1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        swt1=(Switch)findViewById(R.id.switch1);
        ch1=(Chronometer)findViewById(R.id.chronometer3);
        bt1=(Button)findViewById(R.id.button);
    }
}
