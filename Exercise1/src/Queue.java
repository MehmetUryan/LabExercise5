/**
 * Queue.java
 *
 * Name: Mehmet Uryan
 * Student ID: 240446021
 * Date: 16.11.2026
 */
public class Queue<T> {

    private T[] items;
    private int front;
    private int rear;
    private int count;

    @SuppressWarnings("unchecked")
    public Queue(int capacity) {
        items = (T[]) new Object[capacity];

        front = 0;
        rear = -1;
        count = 0;
    }

    public void enqueue(T value) {
        if (isFull()) {
            return;
        }
        rear++;
        items[rear] = value;
        count++;
    }

    public T dequeue() {
        if (isEmpty()) {
            return null;
        }
        T removedValue = items[front];
        items[front] = null;
        front++;
        count--;
        return removedValue;
    }

    public T peek() {
        if (isEmpty()) {
            return null;
        }
        return items[front];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == items.length;
    }

    public int size() {
        return count;
    }

    @Override
    public String toString() {

        StringBuilder result = new StringBuilder("[");

        for (int i = 0; i < count; i++) {

            int index = front + i;

            result.append(items[index]);

            if (i < count - 1) {
                result.append(", ");
            }
        }

        result.append("]");

        return result.toString();
    }
}