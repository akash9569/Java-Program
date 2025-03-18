import java.util.Scanner;

public class armstrongNumber {
    public static void armStrong(int a){
        int sum=0,res,temp;
        temp=a;
        while(a>0){
            res=a%10;
            a=a/10;
            sum=sum+(res*res*res);
        }
        if(temp == sum){
            System.out.println(temp+" is Armstrong Number.");
        }
        else{
            System.out.println(temp+" is not Armstrong Number.");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int a=sc.nextInt();

        armStrong(a);
    }
}
