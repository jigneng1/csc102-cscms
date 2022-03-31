import java.util.Scanner;
public class quiz1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String x =sc.nextLine();
        int len = x.length();

        for(int i= len-1; i>=0; i--){
            System.out.print(x.charAt(i));
        }
    }
}