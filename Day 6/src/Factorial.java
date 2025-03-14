import java.util.Scanner;

public class Factorial {
    public static int factorial(int num){
        long factotial=1;
        for(int i=1;i<=num;i++){
            factotial *= i;
        }
        System.out.println("Factorial of "+num+" is "+factotial);
        return num;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num=sc.nextInt();

        factorial(num);
    }
}
