import java.util.Scanner;

public class func_Overloading {
    public static int multiply(int a, int b){
        int mul=a*b;
        System.out.println("Multiplication of Number: "+mul);
        return mul;
    }
    public static float multiply(float a, float b){
        float mul=a*b;
        System.out.println("Multiplication of Number: "+mul);
        return mul;
    }
    public static void main(String[] args) {
        multiply(5,6);
    }
}
