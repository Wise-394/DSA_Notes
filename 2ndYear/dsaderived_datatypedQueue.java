package derived_datatype;
import java.util.Scanner;

public class Queue {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Utils utils = new Utils();
        System.out.println("Enter queue max size");
        int maxSize = scn.nextInt();
        scn.nextLine();
        QueueClass kyutKo = new QueueClass(maxSize);

        while (true) {
            System.out.println("Press Enter to continue...");
            scn.nextLine();

            utils.displayMenu();
            int choice = scn.nextInt();
            scn.nextLine();

            switch (choice) {
                case 1:
                    if (kyutKo.isFull()) {
                        System.out.println("The queue is already full.");
                    } else {
                        System.out.println("Enter the number to enqueue:");
                        int num = scn.nextInt();
                        scn.nextLine();
                        System.out.println("Element to be inserted in the Queue: " + num);
                        kyutKo.enqueue(num);
                    }
                    break;
                case 2:
                    if (kyutKo.isEmpty()) {
                        System.out.println("The queue is empty.");
                    } else {
                        kyutKo.dequeue();
                    }
                    break;
                case 3:
                    kyutKo.displayQueue();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}

class Utils {
    public void displayMenu() {
        System.out.println("1. Enqueue an operation");
        System.out.println("2. Dequeue an operation");
        System.out.println("3. Display the queue");
        System.out.println("4. Exit");
        System.out.println("Enter your choice:");
    }
}

class QueueClass {
    private int[] queueArray;
    private int front;
    private int rear;
    private int currentQueueSize;

    public QueueClass(int MaxSize) {
        queueArray = new int[MaxSize];
        front = 0;
        rear = -1;
        currentQueueSize = 0;
    }

    public boolean isEmpty() {
        return currentQueueSize == 0;
    }

    public boolean isFull() {
        return currentQueueSize == queueArray.length;
    }

    public int queueSize() {
        return currentQueueSize;
    }

    public void enqueue(int num) {
        rear++;
        queueArray[rear] = num;
        currentQueueSize++;
    }

    public void dequeue() {
        int dequeuedElement = queueArray[front];
        front++;
        currentQueueSize--;

        System.out.println("Dequeued element: " + dequeuedElement);
    }

    public void displayQueue() {
        if (isEmpty()) {
            System.out.println("The queue is empty");
        } else {
            System.out.println("\n\n\n\n\n\n QUEUE ELEMENTS ARE: ");
            for (int i = front; i <= rear; i++) {
                System.out.print(queueArray[i] + " ");
            }
            System.out.println();
        }
    }
}
