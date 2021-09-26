package com.company.week11.task8;

public class SafeSimpleList <T> implements SimpleList <T>{
    private Object[] objects = new Object[10_000];
    private int length = 0;

    @Override
    public synchronized void add(T item) throws Exception {
        if(length > 10_0000) {
            throw new Exception("No more space");
        }
        objects[length] = item;
        length++;
    }

    @Override
    public synchronized int getSize() {
        return length;
    }

    @Override
    public synchronized T get(int index) throws Exception {
        if(index < 0 || index > 10_000) {
            throw new Exception("Please, enter index between 0-10000");
        }
        return (T) objects[index];
    }

    public static void main(String[] args) throws Exception {
        SafeSimpleList<Integer> safeSimpleList = new SafeSimpleList<>();
        for (int i = 0; i < 20; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for(int j = 0; j < 10; j++) {
                        try {
                            safeSimpleList.add(j);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            }).start();
        }
        Thread.sleep(1000);
        System.out.println(safeSimpleList.getSize());
        System.out.println(safeSimpleList.get(5));
    }
}
