import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int n=sc.nextInt();


//        Print Star Pattern.
        /*
         *
         **
         ***
         ****
        */

//        for(int i=1;i<=n;i++){
//            for (int j=1; j<=i; j++) {
//                System.out.print("*"+" ");
//            }
//            System.out.println();
//        }



//      Print Inverted Pattern.
        /*
         ****
         ***
         **
         *
        */

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
