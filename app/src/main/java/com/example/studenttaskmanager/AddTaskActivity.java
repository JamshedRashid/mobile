package com.example.studenttaskmanager;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class AddTaskActivity extends AppCompatActivity {

    EditText taskNameInput, subjectInput;
    CheckBox importantCheckBox;
    Button saveTaskButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_task);

        taskNameInput = findViewById(R.id.taskNameInput);
        subjectInput = findViewById(R.id.subjectInput);
        importantCheckBox = findViewById(R.id.importantCheckBox);
        saveTaskButton = findViewById(R.id.saveTaskButton);

        saveTaskButton.setOnClickListener(view -> {
            String taskName = taskNameInput.getText().toString();
            String subject = subjectInput.getText().toString();
            boolean important = importantCheckBox.isChecked();

            Intent resultIntent = new Intent();
            resultIntent.putExtra("taskName", taskName);
            resultIntent.putExtra("subject", subject);
            resultIntent.putExtra("important", important);

            setResult(RESULT_OK, resultIntent);
            finish();
        });
    }
}