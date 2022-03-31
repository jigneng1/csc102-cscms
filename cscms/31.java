import java.util.Scanner;
class Main31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for( int i=a-1; i>=0; i--){
            for(int j=0; j<=a-1; j++){
                if(j >= i){
                    System.out.print("*");
                }
                else{
                    System.out.print("-");
                }
            }
            System.out.println();
        }
    }
}
