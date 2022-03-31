import java.util.Scanner;
class Main33 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int space = row-1;
        for(int i=1; i<=row; i++){
            for(int j=1; j<=space; j++){
                System.out.print("-");
            }
            for(int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
            for(int j=1; j<=space; j++){
                System.out.print("-");
            }
            space--;
            System.out.println("");//สร้างบรรทัด
        }
        space = 1;
        for(int i=1; i<= row-1; i++){
            for(int j= 1; j<=space; j++){
                System.out.print("-");
            }
            
            for(int j=1; j<= 2*(row-i)-1; j++){
                System.out.print("*");
            }
            for(int j= 1; j<=space; j++){
                System.out.print("-");
            }
            space++;
            System.out.println();
        }
        sc.close();
    }
}