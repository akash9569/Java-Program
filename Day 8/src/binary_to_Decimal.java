import java.util.Scanner;

public class binary_to_Decimal {
    public static void Decimal(int num){
        int decimal = Integer.parseInt(String.valueOf(num), 2);
        System.out.println("Decimal equivalent of binary " + num + " is: " + decimal);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a Binary Number: ");
        int num=sc.nextInt();

        Decimal(num);
    }
}
