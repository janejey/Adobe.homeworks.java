package com.company.week11.task8;

public class UnsafeSimpleList <T> implements SimpleList <T>{
    private Object[] objects = new Object[10_000];
    public int length = 0;

    @Override
    public void add(T item) throws Exception {
        if(
                length > 10_000) {
            throw new Exception("no more space");
        }
        objects[length] = item;
        length++;
    }

    @Override
    public int getSize() {
        return length;
    }

    @Override
    public T get(int index) throws Exception {
        if(index < 0 || index > 10_000) {
            throw new Exception("Please, enter index between 0-10000");
        }
        return (T) objects[index];
    }

    public static void main(String[] args) throws Exception {
        UnsafeSimpleList<Integer> unsafeSimpleList = new UnsafeSimpleList<>();
        for(int i = 0; i < 20; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for(int j = 0; j < 10; j++) {
                        try {
                            unsafeSimpleList.add(j);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            }).start();
        }
        Thread.sleep(1000);
        System.out.println(unsafeSimpleList.get(5));
        System.out.println(unsafeSimpleList.getSize());
    }
}
