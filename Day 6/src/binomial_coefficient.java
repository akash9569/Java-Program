import java.util.Scanner;

public class binomial_coefficient {

    public static int factorial(int num){
        long factotial=1;
        for(int i=1;i<=num;i++){
            factotial *= i;
        }
//        System.out.println("Factorial of "+num+" is "+factotial);
        return num;
    }

    public static int binomialCoef(int n, int r){
        int n_fact= factorial(n);
        int r_fact= factorial(r);
        int nr_fact= factorial(n-r);

        int binomial=n_fact / (r_fact * nr_fact);
        System.out.print("Binomial Coefficient is "+binomial);
        return binomial;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Value of N: ");
        int n=sc.nextInt();
        System.out.print("Enter Value of R: ");
        int r=sc.nextInt();

        binomialCoef(n,r);
    }
}
