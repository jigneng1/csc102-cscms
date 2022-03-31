
import java.util.Scanner;
class Main95 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] table = new int[row][col];
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                table[i][j] = sc.nextInt();
            }
        }
        System.out.println("Average of each row:");
        for(int i=0; i<row; i++){
            double sum=0;
            for(int j=0; j<col; j++){
                sum += table[i][j];
            }
            System.out.printf("%.2f ", sum/col);
        }
        System.out.println();
        System.out.println("Average of each column:");
        for(int i=0; i<col; i++){
            double sum = 0;
            for(int j=0; j<row; j++){
                sum += table[j][i];
            }
            System.out.printf("%.2f ", sum/row);
        }
        sc.close();
    }
}
