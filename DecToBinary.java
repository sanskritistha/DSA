//
package recursion;

public class DecToBinary {

    public static void main(String[] args) {

        dtob(5);

    }

    static void dtob(int n) {
        if (n == 0) {//if(n>=1)
            return;
        } else {
            dtob(n / 2);
            System.out.println(n % 2);

        }
    }
}
