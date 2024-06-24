package stack;

class SLLNode {

    int info;
    SLLNode next;
}

class MYstackL {

    SLLNode TOP;

    public void push(int data) {
        SLLNode newnode = new SLLNode();
        newnode.info = data;
        if (TOP == null) {
            TOP = newnode;
        } else {
            newnode.next = TOP;
            TOP = newnode;
        }
    }

    public void pop() {
        if (TOP == null) {
            System.out.println("stack empty");
        } else {
            System.out.println("Item removed" + TOP.info);
            SLLNode temp = TOP;
            TOP = TOP.next;
            temp.next = null;
        }
    }

    public void view() {
        if (TOP == null) {
            System.out.println("Empty list");
        } else {
            SLLNode temp = TOP;
            while (temp != null) {
                System.out.println(temp.info);
                temp = temp.next;
            }

        }
    }

    public void peek() {
        if (TOP == null) {
            System.out.println("stack empty");
        } else {
            System.out.println("Item at TOP" + TOP.info);
        }

    }
}

public class StackUsingLinkedList {

    public static void main(String[] args) {
        MYstackL ob = new MYstackL();
        ob.push(5);
        ob.push(10);
        ob.push(15);
        ob.view();
        ob.pop();
        ob.view();
        ob.push(50);
        ob.view();
        ob.peek();
        ob.view();

    }
}
