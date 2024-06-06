
package recursion;
public class TowerOfHanoi {
    public static void main(String[] args) {
        TOH(3,'A','B','C');
    }
    public static void TOH(int N,char A,char B, char C){
        if(N>0){
            TOH(N-1,A,C,B);
            System.out.println(A+"->"+C);
            TOH(N-1,B,A,C);
        }
    }
    
}