import java.util.Scanner;
class Main25{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(b>a){
            for(int i=0; i<b-a+1; i++){
                for(int j=0; j<i+1; j++){
                    System.out.print(b-j +" ");
                }
            }
        }
        else if(a>b){
            for(int i=0; i<a-b+1; i++){
                for(int j=0; j<i+1; j++){
                    System.out.print(a-j +" ");
                }
            }
        }
        else{
            System.out.print(a);
        }

    }
}