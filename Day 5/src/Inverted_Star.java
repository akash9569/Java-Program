import java.util.Scanner;

public class Inverted_Star {
    public static void main(String[] args) {
//        Inverted Star Pattern.
        /*
        ****
        ***
        **
        *
        */

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int num=sc.nextInt();

        for(int i=1;i<=num;i++){
            for(int j=1;j<=num-i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
