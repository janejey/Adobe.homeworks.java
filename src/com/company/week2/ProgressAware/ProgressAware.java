package com.company.week2.ProgressAware;

public class ProgressAware {
    private Visibility visibility;

    public ProgressAware() {
        super();
        this.visibility = Visibility.VISIBLE;
    }

    public void show() {
        if (visibility == Visibility.INVISIBLE) {
            System.out.println("Progress is visible.");
            return;
        }
        System.out.println("Progress becomes visible.");
    }

    void print(int p) {
        System.out.println(p + "%");
    }

    public long show(int sec) {
        long start = System.currentTimeMillis();
        long printMillis = System.currentTimeMillis();
        while (System.currentTimeMillis() - start <= sec * 1000L) {
            long delta = System.currentTimeMillis() - printMillis;
            if (delta >= 100) {
                printMillis = System.currentTimeMillis();
                int temp = (int) ((System.currentTimeMillis() - start) / (sec * 10));
                print(temp);
            }
        }
        return start;
    }

    public void hide() {
        if (visibility == Visibility.VISIBLE) {
            System.out.println("Progress is already invisible");
            return;
        }
        this.visibility = Visibility.INVISIBLE;
        System.out.println("Progress becomes invisible");
    }

    public static void main(String[] args) {
        ProgressAware progress1 = new ProgressAware();
        System.out.println(progress1.show(10));

    }
}
