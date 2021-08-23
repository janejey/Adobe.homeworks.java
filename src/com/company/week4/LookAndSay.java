package com.company.week4;

public class LookAndSay {

    public static String lookAndSay(int n) {
        String result = "1";
        if (n == 0) return "0";
        if (n == 1) return result;
        StringBuilder chars = new StringBuilder();
        while (n != 1) {
            char curr = result.charAt(0);
            int count = 1;
            for (int i = 1; i < result.length(); i++) {
                if (curr != result.charAt(i)) {
                    chars.append(count).append(curr);
                    curr = result.charAt(i);
                    count = 1;
                } else {
                    count++;
                }
            }
            chars.append(count).append(curr);
            n--;
            result = chars.toString();
            chars.setLength(0);
        }
        return result;
    }


    public static void main(String[] args) {
        System.out.println(lookAndSay(3));
    }
}
