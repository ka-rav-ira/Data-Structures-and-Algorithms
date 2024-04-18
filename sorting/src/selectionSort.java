public class selectionSort {

    static void selectionSortW(int[] A, int n){
        int i,j,temp,min;
        for(i=0;i<n;i++){
            min =i;
            for(j=i+1;j<n;j++){
                if(A[j]<A[min]){
                    min = j;
                }
            }
            //swapping
            temp = A[min];
            A[min]=A[i];
            A[i]=temp;
        }
    }


    public static void main(String[] args){
            int[] arr = {64,32,41,25,27,32};
            int n = arr.length;

            //Before Sorting
        System.out.println("Before Sorting");
            for(int i=0;i<n;i++){
                System.out.println(arr[i]);
            }

        System.out.println();
            //
        //After Sorting
        selectionSortW(arr,n);
        System.out.println("After Sorting");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);

    }
}
