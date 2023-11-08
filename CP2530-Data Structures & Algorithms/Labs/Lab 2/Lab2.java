class CircularQueue {
    int front, rear, size;
    int[] array;
    
public CircularQueue(int capacity) {
    front = rear = 0;
    size = capacity;
    array = new int[capacity];
}

public void enqueue(int data) {
    //expands array to size 10 if the array is less than 10
    if ((rear + 1) % size == front) {
        if (size < 10) {
            int[] tempArray = new int[10];
            int i = 0;
            while (front != rear) {
                front = (front + 1) % size;
                tempArray[i] = array[front];
                i++;
            }
            front = 0;
            rear = i;
            size = 10;
            array = tempArray;
        } else {
            //prints when array is full 
            System.out.println("Queue is full");
            return;
        }
    }
    rear = (rear + 1) % size;
    array[rear] = data;
}

public int dequeue() {
    //removes integers from queue
    if (front == rear) {
        System.out.println("Queue is empty");
        return -1;
    }
    front = (front + 1) % size;
    return array[front];
}

//displays queue to see what is happening as the code executes
public void display() {
    int i = front + 1;
    while (i <= rear) {
        System.out.print(array[i] + " ");
        i++;
    }
    System.out.println();
}

}

class Main {
    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue(5);
        queue.enqueue(1);
        queue.display();
        queue.enqueue(2);
        queue.display();
        queue.enqueue(3);
        queue.display();
        queue.enqueue(4);
        queue.display();
        if (queue.size == 5) {
            System.out.println("Queue size is 5");
            
        } else if (queue.size == 10) {
            System.out.println("Queue size is 10");
        }
        queue.enqueue(5);
        queue.display();
        queue.enqueue(6);
        queue.display();
        System.out.println("Dequeued: " + queue.dequeue());
        queue.display();
        System.out.println("Dequeued: " + queue.dequeue());
        queue.display();
        queue.enqueue(6);
        queue.display();
        queue.enqueue(7);
        queue.display();
        if (queue.size == 5) {
            System.out.println("Queue size is 5");
            
        } else if (queue.size == 10) {
            System.out.println("Queue size is 10");
            
        }
        queue.enqueue(8);
        queue.display();
        queue.enqueue(9);
        queue.display();
        queue.enqueue(10);
        queue.display();
        queue.enqueue(11);
        queue.display();
        System.out.println("Dequeued: " + queue.dequeue());
        queue.display();
        
    }
}