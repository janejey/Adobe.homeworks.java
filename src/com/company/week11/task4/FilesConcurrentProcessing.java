package com.company.week11.task4;

import java.io.*;

public class FilesConcurrentProcessing extends Thread implements Runnable {
    private File file;
    private int counter;
    public FilesConcurrentProcessing (File file) {
        this.file = file;
    }
    @Override
    public void run() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String curLine;
            while((curLine = bufferedReader.readLine()) != null) {
                if (curLine.contains("ab")) {
                    counter++;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(file.getName() + " " + counter);
    }

    public static void main(String[] args) {

    }
}
