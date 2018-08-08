package com.sms.demo.radiobuttonandgroup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioGroup rg1,rg2;
    Button btn_submit_;
    int count_;
    boolean q1,q2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init_views();
        init_variables();
        init_listener();
        init_functions();
    }

    private void init_views() {
        rg1 = (RadioGroup)findViewById(R.id.rg_q1);
        rg2 = (RadioGroup)findViewById(R.id.rg_Q2);
        btn_submit_ = (Button)findViewById(R.id.btn_Submit);
    }

    private void init_variables() {
       count_ = 0;
    }


    private void init_listener() {

        rg1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                int ans = rg1.getCheckedRadioButtonId();
                if(ans == R.id.rb3_G1){

                    q1 = true;
//                    count_++;
//                    Log.d("G1","OKK");
                }else
                    q1 = false;
            }
        });

        rg2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                int ans2 = rg2.getCheckedRadioButtonId();
                if(ans2==R.id.rb1_G2){

                    q2 =true;
//                    count_++;
//                    Log.d("G2","OKK");
                }else
                    q2 = false;
            }
        });



        btn_submit_.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(q1&&q2){
                    count_ = 2;
                }else if(q1||q2){
                    count_ = 1;
                }else
                    count_ = 0;

                Toast.makeText(getApplicationContext(),Integer.toString(count_),Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(MainActivity.this,Result.class);
                intent.putExtra("xyz",count_);
                startActivity(intent);
                //count_ = 0;
            }
        });



    }

    private void init_functions() {

    }
}
