import java.util.Scanner;

public class Simple_Interest {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter Principle Amount: ");
        double p=sc.nextDouble();
        System.out.print("Enter Rate of Interest: ");
        double r=sc.nextDouble();
        System.out.print("Enter Time Period: ");
        double t=sc.nextDouble();

        double SI=(p*r*t)/100;
        System.out.print("Simple Interest: "+SI);
    }
}
