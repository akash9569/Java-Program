import java.util.Scanner;

public class hollow_Rectangle {
    public static void hollow(int row,int col){
        for(int i=1;i<=row;i++){
            for(int j=1;j<=col;j++){
                if(i ==1 || i == row || j == 1 || j == col){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        Print Hollow Rectangle.
        /*
        *******
        *     *
        *     *
        *******
        */

        System.out.print("Enter Number of Rows: ");
        int row=sc.nextInt();

        System.out.print("Enter Number of Column: ");
        int col=sc.nextInt();

        hollow(row,col);
    }
}
