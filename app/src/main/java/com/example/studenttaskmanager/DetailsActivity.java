package com.example.studenttaskmanager;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class DetailsActivity extends AppCompatActivity {

    TextView detailTaskName, detailSubject, detailStatus;
    Button backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        detailTaskName = findViewById(R.id.detailTaskName);
        detailSubject = findViewById(R.id.detailSubject);
        detailStatus = findViewById(R.id.detailStatus);
        backButton = findViewById(R.id.backButton);

        String taskName = getIntent().getStringExtra("taskName");
        String subject = getIntent().getStringExtra("subject");
        boolean important = getIntent().getBooleanExtra("important", false);

        String status = important ? "Important task" : "Normal task";

        detailTaskName.setText(taskName);
        detailSubject.setText("Subject: " + subject);
        detailStatus.setText("Status: " + status);

        backButton.setOnClickListener(view -> finish());
    }
}