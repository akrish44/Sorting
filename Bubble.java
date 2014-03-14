import java.util.Arrays;
public class Bubble {
  public static void main(String[] args) {
        int[] arr = {3, 1, 6, 7, 1, 2};

        System.out.println(Arrays.toString(arr));
        swap(arr); 
    }

    private static void swap(int[] arr) {
    int temp = 0;
    boolean done = false;
    while (!done) {
        // for (int j = 1; j < (arr.length); j++) {
        //     if (arr[j - 1] > arr[j]) {
        //         temp = arr[j - 1];
        //         arr[j - 1] = arr[j];
        //         arr[j] = temp;
        //     }
            
           
        // }
        done = true;
        for (int i=0; i<arr.length-1; i++) {
            if (arr[i]>arr[i+1]) {
                done = false;
                temp = arr[i + 1];
                arr[i + 1] = arr[i];
                arr[i] = temp;

            }
            print(arr);
        }
       

        }
    }



    private static void print(int[] arr) {
        for(int k=0; k<arr.length; k++) {
            
            System.out.print(arr[k]+ " ");
        
        }
        System.out.println("\n");
    }
}
