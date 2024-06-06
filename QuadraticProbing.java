
package Hashing;
public class QuadraticProbing {
    static int a[]=new int[10];
    static int hashfunction(int n){
        int key=n%10;
        //check if the key is already occupied
        if(a[key]==0)
            return key;
        else{
            //find the key from key plus 1 to last of array
            int i=1;
            do{
                key=(n+i*i)%10;
                i++;
            }while(a[key]!=0);
            }
        return key;
}
    public static void main(String[] args) {
        int key;
        key=hashfunction(89);
        a[key]=89;
        key=hashfunction(18);
        a[key]=18;
        key=hashfunction(49);
        a[key]=49;
        key=hashfunction(58);
        a[key]=58;
        key=hashfunction(69);
        a[key]=69;
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");

        }
    }
}