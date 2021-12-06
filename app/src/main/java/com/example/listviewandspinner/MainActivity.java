package com.example.listviewandspinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity {

    private ListView tasksList;
    private Spinner tasksSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*List View*/
        tasksList = findViewById(R.id.tasksList);
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

        /*Spaner*/
        tasksSpinner = findViewById(R.id.tasksSpinner);

//        ArrayList<String> intensityLevel = new ArrayList<>();
//
//        intensityLevel.add("Low");
//        intensityLevel.add("Moderate");
//        intensityLevel.add("High");
//
//        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(
//                this,
//                android.R.layout.simple_spinner_dropdown_item,
//                intensityLevel
//        );
//
//        tasksSpinner.setAdapter(arrayAdapter);

    }
}