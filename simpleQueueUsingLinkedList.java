
package Queue;
class SQueue{
    int info;
    SQueue next;
}
class SimpleQueue{
    SQueue FRONT,REAR;
    public void enque(int data){
      SQueue newnode=new SQueue();
      newnode.info=data;
      if(REAR==null){
          FRONT=newnode;
          REAR=newnode;
      }else{
         REAR.next=newnode;
          REAR=newnode;
      }
    }
   
    public void dequeue(){
        if(FRONT==null){
            System.out.println("Empty list");
        }else if(FRONT==REAR){
            FRONT=null;
            REAR=null;
        }else{
            SQueue temp=FRONT;
            FRONT=FRONT.next;
            temp.next=null;
        }

    }
    public void view(){
        if(FRONT==null){
            System.out.println("Empty list");
        }else{
            SQueue temp=FRONT;
            while(temp!=null){
               
                System.out.print(temp.info+" ");
                temp=temp.next;//to dipslay of the values of singly linked list
            }
            System.out.println();
        }
    }
}
  public class simpleQueueUsingLinkedList{
    public static void main(String[] args) {
        SimpleQueue mylist=new SimpleQueue();
        mylist.enque(5);
        mylist.enque(7);
        mylist.enque(9);
        mylist.view();
        mylist.dequeue();
       mylist.view();
    }
}
