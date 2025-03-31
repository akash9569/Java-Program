public class insertionSort {
    public static void insertion(int arr[]){
        for(int i=0;i<arr.length;i++){
            int current = arr[i];
            int previous = i-1;
            while (previous >=0 && arr[previous] > current){
                arr[previous+1] = arr[previous];
                previous--;
            }
            arr[previous+1] = current;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={4,3,5,2,1,6};
        insertion(arr);
    }
}
