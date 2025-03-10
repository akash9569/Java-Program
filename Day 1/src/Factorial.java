import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num=sc.nextInt();
        long factotial=1;
        for(int i=1;i<=num;i++){
            factotial *= i;
        }
        System.out.print("Factorial of "+num+" is "+factotial);
    }
}
