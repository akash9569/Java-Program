import java.util.Scanner;
// Zero One Triangle.

/*
1
01
101
0101
10101
*/
public class zeroOneTriangle {
    public static void triangle(int a){
        for(int i=1;i<=a;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1");
                }
                else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int a=sc.nextInt();

        triangle(a);
    }
}
