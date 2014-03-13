public class Selection {
   
    public static void main(String[] args) {
        int arr[]={3,1,6,7,1,2};
        int lowest=0;

        for(int i = 0 ; i < arr.length-1; i++) {  
            lowest = i;                       
            for(int j = i+1 ; j < arr.length; j++) { 
                if(arr[j] < arr[lowest]) {
                    lowest = j;                  
                }
            }
            if(lowest != i) {                   
                int temp = arr[i];
                arr[i] = arr[lowest];
                arr[lowest] = temp;
            }
        }
        for (int k = 0; k <= arr.length-1 ; k++) {
        System.out.println(arr[k] + " ");
        }
    }
}
