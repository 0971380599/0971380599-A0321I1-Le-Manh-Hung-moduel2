package bai_4_lop_va_doi_tuong_trong_java.bai_tap;

import java.time.LocalTime;

public class StopWatch {
    private LocalTime startTime, endTime;

    public StopWatch() {
    }

    public StopWatch(LocalTime startTime, LocalTime endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public LocalTime getStartTime() {
        return this.startTime;
    }

    public LocalTime getEndTime() {
        return this.endTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }

    public void start() {
        this.startTime = LocalTime.now();
    }

    public void stop() {
        this.endTime = LocalTime.now();
    }

    public int getElapsedTime() {
        return (endTime.getHour() - startTime.getHour()) * 3600 + (endTime.getMinute() - startTime.getMinute()) * 60 + (endTime.getSecond() - startTime.getSecond()) * 1000;
    }

    public static int[] selectionSort(int... a) {
        int minIndex = 0;
        for (int i = 0; i < a.length - 1; i++) {
            minIndex = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[i]) {
                    minIndex = j;
                }
                int tempt = a[minIndex];
                a[i] = a[minIndex];
                a[minIndex] = tempt;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int[] a = new int[100000];
        for (int i = 0; i < 100000; i++) {
            a[i] = (int) (Math.random() * 1000);
        }
        StopWatch startWatch = new StopWatch();
        startWatch.start();
        a = selectionSort(a);
        for (int x : a) {
            System.out.println(x);
        }
        startWatch.stop();
        System.out.println(startWatch.getStartTime() + "+" + startWatch.getEndTime());
        System.out.println("Time: " + startWatch.getElapsedTime());

    }
}
