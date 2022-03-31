import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
class Main94 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Double> num = new ArrayList<Double>();
        for(int i=0; i<n; i++){
            num.add(sc.nextDouble());
        }
        Collections.sort(num);
        for(int i=0; i<num.size()/2; i+=2){
            Collections.swap(num,i,num.size()-i-1);
        }
        for(double i:num){
            DecimalFormat df = new DecimalFormat("0.00");
            System.out.print(df.format(i)+" ");
        }
    }
}
