package com.company.week2.IntBuffer;

public class LinkedIntBuffer extends IntBuffer {
    private LinkedIntBuffer next;

    public LinkedIntBuffer getNext() {
        return next;
    }

    public void setNext(LinkedIntBuffer next) {
        this.next = next;
    }

    public void push(Integer value) {
        LinkedIntBuffer newIntBuffer = new LinkedIntBuffer();
        LinkedIntBuffer currentItem = next;
        newIntBuffer.setValue(value);
        if (next == null) {
            setNext(newIntBuffer);
        } else {
            while (currentItem.getNext() != null) {
                currentItem = currentItem.getNext();
            }
            currentItem.setNext(newIntBuffer);
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        LinkedIntBuffer currentInt = next;
        while (currentInt != null) {
            result.append(currentInt.getValue()).append("->");
            currentInt = currentInt.getNext();
        }
        result.append("null");
        return result.toString();
    }
}
