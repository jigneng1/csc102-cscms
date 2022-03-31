import java.text.DecimalFormat;
import java.util.Scanner;
class Main79 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat deci = new DecimalFormat("0.00");
        int n = sc.nextInt();
        double[]num = new double[n];
        double sum ,max,min,average;
        sum=average=0;
        for(int i=0; i<n; i++){
            num[i] = sc.nextDouble();
        }
        max=min=num[0];
        for(int i=0; i<num.length; i++){
            sum += num[i];
            if(num[i]>max){
                max = num[i];
            }
            if(num[i]<min){
                min = num[i];
            }
        }
        average = sum/n;
        System.out.println("Summation: "+deci.format(sum));
        System.out.println("Average: "+deci.format(average));
        System.out.println("Max: "+deci.format(max));
        System.out.println("Min: "+deci.format(min));
    }
}
