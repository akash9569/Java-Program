import java.util.Scanner;

public class stringLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Name: ");
        String name = sc.nextLine();

        System.out.println("Hello My Name is: "+name);
        System.out.print("Your Name Length is "+name.length());
    }
}
