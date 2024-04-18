public class bubbleSortBrute {

    // Static method for bubble sort
    //Best Case Complexity : O(n2)
    static void bubbleSort(int[] A, int n) {
        for (int pass = n - 1; pass >= 0; pass--) {
            for (int i = 0; i < pass; i++) {
                if (A[i] > A[i + 1]) {
                    // Swapping the elements
                    int temp = A[i];
                    A[i] = A[i + 1];
                    A[i + 1] = temp;
                }
            }
        }
    }

    ///improved the complexity
    // Best Case Complexity : O(n)

    static void bubbleSortImproved(int[] A,int n){
        int i , temp , pass  , swapped = 1;
        for(pass=n-1;pass>=0;pass--){
            swapped=0;
            for(i=0;i<pass;i++){
                if(A[i]>A[i+1]){
                     temp = A[i];
                     A[i]=A[i+1];
                     A[i+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        int n = arr.length;

        // Before sorting
        System.out.println("Before sorting:");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

        System.out.println();
        // Bubble sort
        bubbleSort(arr, n);

        // After sorting
        System.out.println("After sorting:");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
