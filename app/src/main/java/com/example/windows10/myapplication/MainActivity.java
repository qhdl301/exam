package com.example.windows10.myapplication;

import android.graphics.Color;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.Chronometer;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;


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
    LinearLayout lv1,lv2;
    int num1,num2,num3,sum1,sum2,year,month,day,hour,min;
    double avg1,avg2,avg3;




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
        lv1=(LinearLayout)findViewById(R.id.Linear1);
        lv2=(LinearLayout)findViewById(R.id.Linear2);


        swt1.setOnClickListener(new Switch.OnClickListener() {
            @Override
            public void onClick(View view) {
                ch1.setBase(SystemClock.elapsedRealtime());
                ch1.start();
                tx1.setTextColor(Color.BLUE);
                lv1.setVisibility(View.VISIBLE);
            }
        });

        bt2.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {

                num1= Integer.parseInt(edt1.getText().toString());
                num2= Integer.parseInt(edt2.getText().toString());
                num3= Integer.parseInt(edt3.getText().toString());
                sum1=num1+num2+num3;
                sum2=(num1*15000)+(num2*12000)+(num3*8000);
                edt4.setText(Integer.toString(sum1));

                if(edt1==null){
                    Toast.makeText(getApplicationContext(), "인원을 입력하세요.", Toast.LENGTH_SHORT).show();
                }
                else if(edt2==null){
                    Toast.makeText(getApplicationContext(), "인원을 입력하세요.", Toast.LENGTH_SHORT).show();
                }
                else if (edt3==null){
                    Toast.makeText(getApplicationContext(), "인원을 입력하세요.", Toast.LENGTH_SHORT).show();
                }

                if(rb1.isChecked()) {
                    edt6.setText(String.format("%.2f", avg1));
                }
                else if (rb2.isChecked()){
                    edt6.setText(String.format("%.2f", avg2));
                }
                else if(rb3.isChecked()){
                    edt6.setText(String.format("%.2f", avg3));
                }
            }
        });

        rbg1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if(rb1.isChecked()){
                    img1.setImageResource(R.drawable.java);
                    avg1=sum2*0.95;
                }
                else if(rb2.isChecked()){
                    img1.setImageResource(R.drawable.css);
                    avg2=sum2*0.9;
                }
                else if(rb3.isChecked()){
                    img1.setImageResource(R.drawable.jsp);
                    avg3=sum2*0.8;
                }
            }
        });

        bt3.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                lv1.setVisibility(View.INVISIBLE);
                lv2.setVisibility(View.VISIBLE);
                tx2.setTextColor(Color.RED);
            }
        });

        rbg2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if(i==R.id.radioButton7){
                    cv1.setVisibility(View.VISIBLE);
                    tp1.setVisibility(View.INVISIBLE);
                }
                else {
                    cv1.setVisibility(View.INVISIBLE);
                    tp1.setVisibility(View.VISIBLE);
                }

            }
        });


        cv1.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(CalendarView calendarView, int i, int i1, int i2) {
                year=i;
                month=i1;
                day=i2;
            }
        });

        tp1.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker timePicker, int i, int i1) {
                hour=i;
                min=i1;
            }
        });


        bt4.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(edt1==null){
                    Toast.makeText(getApplicationContext(), "인원예약을 먼저하세요.", Toast.LENGTH_SHORT).show();
                }
                else if (edt2==null){
                    Toast.makeText(getApplicationContext(), "인원예약을 먼저하세요.", Toast.LENGTH_SHORT).show();
                }
                else if(edt3==null){
                    Toast.makeText(getApplicationContext(), "인원예약을 먼저하세요.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
