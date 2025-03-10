import java.util.Scanner;

public class Calculater {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int num1=sc.nextInt();
        System.out.print("Enter Second Number: ");
        int num2=sc.nextInt();

        System.out.print("Enter Operater: ");
        char op=sc.next().charAt(0);
        double result;

        switch (op){
            case '+':
                result=num1+num2;
                break;
            case '-':
                result=num1-num2;
                break;
            case '*':
                result=num1*num2;
                break;
            case '/':
                if(num2!=0){
                    result=num1/num2;
                }
                else{
                    System.out.print("Division by zero is not alllowed.");
                    return;
                }
            case '%':
                result=num1%num2;
                break;
            default:
                System.out.print("Invalid Operator.");
                return;
        }
        System.out.print("Result is "+result);

    }
}
