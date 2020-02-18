package com.example.fatafat;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DashboardActivity extends AppCompatActivity {
    private SessionHandler session;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        session = new SessionHandler(getApplicationContext());
        User user = session.getUserDetails();
        TextView welcomeText = findViewById(R.id.welcomeText);
     //   TextView sessionText = findViewById(R.id.sessionText);

        welcomeText.setText("Hello! "+user.getFullName());
     //   sessionText.setText("Session expires at "+user.getSessionExpiryDate());

        Button outpass = findViewById(R.id.outpass);

        outpass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent o=new Intent(DashboardActivity.this, OutpassActivity.class);
                startActivity(o);
            }
        });

        Button complaint = (Button)findViewById(R.id.complaint);

        complaint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent c=new Intent(DashboardActivity.this, ComplaintActivity.class);
                startActivity(c);
            }
        });

        Button button3 = findViewById(R.id.button3);

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent p=new Intent(DashboardActivity.this, UpdateActivity.class);
                startActivity(p);
            }
        });


        Button history = findViewById(R.id.history);

        history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h=new Intent(DashboardActivity.this, HistoryActivity.class);
                startActivity(h);
            }
        });




        Button logoutBtn = findViewById(R.id.btnLogout);

        logoutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                session.logoutUser();
                Intent i = new Intent(DashboardActivity.this, MainActivity.class);
                startActivity(i);
                finish();

            }
        });
    }
}