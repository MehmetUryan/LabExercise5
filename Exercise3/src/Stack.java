/**
 * Stack.java
 *
 * Name: Mehmet Uryan
 * Student ID:  240446021
 * Date: 16.11.2026
 */

public class Stack {

    private char[] items;
    private int top;

    public Stack(int capacity) {
        items = new char[capacity];
        top = -1;
    }

    public void push(char value) {
        if (isFull()) {
            return;
        }
        top++;
        items[top] = value;
    }

    public char pop() {
        if (isEmpty()) {
            return '\0';
        }
        char removed = items[top];
        top--;
        return removed;
    }

    public char peek() {
        if (isEmpty()) {
            return '\0';
        }
        return items[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == items.length - 1;
    }
}