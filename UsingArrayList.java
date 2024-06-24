package stack;


import java.util.*;


public class UsingArrayList {
     public static void main(String[] args) {
        ArrayList myList=new ArrayList();
        myList.add("sanskriti");
        myList.add("shrestha");
        System.out.println(myList);
        myList.add(2,"sabin");
        System.out.println(myList); 
        myList.remove("sabin");
        System.out.println(myList);
        myList.remove(1);
         System.out.println(myList);
    
}
}
