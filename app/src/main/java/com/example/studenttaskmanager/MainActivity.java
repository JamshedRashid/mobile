package com.example.studenttaskmanager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText taskInput;
    Button addButton;
    TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        taskInput = findViewById(R.id.taskInput);
        addButton = findViewById(R.id.addButton);
        resultText = findViewById(R.id.resultText);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String task = taskInput.getText().toString();

                if (task.isEmpty()) {
                    resultText.setText("Please enter a task first.");
                } else {
                    resultText.setText("Added task: " + task);
                }
            }
        });
    }
}