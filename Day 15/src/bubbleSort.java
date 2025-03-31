public class bubbleSort {
    public static void sort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void printArr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
//        Large Elements come to the end of the array by swapping with adjacent element.

        int arr[]={1,4,2,6,5,3};
        sort(arr);
        printArr(arr);

    }
}
