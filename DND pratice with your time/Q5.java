import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int end = n+20;
        int result=0;
        for(int i=n; i<=end; i+=2){
            result+=i;
        }
        System.out.println(result);
    }
}
