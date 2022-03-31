import java.util.Arrays;
import java.util.Scanner;
class Main85 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int colum = sc.nextInt();
        int row = sc.nextInt();
        int[][] matrix = new int[row][colum];
        for(int i=0; i<row; i++){
            for(int j=0; j<colum; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<colum; i++){
            for(int j=0; j<row; j++){
                System.out.print(matrix[j][i]+" ");
            }
            System.out.println();
        }
    }
}
