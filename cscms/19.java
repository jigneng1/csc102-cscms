import java.util.Scanner;
class Main19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            long a=sc.nextLong();
            long b=sc.nextLong();
            long c=sc.nextLong();
            long result =a;
            for(int j=0; j<b; j++){
                result = result*a;
            }
            result=result%c;
            System.out.print(result);
        }
    }
}
