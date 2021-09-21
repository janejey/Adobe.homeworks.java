package com.company.week11.task3;

import java.io.*;

public class FilesAnalyzerRunnable {
    public static void main(String[] args) {
        String[] strings = {
                "5e651856-9d7a-4442-b294-b9e17b1f8bbc", "233a761f-0033-484f-9814-1fef3f2fadeb",
                "dfd8f3e1-e249-4986-891d-f282810815f5", "7157155d-9c58-490a-a785-73faa479a31c"
        };
        File location = new File("C:\\Users\\User\\IdeaProjects\\Homeworks\\src\\com\\company\\week11\\task2\\files");
        File[] files = location.listFiles();
        ((Runnable) () -> {
            for (File file : files) {
                try {
                    findMatchingLines(file, strings);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }).run();
    }


    public static void findMatchingLines(File file, String[] strings) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            for (String s : strings) {
                if (s.equals(line)) {
                    System.out.println(file.getName() + " contains " + line);
                } else {
                    continue;
                }
            }
        }
    }
}
