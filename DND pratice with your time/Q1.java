import java.util.Scanner;
public class Q1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] table = new int[row][col];

        int loop = sc.nextInt();
        for(int i=0; i<loop; i++){
            int row1 = sc.nextInt();
            int col1 =sc.nextInt();

            //สี่มุม

            if(row1==0 && col1==0){
                table[row1][col1]++;
                table[row1][col1+1]++;
                table[row1+1][col1]++;
            }
            else if(row1==0 && col1==col-1){
                table[row1][col1]++;
                table[row1][col1-1]++;
                table[row1+1][col1]++;
            }
            else if(row1==row-1 && col1==0){
                table[row1][col1]++;
                table[row1][col1+1]++;
                table[row1-1][col1]++;
            }
            else if(row1==row-1 && col1==col-1){
                table[row1][col1]++;
                table[row1][col1-1]++;
                table[row1-1][col1]++;
            }

            //ติดขอบ

            else if(row1==0){
                table[row1][col1]++;
                table[row1+1][col1]++;
                table[row1][col1+1]++;
                table[row1][col1-1]++;
            }

            else if(row1==row-1){
                table[row1][col1]++;
                table[row1-1][col1]++;
                table[row1][col1+1]++;
                table[row1][col1-1]++;
            }

            else if(col1==0){
                table[row1][col1]++;
                table[row1-1][col1]++;
                table[row1][col1+1]++;
                table[row1+1][col1]++;
            }

            else if(col1==col-1){
                table[row1][col1]++;
                table[row1-1][col1]++;
                table[row1][col1-1]++;
                table[row1+1][col1]++;
            }

            else{
                table[row1][col1]++;
                table[row1-1][col1]++;
                table[row1+1][col1]++;
                table[row1][col1+1]++;
                table[row1][col1-1]++;
            }
            
        }

        //output

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(table[i][j] >3){
                    System.out.print(table[i][j]%3 + " ");
                }
                else{
                    System.out.print(table[i][j]+" ");
                }
            }
            System.out.println();
        }

    }
}