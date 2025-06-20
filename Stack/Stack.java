public class Stack {
    int[] stack;
    int size, top;

    public Stack(int size) {
        this.size = size;
        top = -1;
        stack = new int[size];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top >= size - 1;
    }

    public boolean push(int value) {
        if(isFull()) {
            System.out.println("Stack overflow! Cannot push "+value);
            return false;
        }
        else {
            stack[++top] = value;
            System.out.println("Pushed "+value);
            return true;
        }
    }

    public int pop() {
        if(isEmpty()) {
            System.out.println("Stack underflow! Cannot pop.");
            return -1;
        }
        else {
            int removed = stack[top--];
            System.out.println("\nPopped "+removed+"\n");
            return removed;
        }
    }

    public int peek() {
        if(isEmpty()) {
            System.out.println("There is nothing to peek into!");
            return -1;
        }
        else {
            System.out.println("\nPeeked "+stack[top]+"\n");
            return stack[top];
        }
    }

    public void printQueue() {
        if(isEmpty()) {
            System.out.println("Stack is empty!");
        }
        else {
            System.out.println("Queue elements: ");
            for(int i = 0; i <= top; i++) {
                System.out.print(stack[i]+" ");
            }
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack(10);
        s.push(10);
        s.push(20);
        s.pop();
        s.push(30);
        s.push(40);
        s.pop();
        s.peek();
        s.printQueue();
    }
}