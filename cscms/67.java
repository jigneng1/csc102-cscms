import java.util.Scanner;

class Main67 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result=0;
        for(int i=1; i<=num; i++){
            if(i%2==0){
                result=result+(i*2);
            }
            else if(i%5==0){
                result=result+(i*5);
            }
            else{
                result=result+i;
            }
        }

        sc.close();
    }
}