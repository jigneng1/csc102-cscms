import java.text.*;
import java.util.Scanner;
class Main50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c1 = sc.nextDouble();
        double c2 = sc.nextDouble();
        double limit_tolerance = sc.nextDouble();
        double tot =(b-a)/2;
        double xns =(a+b)/2;

        while(tot>limit_tolerance){
            double f_xns = c1+(c2*(xns-Math.sin(xns)));
            double f_a =c1+(c2*(a-Math.sin(a)));

            if(f_xns*f_a<0){
                b=xns;
            }
            else{
                a=xns;
            }
            xns =(b+a)/2;
            tot = (b-a)/2;
        }
        System.out.printf("%.6f%n",xns);
    }
}
