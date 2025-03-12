import java.util.Scanner;

public class Quotient_and_Reminder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Divident: ");
        double divident=sc.nextDouble();
        System.out.print("Enter Divisor: ");
        double divisor=sc.nextDouble();

        double qoutient=divident/divisor;
        double remainder=divident%divisor;
        System.out.println("Quotient: "+qoutient);
        System.out.print("Remainder: "+remainder);
    }
}
