import java.util.Scanner;

public class Check_Leap_Year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Year: ");
        int year=sc.nextInt();
        if(((year%4==0)&&(year%100!=0))||(year%400==0)){
            System.out.print(year+" is a Leap Year.");
        }
        else{
            System.out.print(year+ " is Not a Leap Year.");
        }
    }
}
