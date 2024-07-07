class Queue {
    private String[] elements;
    private int capacity;
    private int front;
    private int rear;
    private int size;

    public Queue(int capacity) {
        this.capacity = capacity;
        this.elements = new String[capacity];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    public void enqueue(String element) {
        if (size == capacity) {
            System.out.println("Queue is full. Cannot enqueue " + element);
            return;
        }
        rear = (rear + 1) % capacity;
        elements[rear] = element;
        size++;
    }

    public String dequeue() {
        if (size == 0) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return null;
        }
        String dequeuedElement = elements[front];
        front = (front + 1) % capacity;
        size--;
        return dequeuedElement;
    }

    public String[] getQueue() {
        String[] queueArray = new String[size];
        int index = 0;
        for (int i = front; i <= rear; i++) {
            queueArray[index] = elements[i % capacity];
            index++;
        }
        return queueArray;
    }
}

class Tester {

    public static void main(String args[]) {
        Queue queue = new Queue(5);

        queue.enqueue("Emily");
        queue.enqueue("Lily");
        queue.enqueue("Rachel");
        queue.enqueue("Rose");

        queue.dequeue();
        queue.dequeue();

        String[] queueArray = queue.getQueue();
        System.out.println("Current Queue:");
        for (String element : queueArray) {
            System.out.println(element);
        }
    }
}
