package org.example;

public class Container{
    private int[] items;
    private int size;
    private static final int INITIAL_CAPACITY = 10;

    public Container() {
        items = new int[INITIAL_CAPACITY];
        size = 0;
    }

    public Container(int... initialItems) {
        size = initialItems.length;
        items = new int[Math.max(INITIAL_CAPACITY, size)];
        System.arraycopy(initialItems, 0, items, 0, size);
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private void ensureCapacity() {
        if (size >= items.length) {
            int newCapacity = items.length * 2;
            int[] newArray = new int[newCapacity];
            System.arraycopy(items, 0, newArray, 0, items.length);
            items = newArray;
        }
    }
}