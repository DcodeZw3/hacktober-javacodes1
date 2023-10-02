import java.util.Scanner;
public class Array_stack {
    static int n = 5;
    static int top = -1;
    static int[] arr = new int[10];

    public static boolean isFull() {
        return top == (n - 1);
    }

    public static boolean isEmpty() {
        return top == -1;
    }

    public static void push() {
        if (isFull()) {
            System.out.println("The stack is already full");
        } else {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter integer to be pushed: ");
            int x = scanner.nextInt();
            scanner.close();
            top = top + 1;
            arr[top] = x;
            System.out.println(x + " has been pushed into the stack");
        }
    }

    public static void pop() {
        if (isEmpty()) {
            System.out.println("The stack is already empty");
        } else {
            System.out.println(arr[top] + " has been popped from the stack");
            top = top - 1;
        }
    }

    public static void display() {
        if (isEmpty()) {
            System.out.println("The stack is empty");
        } else {
            System.out.println("Elements in the stack:");
            for (int i = top; i >= 0; i--) {
                System.out.println(arr[i]);
            }
        }
    }

    public static void peek() {
        if (isEmpty()) {
            System.out.println("The stack is empty");
        } else {
            System.out.println("The top value is " + arr[top]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Press 1 to Push");
            System.out.println("Press 2 to Pop");
            System.out.println("Press 3 to Display");
            System.out.println("Press 4 to Peek");
            System.out.println("Press 5 to check if stack is empty");
            System.out.println("Press 6 to check if stack is full");
            System.out.println("Press 7 to terminate the program");

            int input = scanner.nextInt();

            switch (input) {
                case 1:
                    push();
                    break;
                case 2:
                    pop();
                    break;
                case 3:
                    display();
                    break;
                case 4:
                    peek();
                    break;
                case 5:
                    if (isEmpty()) {
                        System.out.println("The stack is empty");
                    } else {
                        System.out.println("The stack is not empty");
                    }
                    break;
                case 6:
                    if (isFull()) {
                        System.out.println("The stack is full");
                    } else {
                        System.out.println("The stack is not full");
                    }
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid input");
            }
            scanner.close();
        }
    }
}
