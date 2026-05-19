package com.example.studenttaskmanager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button openAddTaskButton;
    ListView taskListView;

    ArrayList<Task> taskList;
    TaskAdapter taskAdapter;

    public static final int ADD_TASK_REQUEST_CODE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        openAddTaskButton = findViewById(R.id.openAddTaskButton);
        taskListView = findViewById(R.id.taskListView);

        taskList = new ArrayList<>();
        taskAdapter = new TaskAdapter();
        taskListView.setAdapter(taskAdapter);

        openAddTaskButton.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, AddTaskActivity.class);
            startActivityForResult(intent, ADD_TASK_REQUEST_CODE);
        });

        taskListView.setOnItemClickListener((parent, view, position, id) -> {
            Task selectedTask = taskList.get(position);

            Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
            intent.putExtra("taskName", selectedTask.taskName);
            intent.putExtra("subject", selectedTask.subject);
            intent.putExtra("important", selectedTask.important);
            startActivity(intent);
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == ADD_TASK_REQUEST_CODE && resultCode == RESULT_OK) {
            String taskName = data.getStringExtra("taskName");
            String subject = data.getStringExtra("subject");
            boolean important = data.getBooleanExtra("important", false);

            Task newTask = new Task(taskName, subject, important);
            taskList.add(newTask);

            taskAdapter.notifyDataSetChanged();
        }
    }

    class Task {
        String taskName;
        String subject;
        boolean important;

        Task(String taskName, String subject, boolean important) {
            this.taskName = taskName;
            this.subject = subject;
            this.important = important;
        }
    }

    class TaskAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return taskList.size();
        }

        @Override
        public Object getItem(int position) {
            return taskList.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            if (convertView == null) {
                convertView = LayoutInflater.from(MainActivity.this).inflate(R.layout.task_row, parent, false);
            }

            ImageView taskIcon = convertView.findViewById(R.id.taskIcon);
            TextView taskTitleText = convertView.findViewById(R.id.taskTitleText);
            TextView taskSubjectText = convertView.findViewById(R.id.taskSubjectText);
            TextView taskStatusText = convertView.findViewById(R.id.taskStatusText);

            Task task = taskList.get(position);

            taskTitleText.setText(task.taskName);
            taskSubjectText.setText("Subject: " + task.subject);

            if (task.important) {
                taskStatusText.setText("Status: Important");
                taskIcon.setImageResource(android.R.drawable.star_big_on);
            } else {
                taskStatusText.setText("Status: Normal");
                taskIcon.setImageResource(android.R.drawable.ic_menu_agenda);
            }

            return convertView;
        }
    }
}