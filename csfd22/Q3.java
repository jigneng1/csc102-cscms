import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] word = input.split(" ");
        for (String a : word) {
            System.out.print(a.equalsIgnoreCase("ping") ? "pong" : a.equalsIgnoreCase("pong") ? "ping" : "show");
            System.out.print(" ");
        }
    }
}
