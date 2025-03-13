import java.util.Scanner;

public class half_Pyramid_Char_Pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //        Print Character Pattern.
        /*
        A
        AB
        ABC
        ABCD
        */

        System.out.print("Enter a Number: ");
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            for(char chr='A';chr<'A'+i;chr++){
                System.out.print(chr);
            }
            System.out.println();
        }
    }
}
