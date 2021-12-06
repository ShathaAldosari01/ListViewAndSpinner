package com.example.listviewandspinner;

import java.util.Random;

public class Task {

    private String taskID;
    private String name;
    private String intensityLevel;
    private boolean cheacked;

    public Task(String n, String i){
        name= n;
        intensityLevel=i;
        cheacked=false;
        //gnrat id
        Random random= new Random();
        int ids[]= new int[6];
        ids[0] = random.nextInt(90-65)+65;//0-9
        ids[1] = random.nextInt(90-65)+65;
        ids[2] = random.nextInt(122-97)+97;
        ids[3] = random.nextInt(122-97)+97;
        ids[4] = random.nextInt(10);
        ids[5] = random.nextInt(10);
        taskID= ""+(char)ids[0]+(char)ids[1]+(char)ids[2]+(char)ids[3]+ids[4]+ids[5];
    }

    public void displayTaskInfo(){
        //TODO displayTaskInfo
    }

    public void cheackTask(){
        cheacked = !cheacked;
    }

    public boolean deleteTask(){
        //TODO deleteTask
        return true;
    }

    public boolean approveDeletion(boolean b){
        //TODO approveDeletion
        return true;
    }

    //Getter, Setters
    public String getName(){
        return name;
    }

    public String getIntensityLevel(){
        return intensityLevel;
    }

    public boolean getCheacked(){
        return cheacked;
    }

    public String getId(){
        return taskID;
    }

    public String toString(){
        return name;
    }

}
