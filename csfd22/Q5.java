import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cart = sc.nextInt();
        int position = sc.nextInt();
        int bomb = sc.nextInt();
        for(int i =0; i<bomb; i++){
            int bombp = sc.nextInt();
            int prevb = bombp-1;
            int nextp = bombp+1;
            if(bombp == position || prevb == position || nextp == position){
                System.out.println("DIE");
                return;
            }
        }
        System.out.println("SURVIVE");
    }
}
