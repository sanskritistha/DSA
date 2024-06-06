package recursion;

public class Fibonacciiseries {

    public static void main(String[] args) {
        System.out.println(fibo(8));
    }

    static int fibo(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }
}
