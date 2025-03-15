import java.util.Scanner;

public class primeOrNot {
    public static boolean prime(int a){
        if(a==2){
            System.out.println(a+" is a Prime Number.");
        }
        else{
            boolean isPrime=true;
            for(int i=2;i<=Math.sqrt(a);i++){
                if(a%i==0){
                    isPrime=false;
                }
            }
            if(isPrime==true){
                System.out.println(a+" is a Prime Number.");
            }
            else {
                System.out.println(a+" is not a Prime Number.");
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int a=sc.nextInt();
        prime(a);

    }
}
