import java.util.Scanner;

//Inverted half Pyramid With Number.
/*
12345
1234
123
12
1
*/
public class inverted_Half_Pyramid_Number {
    public static void inverted_Pyramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n=sc.nextInt();

        inverted_Pyramid(n);
    }
}
