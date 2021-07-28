package com.company.week2.IntBuffer;

public class IntBuffer {
    private Integer value;

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value.toString();
    }

    public static void main(String[] args) {
        LinkedIntBuffer linkedIntBuffer = new LinkedIntBuffer();
        linkedIntBuffer.push(1);
        linkedIntBuffer.push(3);
        linkedIntBuffer.push(2);
        linkedIntBuffer.push(4);
        System.out.println(linkedIntBuffer.toString());
    }
}
