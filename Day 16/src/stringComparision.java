public class stringComparision {
    public static void main(String[] args) {
        String s1 = "Akash";
        String s2 = "Akash";
        String s3 = new String("Akash");

        if(s1 == s2){
            System.out.println("String is Equal.");
        }
        else {
            System.out.println("String is not Equal.");
        }

//        if(s1 == s3){
//            System.out.println("String is Equal.");
//        }
//        else {
//            System.out.println("String is not Equal.");
//        }

        if(s1.equals(s3)){
            System.out.println("String is Equal.");
        }
        else {
            System.out.println("String is not Equal.");
        }


    }
}
