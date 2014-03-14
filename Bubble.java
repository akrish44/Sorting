import java.util.Arrays;
public class Bubble {
  public static void main(String[] args) {
        int[] arr = {3, 1, 6, 7, 1, 2};
        System.out.println(Arrays.toString(arr));
        swap(arr); 
    }

    private static void swap(int[] arr) {
        int length = arr.length;
        int oneLess = length - 1;
        for(int j=0; j<length-1; j++) { 
            for(int k=0; k<oneLess-j; k++) { 
                if(arr[k] > arr[k+1]) { 
                    int temp = arr[k]; 
                    arr[k] = arr[k+1];
                    arr[k+1] = temp;
                }
            }
        print(arr);
        }
    }

    private static void print(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println("\n");
    }
}
