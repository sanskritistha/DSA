package linkedlist;

class DLLNode {

    int info;
    DLLNode next, previous;
}

class DLL {

    DLLNode first, last;

    public void insertFirst(int data) {
        DLLNode newnode = new DLLNode();
        newnode.info = data;
        if (first == null) {
            first = newnode;
            last = newnode;
        } else {
            newnode.next = first;
            first.previous = newnode;
            first = newnode;
        }

    }

    public void insertLast(int data) {
        DLLNode newnode = new DLLNode();
        newnode.info = data;
        if (first == null) {
            first = newnode;
            last = newnode;
        } else {
            last.next = newnode;
            newnode.previous = last;
            last = newnode;

        }
    }

    public void deleteFirst() {
        if (first == null) {
            System.out.println("Empty list");
        } else if (first == last) {
            first = null;
            last = null;

        } else {
            DLLNode temp = first;
            first = first.next;
            first.previous = null;
            temp.next = null;

        }
    }

    public void deleteLast() {
        if (first == null) {
            System.out.println("Empty list");
        } else if (first == last) {
            first = null;
            last = null;

        } else {
            DLLNode temp = last.previous;
            last.previous = null;
            temp.previous = null;
            last = temp;
        }

    }

    public void insertAt(int data, int pos) {
        DLLNode newnode = new DLLNode();
        newnode.info = data;
        if (first == null) {
            first = newnode;
            last = newnode;
        } else {

            DLLNode temp = first;
            newnode.next = temp.next;
            temp.next = newnode;
            newnode.previous = temp;
            newnode.next.previous = newnode;
        }
    }

    public void deleteAt(int pos) {
        if (first == null) {
            System.out.println("Empty list");
        } else if (first == last) {
            first = null;
            last = null;

        } else {
            DLLNode temp = first;
            DLLNode cur = temp.next;
            temp.next = cur.next;
            cur.next.previous = temp;
            cur.next = null;
            cur.previous = null;

        }

    }

    public void display() {
        if (first == null) {
            System.out.println("Empty list");
        } else {
            DLLNode temp = first;
            while (temp != null) {
                System.out.print(temp.info + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
}

public class DoublyLinkedList {

    public static void main(String[] args) {
        SLL mylist = new SLL();
        mylist.insertFirst(5);
        mylist.insertFirst(6);
        mylist.display();
        mylist.insertLast(8);
        mylist.insertLast(9);
        mylist.display();
        mylist.deleteFirst();
        mylist.display();
        mylist.deleteLast();
        mylist.display();
        mylist.insertAt(90, 2);
        mylist.display();
        mylist.deleteAt(3);
        mylist.display();

    }

}
