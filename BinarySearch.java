
package sorting;

import java.util.*;



public class BinarySearch {
   static int binarysearch(int array[],int key,int low,int high){
        //reapeat until the pointer low and high meet each other
        while(low<=high){
            int mid=low +(high-low)/2;
            if(array[mid]==key)
                return mid;
            if(array[mid]<key)
                low=mid+1;
            else
                high=mid-1;
        }
        return -1;//not found
        
    }
    public static void main(String[] args) {
        
    
     int A[]={1,2,4,5,6,7,8};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value to search");
        int key=sc.nextInt();
        int result=binarysearch(A,key,0,A.length-1);
        if(result==-1)
            System.out.println("search unsuccesful");
        else
            System.out.println("Item found at index"+result);
    }
}
    

