public class linearSearch {
    public static int linear_Search(int number[],int key){
        for(int i=0;i<number.length;i++){
            if(number[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
//        Find the index of element in a given array.

        int number[]={1,2,3,4,5,6,7,8,9,10};
        int key=9;

        int index=linear_Search(number,key);

        if(index == -1){
            System.out.print("Not Found");
        }
        else{
            System.out.print("Key is at index "+index);
        }
    }
}
