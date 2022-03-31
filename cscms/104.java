import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;
class Main104 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n =sc.nextLong();
        long start = sc.nextLong();
        long max=n+start-1,min =start;
        long loop =sc.nextLong();
        TreeSet<Long>num = new TreeSet<Long>();
        for(long i=0; i<loop; i++){
            long a = sc.nextLong();
            if(a<=max && a>=min){
                num.add(a);
            }
        }
        System.out.println(num.size());
        for(Long value:num){
            System.out.println(value);
        }
    }
}
