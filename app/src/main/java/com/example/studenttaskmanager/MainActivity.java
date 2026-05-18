package com.example.studenttaskmanager;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button openAddTaskButton;
    TextView homeResultText;

    public static final int ADD_TASK_REQUEST_CODE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        openAddTaskButton = findViewById(R.id.openAddTaskButton);
        homeResultText = findViewById(R.id.homeResultText);

        openAddTaskButton.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, AddTaskActivity.class);
            startActivityForResult(intent, ADD_TASK_REQUEST_CODE);
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == ADD_TASK_REQUEST_CODE && resultCode == RESULT_OK) {
            String taskName = data.getStringExtra("taskName");
            String subject = data.getStringExtra("subject");
            boolean important = data.getBooleanExtra("important", false);

            String status = important ? "Important" : "Normal";

            homeResultText.setText("Task: " + taskName + "\nSubject: " + subject + "\nStatus: " + status);
        }
    }
}