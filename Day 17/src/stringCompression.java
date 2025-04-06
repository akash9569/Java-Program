import java.util.Scanner;

public class stringCompression {
    public static String compress(String st){
        String newStr = "";

        for (int i = 0; i < st.length(); i++) {
            Integer count = 1;
            while(i<st.length()-1 && st.charAt(i) == st.charAt(i+1)){
                count++;
                i++;
            }
            newStr += st.charAt(i);
            if(count > 1){
                newStr += count.toString();
            }
        }
        return newStr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String st = sc.next();

        System.out.println(compress(st));
    }
}
