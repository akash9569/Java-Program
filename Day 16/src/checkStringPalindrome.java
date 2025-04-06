import java.util.Scanner;

public class checkStringPalindrome {
    public static Boolean palindrome(String st){
        for (int i = 0; i < st.length()/2; i++) {
            int n = st.length();
            if(st.charAt(i) != st.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String st = sc.nextLine();

        System.out.println(palindrome(st));
    }
}
