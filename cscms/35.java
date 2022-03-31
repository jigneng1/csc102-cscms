import java.util.Scanner;

class Main35 {
    public static void main(String[] agrs) {

     Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int min = Math.min(n1,n2);
        int max = Math.max(n1,n2);
        int sum = 0;

        for (int i = min; i < max; i++) {
            boolean check = true;
            for (int j = 2; j <= i/2; j++) {
                if (i % j == 0 && j != i) {
                    check = false;
                }
            }

            if (check) {
                sum += i;
            }
        }

        System.out.println(sum);
    }
}
