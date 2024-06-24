package sorting;

public class Mergesort {

    static void merge(int L[], int R[], int A[]) {
        int nL = L.length, nR = R.length;
        int i = 0, j = 0, k = 0;
        //merge
        while (i < nL && j < nR) {
            if (L[i] <= R[j]) {
                A[k++] = L[i++];
            } else {
                A[k++] = R[j++];
            }

        }
        //put the remaning elements on left array
        while (i < nL) {
            A[k++] = L[i++];

        }
        //put the remaning elements on right array
        while (j < nR) {
            A[k++] = R[j++];

        }
    }

    static void mergeSort(int A[]) {
        int n = A.length;
        if (n < 2)//single element
        {
            return;
        }
        int mid = n / 2;
        int Left[] = new int[mid];
        int Right[] = new int[n - mid];
        for(int i = 0; i < mid; i++) {
            Left[i] = A[i];
        }
        for (int i = mid; i < n; i++) {
            Right[i - mid] = A[i];
        }
        mergeSort(Left);
        mergeSort(Right);
        merge(Left, Right, A);
    }

    public static void main(String[] args) {
        int A[] = {10, 5, 4, 9, 7, 6, 1, 3, 2};
        mergeSort(A);
        System.out.println("Array after sorting");
        for (int m : A) {
            System.out.print(m + " ");
        }
    }
}
