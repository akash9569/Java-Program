import java.util.Scanner;

// Floyd triangle.
/*
1
23
456
78910
*/

public class floyd_Triangle {
    public static void floyd(int n){
        int counter=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int n=sc.nextInt();

        floyd(n);
    }
}
