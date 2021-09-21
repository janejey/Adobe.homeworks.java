package com.company.week11.task1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.UUID;

public class LinesInFile implements Runnable{
    private final File file;

    public LinesInFile(String filePath) {
        this.file = new File(filePath);
    }

    @Override
    public void run() {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            for (int i = 0; i < 10_000; i++) {
                fileOutputStream.write((UUID.randomUUID() + "\n").getBytes());
            }
            fileOutputStream.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
