import java.util.Scanner;
class Main8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i=0; i<a; i++){
            if(i==0 || i== a-1){
                System.out.print("-");
                for(int j=0; j<a-2; j++){
                    System.out.print("*");
                }
                System.out.print("-");
            }
            else{
                for(int j=0; j<a; j++){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
