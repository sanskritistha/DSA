package sorting;

public class Bubblesort {

    static void bubblesort(int a[]) {
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }

        }

    }

    public static void main(String[] args) {
        int a[] = {5, 8, 4, 7, 3};
        bubblesort(a);
        System.out.println("After sorting");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

}
