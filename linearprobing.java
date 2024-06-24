package graph;
public class linearprobing {
    static int a[]=new int[10];
    static int hashfunction(int n){
        int key=n%10;
        //check if the key is already occupied
        if(a[key]==0)
            return key;
        else{
            //find the key from key plus 1 to last of array
            for(int i=key+1;i<a.length;i++){
                if(a[i]==0){
                    key=i;
                    break;
                }
    }
            //find the key from 0 to key minus 1
            for(int i=0;i<key;i++){
                if(a[i]==0){
                    key=i;
                    break;
                }
            }
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

