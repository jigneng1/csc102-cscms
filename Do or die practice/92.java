import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;
class Main92 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] num = new double[n];
        for(int i=0; i<n; i++){
            num[i] = sc.nextDouble();
        }
        Arrays.sort(num);
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.print(df.format(num[1])+" "+df.format(num[n-2]));
    }
}
