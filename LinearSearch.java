
package sorting;
import java.util.*;
public class LinearSearch {
     static int linearsearch(int A[],int key){
        int i=0,j=A.length;
        while(i<j){
            if(key==A[i])
                return i;
            else
                i++;
            
        }
        return -1;//not found
    }
    public static void main(String[] args) {
        int A[]={2,3,1,5,7,6,4};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value to search");
        int key=sc.nextInt();
        int result=linearsearch(A,key);
        if(result==-1)
            System.out.println("search unsuccesful");
        else
            System.out.println("Item found at index"+result);
    }
}
    

