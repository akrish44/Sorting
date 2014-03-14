import java.util.Arrays;
public class Selection {

    public static void main(String[] args) {
        int[] arr = {3, 1, 6, 7, 1 ,2};
        System.out.println(Arrays.toString(arr));
        selectionSort(arr);
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            swap(arr, i, min);
        }

    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        print(arr);

    }

    
    public boolean isSorted(int[] arr) {
        for (int i=0; i<arr.length-1; i++) {
            if (!(arr[i]<arr[i+1])) {
               return false;
            }
        }
        return true;
    }

    public static void print(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println("\n");

    }

}
