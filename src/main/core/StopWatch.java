package core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StopWatch {
    private long startTime = 0;
    private long stopTime = 0;
    private boolean running = false;


    void start() {
        this.startTime = System.currentTimeMillis();
        this.running = true;
    }

    void stop() {
        this.stopTime = System.currentTimeMillis();
        this.running = false;
    }

    //elaspsed time in milliseconds
    long getElapsedTime() {
        long elapsed;
        if (running) {
            elapsed = (System.currentTimeMillis() - startTime);
        } else {
            elapsed = (stopTime - startTime);
        }
        return elapsed;
    }

    //elaspsed time in seconds
    long getElapsedTimeSecs() {
        long elapsed;
        if (running) {
            elapsed = ((System.currentTimeMillis() - startTime) / 1000);
        } else {
            elapsed = ((stopTime - startTime) / 1000);
        }
        return elapsed;
    }


    public static void main(String[] args) {

//        List<String> list = new ArrayList<>();
//        list.add("A");
//        list.add("B");
//        list.add("A");
//        list.add("B");
////        for (int i = 0; i < list.size(); i++)
////            System.out.print(list.remove(i));
//
//
//        String element = "A";
//        for (int i = 0; i < list.size(); i++)
//            if (list.get(i).equals(element)) {
//                list.remove(element);
//                i--;
//            }

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.remove(2);
        System.out.println(list);
}}
