package com.company.week2.ProgressAware;

public class LineProgress extends ProgressAware {
    private final int lineLength;

    public LineProgress(final int lineLength) {
        if (lineLength <= 0) {
            throw new RuntimeException("Invalid value!");
        }
        this.lineLength = lineLength;
    }
}
