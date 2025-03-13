import java.util.Scanner;

public class Character_Pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

//        Print the Character Pattern.
        /*
        A
        BC
        DEF
        GHIJ
        */

        System.out.print("Enter a Number: ");
        int num=sc.nextInt();

        char ch='A';

        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }

    }
}
