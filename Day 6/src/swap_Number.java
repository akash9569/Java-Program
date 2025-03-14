import java.util.Scanner;

public class swap_Number {

    public static void Swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println("Number A is "+a);
        System.out.println("Number B is "+b);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Number A is ");
        int a=sc.nextInt();
        System.out.print("Enter Number B is ");
        int b=sc.nextInt();

        Swap(a,b);
    }
}
