
package sorting;
public class Quicksort {
    static int partition(int a[],int L,int H) //H mean 
    {
        int pivot=a[L];
        int i=L;
        int j=H;
        while(i<j){
            do{
                i++;
            } while(a[i]<pivot);
            do{
                j--;
          
            } while(a[j]>pivot);
            if(i<j){
                //swap a[i] and a[j]
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                
            }
        }
            //swap pivot(a[L] and a[j]
            int temp=a[L];
            a[L]=a[j];
            a[j]=temp;
            return j;
        }
    
        static void QuickSort(int a[],int L,int H){
            if(L<H){
                int j=partition(a,L,H);
                QuickSort(a,L,j);
                QuickSort(a,j+1,H);
            }
        }
        public static void main(String[] args) {
        int a[]={25 ,57,48,37,12,92,86,33,Integer.MAX_VALUE};
        QuickSort(a,0,a.length-1);
            System.out.println("Elements after sorting");
            for(int i=0;i<a.length-1;i++){
                System.out.print(a[i]+" ");
            }
    }
}

                                                                                                                                                                                                                                                