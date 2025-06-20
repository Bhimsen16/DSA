public class Queue {
    int[] queue;
    int size, front, rear;

    public Queue(int size) {
        this.size = size;
        front = 0;
        rear = -1;
        queue = new int[size];
    }

    public boolean isEmpty() {
        return front > rear;
    }

    public boolean isFull() {
        return rear >= size - 1;
    }

    public boolean enqueue(int value) {
        if(isFull()) {
            System.out.println("Queue overflow! Cannot enqueue "+value);
            return false;
        }
        else {
            queue[++rear] = value;
            System.out.println("Enqueued "+value);
            return true;
        }
    }

    public int dequeue() {
        if(isEmpty()) {
            System.out.println("Queue underflow! Cannot dequeue.");
            return -1;
        }
        else {
            int removed = queue[front++];
            System.out.println("\nDequeued "+removed+"\n");
            return 1;
        }
    }

    public int peek() {
        if(isEmpty()) {
            System.out.println("There is nothing to peek into!");
            return -1;
        }
        else {
            System.out.println("\nPeeked "+queue[front]+"\n");
            return 1;
        }
    }

    public void printQueue() {
        if(isEmpty()) {
            System.out.println("Queue is empty!");
        }
        else {
            System.out.println("Queue elements: ");
            for(int i = front; i <= rear; i++) {
                System.out.print(queue[i]+" ");
            }
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(10);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.dequeue();
        q.dequeue();
        q.peek();
        q.enqueue(40);
        q.printQueue();
    }
}