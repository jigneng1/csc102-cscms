import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>0){
            toBinary(n);
        }
        else if(n == 0){
            System.out.print("0");
        }
    }
    public static void toBinary(int n){
        if(n>0){
            toBinary(n/2);
            System.out.print(n%2+"");
        }
    }
}

