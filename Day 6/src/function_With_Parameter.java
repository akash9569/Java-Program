import java.util.Scanner;

public class function_With_Parameter {

//    Print Your Name.

    public static void name(String Name){
        System.out.println("Your Name is "+ Name);
    }

//    Calculate Sum of Given Number.

    public static int sum(int a,int b){  // This is the Parameters.
        int sum=a+b;
        System.out.println("Sum is "+sum);
        return sum;
    }

//    Print Product of Given Number.

    public static  int product(int a, int b){
        int mul=a*b;
        System.out.println("Product of Given Number: "+mul);
        return mul;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Your Name: ");
        String Name=sc.nextLine();
        name(Name);

        System.out.print("Enter a Number: ");
        int a=sc.nextInt();
        System.out.print("Enter a Number: ");
        int b=sc.nextInt();
        sum(a,b);   // This is the Arguments.

        product(a,b);
    }
}
