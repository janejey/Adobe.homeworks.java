package com.company.week11.task9;

import java.io.File;
import java.util.Random;

public class BinaryFile implements Runnable{
    @Override
    public void run() {
        Random random = new Random();
        int num1 = random.nextInt();
        int num2 = random.nextInt();
        File file = new File(("C:\\Users\\User\\IdeaProjects\\Homeworks\\src\\com\\company\\week11\\task9\\binaryFile.txt"));

    }
}
