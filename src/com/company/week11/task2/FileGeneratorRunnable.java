package com.company.week11.task2;

import com.company.week11.task1.LinesInFile;

public class FileGeneratorRunnable implements Runnable {
    private final int count;

    public FileGeneratorRunnable(int count) {
        this.count = count;
    }

    @Override
    public void run() {
        for (int i = 0; i < count; i++) {
            String filePath = "C:\\Users\\User\\IdeaProjects\\Homeworks\\src\\com\\company\\week11\\task2\\fileForLine" + i + ".txt";
            LinesInFile linesInFile = new LinesInFile(filePath);
            linesInFile.run();
        }
    }
}
