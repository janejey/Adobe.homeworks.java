package com.company.week1.Sentence;

public class Sentence {
    public static void main(String args[]) {
        Sentence s = new Sentence();
        s.append("Hello");
        s.append("World");
        System.out.println(s.getValue());
        System.out.println(s.getWordsCount());
        s.append("Java");
        s.append("Code");
        System.out.println(s.getValue());
        System.out.println(s.getWordsCount());
    }


    private final String[] words;
    private int count;

    public Sentence() {
        words = new String[5];
        count = 0;
    }

    public void append(String word) {
        if (count == 5)
            return;
        words[count] = word;
        count++;
    }

    public String getValue() {
        String val = "";
        for (int i = 0; i < count; i++) {
            val += words[i];
            if (i < count - 1) {
                val += " ";
            }
        }
        return val;
    }

    public int getWordsCount() {
        return count;
    }
}
