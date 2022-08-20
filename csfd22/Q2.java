import java.util.Scanner;
public class Q2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    if( n == 1 || n ==2 ){
        double high = sc.nextDouble();
        double width = sc.nextDouble();
        if(n == 1){
            System.out.printf("%.2f",width*high);
        }
        else{
            System.out.printf("%.2f",0.5*high*width);
        }
    }
    else if (n==3){
        double r = sc.nextDouble();
        System.out.printf("%.2f",3.14*r*r);
    }
  }
}
