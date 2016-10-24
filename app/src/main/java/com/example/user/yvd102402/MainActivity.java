package com.example.user.yvd102402;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn2 = (Button) findViewById(R.id.button2);
        MyListener listener = new MyListener();
        btn2.setOnClickListener(listener);
    }

    class MyListener implements View.OnClickListener
    {
        @Override
        public void onClick(View v) {
            Log.d("MYLOG", "onClick");
        }
    }

    public void click1(View v)
    {

    }
}
