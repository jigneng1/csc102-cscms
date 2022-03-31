import java.util.*;
class Main3{
  public static void main(String[] args){
  	Scanner sc = new Scanner(System.in);
    	long num = sc.nextInt();
        long factorial =1;
        for(int i = 1; i <= num; ++i)
        {
            factorial = factorial*i;
        }
        System.out.print(factorial);
  }
}
