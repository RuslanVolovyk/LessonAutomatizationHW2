package core;

public class StopWatch {
    private  long startTime = 0;
    private  long stopTime = 0;
    private  boolean running = false;


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


}
