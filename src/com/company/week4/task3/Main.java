package com.company.week4.task3;

public class Main {
    public static void main(String[] args) {
        Processor x86Processor = new X86IntelProcessor();
        System.out.println(x86Processor.calculateBinary(25));
        System.out.println(x86Processor.calculateBinary(884));
        System.out.println(x86Processor.calculateBinary(721));
        Processor x8664Processor = new X8664IntelProcessor();
        System.out.println(x8664Processor.calculateBinary(25));
        System.out.println(x8664Processor.calculateBinary(884));
        System.out.println(x8664Processor.calculateBinary(721));
        Processor armProcessor = new ArmProcessor();
        System.out.println(armProcessor.calculateBinary(25));
        System.out.println(armProcessor.calculateBinary(884));
        System.out.println(armProcessor.calculateBinary(721));
    }
}
