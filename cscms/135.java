import java.util.*;
class Main135 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print(power(a,b));
    }
    public static int power(int base,int powerRised){
        if(powerRised !=0){
            return(base*power(base,powerRised-1));
        }
        else{
            return 1;
        }
    }
}
