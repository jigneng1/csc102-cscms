import java.util.Scanner;
public class quiz2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int friend =sc.nextInt();
        int cho = row*col;
        int sum = 0;
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                
                if(cho%friend ==0){
                    sum++;
                }
                if(sum == 10){
                    sum = 0;
                }
                System.out.print(sum);
                cho--;
            }

            System.out.println();//ทำบรรทัด
        }
    }
    
}
