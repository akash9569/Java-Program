public class binarySearch {
    public static int binary(int number[], int key){
        int start=0,end=number.length-1;

        while (start <= end){
            int mid=(start + end)/2;

            if(number[mid] == key){
                return mid;
            }
            else if(number[mid] < key){
                start = mid+1;
            }
            else {
                end = end - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {

        int number[]={1,2,3,4,5,6,7,8};
        int key=6;

        System.out.print("Index for Key is "+binary(number,key));
    }
}
