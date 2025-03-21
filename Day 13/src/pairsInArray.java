public class pairsInArray {
    public static void printPair(int number[]){
        int totalPair=0;
        for(int i=0;i<number.length;i++){
            int curr = number[i];
            for(int j=i+1;j<number.length;j++){
                System.out.print("( "+curr+","+number[j]+" ) ");
                totalPair++;
            }
            System.out.println();
        }
        System.out.println("Total Pair: "+totalPair);
    }
    public static void main(String[] args) {

        int number[] = {1,2,3,4,5,6};
        printPair(number);

//        Time Complexity: O(n^2)
    }
}
