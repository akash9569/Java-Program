import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num=sc.nextInt();

        if(num==2){
            System.out.print(num+" is a Prime Number.");
        }
        else{
            boolean isPrime=true;
            for (int i=2;i<=Math.sqrt(num);i++){
                if(num%i==0){
                    isPrime=false;
                }
            }
            if(isPrime==true){
                System.out.print(num+" is a Prime Number.");
            }
            else{
                System.out.print(num+" is not a Prime Number.");
            }
        }

    }
}
