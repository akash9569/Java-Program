import java.util.Scanner;

public class decimalToBinary {
    public static void decToBin(int num){
        int pow=0;
        int binNum=0;

        while(num>0){
            int remainder=num%2;
            binNum=binNum+(remainder*((int)Math.pow(10,pow)));

            pow++;
            num=num/2;
        }
        System.out.println("Binary form of "+num+" is "+binNum);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num=sc.nextInt();

        decToBin(num);
    }
}
