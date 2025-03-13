import java.sql.SQLOutput;
import java.util.Scanner;

public class half_Pyramid_Pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

//        Half Pyramid Number Pattern.

        /*
        1
        12
        123
        1234
        12345
        */

        System.out.print("Enter a Number: ");
        int num=sc.nextInt();

        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
