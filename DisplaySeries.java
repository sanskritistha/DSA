package recursion;

public class DisplaySeries {

    public static void main(String[] args) {
        Series(1);
    }

    static void Series(int n) {
        if (n < 11) {
            System.out.print(n + " ");
            Series(n + 1);
        }
    }
}
