package com.company.week11.task4;


import java.io.*;

public class FilesConcurrentProcessing implements Runnable {
    File file;
    int counter;

    public FilesConcurrentProcessing(File file) {
        this.file = file;
    }

    @Override
    public void run() {
        try{
            String line;
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            while ((line = bufferedReader.readLine()) != null) {
                if(line.contains("ab")) {
                    counter++;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(counter);
    }
}
