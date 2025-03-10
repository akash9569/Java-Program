import java.util.Scanner;

public class Find_Largest_No {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int num1=sc.nextInt();
        System.out.print("Enter Second Number: ");
        int num2=sc.nextInt();
        System.out.print("Enter Third Number: ");
        int num3=sc.nextInt();

        if((num1>num2)&&(num1>num3)){
            System.out.println("Number first is greater than all.");
        } else if (num2>num3) {
            System.out.println("Number Second is greater than all.");
        }
        else{
            System.out.println("Number Third is greater than all.");
        }


        int largest=Math.max(num1,Math.max(num2,num3));
        System.out.print("Largest Number is "+largest);
    }
}
