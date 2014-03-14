import java.util.Arrays;
public class Insertion {
 
    public static void main(String[] args) {
         
        int[] arr = {3, 1, 6, 7, 1, 2};
        System.out.println(Arrays.toString(arr));
        insertionSort(arr);
    }
 
    public static void insertionSort(int arr[]) {
        for (int j = 1; j < arr.length; j++) {
            int max = arr[j];
            int i = j-1;
            while ( (i > -1) && (arr[i] > max) ) {
                arr[i+1] = arr[i];
                i--;
            }
            arr[i+1] = max;
            print(arr);
        }
    }
        private static void print(int[] arr) {
         
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
    }
}
