import java.util.Scanner;
class Main10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        if(3<=n1 && n2<=500){
        for(int i = 0; i<n1; i++){
            if(i == 0){
                for(int j =0; j<n2; j++){
                    System.out.print("*");
                }
            }
            else if (i == n1-1) {
                for(int j = 0; j<n2; j++){
                    System.out.print("*");
                }
            } else {
                System.out.print("*");
                for(int j =0; j<n2-2; j++){
                    System.out.print("-");
                }
                System.out.print("*");
            }
            System.out.println();
        } 
        }else{
            System.out.print("");
        }
    }
}
