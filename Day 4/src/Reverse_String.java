import java.util.Scanner;

public class Reverse_String {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a String: ");
        String original=sc.nextLine();

        StringBuilder rev=new StringBuilder(original);
        String reversed=rev.reverse().toString();
        System.out.println("Original String: "+original);
        System.out.print("Reverse The String: "+reversed);
    }
}
