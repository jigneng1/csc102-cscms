import java.util.*;
class Main40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long sum= 0;
        for(int i=1; i<=n; i++){
            sum+=i;
        }
        System.out.print(sum);
    }
}
