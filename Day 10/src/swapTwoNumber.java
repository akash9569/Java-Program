import java.util.Scanner;

public class swapTwoNumber {
    public static void swap(int a,int b){
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("Number A: "+a);
        System.out.println("Number B: "+b);
    }

    public static void swapNumber(int a,int b){
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("Number A: "+a);
        System.out.println("Number B: "+b);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number A: ");
        int a = sc.nextInt();

        System.out.print("Enter Number B: ");
        int b=sc.nextInt();

        swap(a,b);
        swapNumber(a,b);
    }
}
