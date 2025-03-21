public class subArray {
    public static void printSubArray(int number[]){
        int total=0;
        for(int i=0;i<number.length;i++){
            int start=i;
            for(int j=i;j<number.length;j++){
                int end=j;
                for(int k=start;k<=end;k++){
                    System.out.print(number[k]+" ");
                }
                total++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total Subarray: "+total);
    }
    public static void main(String[] args) {
//        A Continuous part of Array.

        int number[] = {2,3,4,5,6,7,8};
        printSubArray(number);
    }
}
