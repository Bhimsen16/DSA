public class CircularQueue {
    int[] cqueue;
    int size, front, rear;

    public CircularQueue(int size) {
        this.size = size;
        front = -1;
        rear = -1;
        cqueue = new int[size];
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public boolean isFull() {
        return front == (rear + 1) % size;
    }

    public boolean enqueue(int value) {
        if(isFull()) {
            System.out.println("Circular queue is full! Cannot enqueue "+value);
            return false;
        }

        if(isEmpty()) {
            rear = front = 0;
        }
        else {
            rear = (rear + 1) % size;
        }
        cqueue[rear] = value;
        System.out.println("Enqueued "+value);
        return true;
    }

    public int dequeue() {
        if(isEmpty()) {
            System.out.println("Cannot dequeue! Circular-Queue is empty.");
            return -1;
        }
        
        int removed = cqueue[front];

        if(front == rear) {
            front = rear = -1;
        }
        else {
            front = (front + 1) % size;
        }

        System.out.println("\nDequeued "+removed+"\n");
        return removed;
    }

    public int peek() {
        if(isEmpty()) {
            System.out.println("Nothing to peek into!");
            return -1;
        }
        else {
            System.out.println("\nPeeked element "+cqueue[front]+"\n");
            return 1;
        }
    }

    public void printCQueue() {
        if(isEmpty()) {
            System.out.println("Circular queue is empty!");
        }
        
        System.out.println("Circular queue elements: ");
        int i = front;
        while(true) {
            System.out.print(cqueue[i]+" ");
            if(i == rear) break;
            i = (i + 1) % size;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        CircularQueue cq = new CircularQueue(5);
        cq.enqueue(10);
        cq.enqueue(20);
        cq.enqueue(30);
        cq.dequeue();
        cq.peek();
        cq.enqueue(40);
        cq.enqueue(50);
        cq.enqueue(60);
        cq.enqueue(70);
        cq.peek();
        cq.printCQueue();
    }
}