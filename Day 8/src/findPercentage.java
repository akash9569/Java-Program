import java.util.Scanner;

public class findPercentage {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Your Physics Marks: ");
        int physics=sc.nextInt();
        System.out.print("Enter Your Chemistry Marks: ");
        int chemistry=sc.nextInt();
        System.out.print("Enter Your Math Marks: ");
        int math=sc.nextInt();
        System.out.print("Enter Your Drawing Marks: ");
        int drawing=sc.nextInt();
        System.out.print("Enter Your Hindi Marks: ");
        int hindi=sc.nextInt();
        System.out.print("Enter Your English Marks: ");
        int english=sc.nextInt();

        int total=(physics+chemistry+math+drawing+hindi+english);
        System.out.println("Total Marks Obtained is "+total);

        float percentage=total/6.0f;
        System.out.println("Percentage is "+percentage+" %");


    }
}
