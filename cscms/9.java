import java.util.*;
class Main9{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        int b1 = b+1;
        int b2 = b-1;
        if((n == 3 && b == 2) || (n <=2)){
            System.out.print("DIE");
        }else{
            for(int i=1; i<=n; i++){
                if( i == b1 || i== b2 || i == b){
                    System.out.print("");
                
                }else{
                    System.out.print(i+" ");
                }
            }
        }
    }
}
