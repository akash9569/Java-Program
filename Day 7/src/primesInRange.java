import java.util.Scanner;

public class primesInRange {
    public static boolean prime(int a){
        boolean isPrime=true;
        if(a==2){
            return true;
        }
        for(int i=2;i<=Math.sqrt(a);i++){
            if(a%i==0){
                return false;
            }
        }
        return true;
    }
    public static void primesRange(int a){
        for(int i=2;i<=a;i++){
            if(prime(i)){
                System.out.print(i+", ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int a=sc.nextInt();

        primesRange(a);
    }
}
