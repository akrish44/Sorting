public class Bubble {
  public static void main(String[] args) {
        int[] arr = {3, 1, 6, 7, 1, 2}; 

        bubbleSort(arr, arr.length); 

        

        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void bubbleSort(int[] arr, int length) {

        for(int counter=0; counter<length-1; counter++) { 
            for(int index=0; index<length-1-counter; index++) { 
                if(arr[index] > arr[index+1]) { 
                    int temp = arr[index]; 
                    arr[index] = arr[index+1];
                    arr[index+1] = temp;
                }
            }
        }
    }
}

