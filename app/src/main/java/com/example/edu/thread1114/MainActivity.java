package com.example.edu.thread1114;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((Button)findViewById(R.id.button1)).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        final String TAG = "ErrorThreadActivityTag";
        long endTime = System.currentTimeMillis() + 20*50;
        Log.i(TAG,"Thread running!");
        TextView threadValue = (TextView)findViewById(R.id.threadValue);
        while (System.currentTimeMillis()<endTime){
            synchronized (this){
                Log.i(TAG,"Thread running!");
                threadValue.setText(String.valueOf(System.currentTimeMillis()));
            }
        }

    }
}
