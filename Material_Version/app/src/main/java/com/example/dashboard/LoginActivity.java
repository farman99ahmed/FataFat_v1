package com.example.dashboard;

import android.content.Intent;
import android.os.Handler;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    Button login;
    TextInputLayout tl1, tl2;
    TextView tv1;
    Handler handler = new Handler();
    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            tl1.setVisibility(View.VISIBLE);
            tl2.setVisibility(View.VISIBLE);
            tv1.setVisibility(View.VISIBLE);
            login.setVisibility(View.VISIBLE);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        tl1 = (TextInputLayout)findViewById(R.id.tl1);
        tl2 = (TextInputLayout)findViewById(R.id.tl2);
        login=(Button)findViewById(R.id.btn_login);
        tv1=(TextView)findViewById(R.id.link_signup);
        handler.postDelayed(runnable, 2000);


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this, MainActivity.class));
            }
        });
    }
}
