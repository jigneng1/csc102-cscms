import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int result = 1;
        for(int i=0; i <input; i++){
            System.out.print(result);
            if(result == 3){
                result = 1;
                System.out.print(" ");
            }
            else{
                result++;
            }
        }
    }
}
