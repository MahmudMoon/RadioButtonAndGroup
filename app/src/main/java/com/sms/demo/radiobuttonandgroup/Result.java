package com.sms.demo.radiobuttonandgroup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Result extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        textView = (TextView)findViewById(R.id.tv_res);

        Intent intent = getIntent();
        int res = intent.getIntExtra("xyz",0);
        textView.setText(Integer.toString(res));
    }
}
