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
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Switch swt1;
    Chronometer ch1;
    Button bt2,bt3;
    EditText edt1,edt2,edt3,edt4,edt5,edt6;
    RadioGroup rbg1;
    RadioButton rb1,rb2,rb3;
    ImageView img1;
    TextView tx1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tx1=(TextView)findViewById(R.id.textView12);
        swt1=(Switch)findViewById(R.id.switch1);
        ch1=(Chronometer)findViewById(R.id.chronometer3);
        bt2=(Button)findViewById(R.id.button2);
        bt3=(Button)findViewById(R.id.button3);
        edt1=(EditText)findViewById(R.id.editText);
        edt2=(EditText)findViewById(R.id.editText2);
        edt3=(EditText)findViewById(R.id.editText3);
        edt4=(EditText)findViewById(R.id.editText4);
        edt5=(EditText)findViewById(R.id.editText5);
        edt6=(EditText)findViewById(R.id.editText6);
        rbg1=(RadioGroup)findViewById(R.id.radioGroup);
        rb1=(RadioButton)findViewById(R.id.radioButton4);
        rb2=(RadioButton)findViewById(R.id.radioButton5);
        rb3=(RadioButton)findViewById(R.id.radioButton6);
        img1=(ImageView)findViewById(R.id.imageView);

    }
}
