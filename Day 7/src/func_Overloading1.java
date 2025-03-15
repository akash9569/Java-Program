public class func_Overloading1 {
    public static int sum(int a,int b){
        return a+b;
    }
    public static int sum(int a,int b,int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        System.out.println("Sum of Two Number: "+sum(5,5));
        System.out.println("Sum of Three Number: "+sum(5,10,10));
    }
}
