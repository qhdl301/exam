package com.example.windows10.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.Chronometer;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {

    Switch swt1;
    Chronometer ch1;
    Button bt2,bt3,bt4,bt5;
    EditText edt1,edt2,edt3,edt4,edt5,edt6;
    RadioGroup rbg1,rbg2;
    RadioButton rb1,rb2,rb3,rb4,rb5;
    ImageView img1;
    TimePicker tp1;
    CalendarView cv1;
    TextView tx1,tx2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tx1=(TextView)findViewById(R.id.textView12);
        tx2=(TextView)findViewById(R.id.textView13);
        swt1=(Switch)findViewById(R.id.switch1);
        ch1=(Chronometer)findViewById(R.id.chronometer3);
        bt2=(Button)findViewById(R.id.button2);
        bt3=(Button)findViewById(R.id.button3);
        bt4=(Button)findViewById(R.id.button4);
        bt5=(Button)findViewById(R.id.button5);
        edt1=(EditText)findViewById(R.id.editText);
        edt2=(EditText)findViewById(R.id.editText2);
        edt3=(EditText)findViewById(R.id.editText3);
        edt4=(EditText)findViewById(R.id.editText4);
        edt5=(EditText)findViewById(R.id.editText5);
        edt6=(EditText)findViewById(R.id.editText6);
        rbg1=(RadioGroup)findViewById(R.id.radioGroup);
        rbg2=(RadioGroup)findViewById(R.id.radioGroup2);
        rb1=(RadioButton)findViewById(R.id.radioButton4);
        rb2=(RadioButton)findViewById(R.id.radioButton5);
        rb3=(RadioButton)findViewById(R.id.radioButton6);
        rb4=(RadioButton)findViewById(R.id.radioButton7);
        rb5=(RadioButton)findViewById(R.id.radioButton8);
        img1=(ImageView)findViewById(R.id.imageView);
        cv1=(CalendarView)findViewById(R.id.calendarView);
        tp1=(TimePicker)findViewById(R.id.timePicker);


        swt1.setOnClickListener(new Switch.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }
}
