package com.example.listviewandspinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView tasksList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tasksList = findViewById(R.id.tasks);
        ArrayList<Task> tasks = new ArrayList<>();
            tasks.add(new Task("run","low"));
            tasks.add(new Task("task1","high"));
            tasks.add(new Task("task2","low"));

        ArrayAdapter<Task> taskArrayAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                tasks
        );

        tasksList.setAdapter(taskArrayAdapter);
    }
}