 package stack;

//import java.util.*;

interface stack {

    public void push(int data);

    public int pop();

    public int peek();

    public void view();
}

class Mystack implements stack {

    int TOP = -1, STACKSIZE = 5;
    int stack[] = new int[STACKSIZE];

    public void push(int data) {
        if (TOP == STACKSIZE - 1) {
            System.out.println("stack overflow");
        } else {
            TOP++;
            stack[TOP] = data;
        }
    }

    public int pop() {
        if (TOP == -1) {
            System.out.println("stack underflow");
            return 0;
        } else {
            int item = stack[TOP];

            TOP--;
            return item;

        }
    }

    public int peek() {
        if (TOP == -1) {
            System.out.println("stack underflow");
            return 0;
        } else {
            int item = stack[TOP];
            return item;
        }

    }

    public void view() {
        if (TOP == -1) {
            System.out.println("stack Empty");
        } else {
            for (int i = TOP; i >= 0; i--) {
                System.out.println(stack[i]);

            }
        }

    }

}

public class StackUsingArray {

    public static void main(String[] args) {
        Mystack ob=new Mystack();
        ob.push(5);
        ob.push(10);
        ob.push(15);
        ob.push(20);
        ob.push(30);
        ob.push(40);
        ob.push(3);
        ob.view();
        System.out.println("Item Removed:"+ob.pop());
        ob.view();
        ob.push(50);
        ob.view();
        System.out.println("Item at top:"+ob.peek());
         /*
        Scanner sc = new Scanner(System.in);
        Mystack ob = new Mystack();
        while (true) {
        
            System.out.println("1.Push\n 2.Pop\n 3.View");
            System.out.println("4.Exit\n Enter your choice:");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter a value to insert");
                    int val = sc.nextInt();
                    ob.push(val);
                    break;
                case 2:
                    ob.pop();
                    break;
                case 3:
                    ob.view();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("invalid choice1");

            }
        }
*/
    }
}
