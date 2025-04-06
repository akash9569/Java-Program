import java.util.Scanner;

public class findShortestPath {
    public static float shortestPath(String path){
        int x = 0, y = 0;
        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);
//            South
            if(dir == 's'){
                y--;
            }
//            North
            else if (dir == 'n') {
                y++;
            }
//            West
            else if (dir == 'w') {
                x--;
            }
//            East
            else {
                x++;
            }
        }
        int x2 = x*x;
        int y2 = y*y;
        return (float)Math.sqrt(x2+y2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Path: ");
        String path = sc.next();

        System.out.println(shortestPath(path));
//        Time Complexity = O(n)
    }
}
