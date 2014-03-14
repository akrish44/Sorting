import java.util.Arrays;
public class Insertion {
 
    public static void main(String[] args) {
         
        int[] arr = {3, 1, 6, 7, 1, 2};
        System.out.println(Arrays.toString(arr));
        insertionSort(arr);
    }
 
    public static void insertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
		  int next = arr[i];

		  int j = i;

		  while (j > 0 && next < arr[j - 1]) {
		   arr[j] = arr[j - 1];
		   j--;
		  }

		  arr[j] = next;
	    print(arr);
	    }
    }
        public static void print(int[] arr) {
         
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
    }
}
