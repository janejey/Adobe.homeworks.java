package com.company.week11.task9;

import java.io.*;
import java.util.Random;

public class BinaryFile implements Runnable {
    @Override
    public void run() {
        Random random = new Random();
        int num1 = random.nextInt(10);
        int num2 = random.nextInt(10);
        int sum = num1 + num2;
        File file = new File(("C:\\Users\\User\\IdeaProjects\\Homeworks\\src\\com\\company\\week11\\task9\\binaryFile.txt"));
        PrintWriter printWriter = null;
        BufferedReader bufferedReader = null;
        try {
            if (!file.exists())
                file.createNewFile();
            printWriter = new PrintWriter(file);

        } catch (IOException e) {
            e.printStackTrace();
        }
        printWriter.println(Integer.toBinaryString(num1));
        printWriter.println(Integer.toBinaryString(num2));
        printWriter.close();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String line;
        try {
            bufferedReader = new BufferedReader(new FileReader("C:\\Users\\User\\IdeaProjects\\Homeworks\\src\\com\\company\\week11\\task9\\binaryFile.txt"));
            while ((line = bufferedReader.readLine()) != null)
                System.out.println(line);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            PrintWriter printWriter1 = new PrintWriter(file);
            printWriter1.println(sum);
            printWriter1.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

}
