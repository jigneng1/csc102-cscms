import java.util.*;
class Main4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matrix = sc.nextInt();
        for(int i=0; i<matrix; i++){
            for(int j=0; j<matrix-1; j++){
                System.out.print("*");
            }
            System.out.println("*");
        }
    }
}

