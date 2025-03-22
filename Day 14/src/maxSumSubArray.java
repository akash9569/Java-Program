public class maxSumSubArray {
    public static void sumSubArray(int number[]){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        int total=0;
        for(int i=0;i<number.length;i++){
            int start=i;
            for(int j=i;j<number.length;j++){
                int end=j;
                currSum=0;
                for(int k=start;k<=end;k++){
//                    System.out.print(number[k]+" ");
                    currSum += number[k];
                }
                System.out.println(currSum);
                if(maxSum < currSum){
                    maxSum=currSum;
                }
                total++;
//                System.out.println();
            }
//            System.out.println();
        }
        System.out.println("Maximum Sum SubArray: "+maxSum);
    }
    public static void main(String[] args) {
        int number[]={1,2,3,4,5,6,7};
        sumSubArray(number);
    }
}
