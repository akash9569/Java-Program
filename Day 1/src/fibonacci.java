import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num=sc.nextInt();

        int a=0,b=1;
        System.out.println("Fibonacci Series: " + a + " " + b);
        for(int i=2;i<=num;i++){
            int next=a+b;
            System.out.println("Fibonacci is "+next);
            a=b;
            b=next;
        }
    }
}
