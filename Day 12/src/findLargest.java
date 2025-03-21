import java.util.*;
public class findLargest {
    public static int largest(int number[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<number.length;i++){
            if(largest < number[i]){
                largest=number[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {

        int number[]={2,3,4,5,6,1,8,45,34};

        System.out.print("Largest Number is "+largest(number));
    }
}
