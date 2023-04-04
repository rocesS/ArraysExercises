package org.example;

class Array {

    private int [] items;
    private int count;
    private int index;

    public Array(int length) {
        items = new int[length];
    }

    public void print() {
        for (int i = 0; i < count; i++)
        System.out.println(items[i]);

    }

    public void insert(int item) {
        if (items.length == count) {
            int [] newItems = new int[count * 2];

            for (int i = 0; i < count; i++)
                newItems [i] = items[i];

            items = newItems;
        }
        items[count++] = item;
    }

    public void removeAt(int index) {
        if (index < 0 || index >= count) // 4
            throw new IllegalArgumentException();

        for (int i = index; i < count; i++)
            items[i] = items[i + 1];

        count--;
    }

}
