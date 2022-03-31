import java.util.Scanner;
class Main77 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a>b){
            System.out.println("Not enough money.");
        }
        else if(a == b){
            System.out.println("No change for you.");
        }
        else{
            int result = b-a;
            System.out.println("Change: "+result);
            if(result>=1000){
                System.out.println("1000THB: "+result/1000 );
                result = result%1000;
            }
            else if(result<1000){
                System.out.println("1000THB: 0" );
            }
            if(result>=500){
                System.out.println("500THB: "+result/500 );
                result = result%500;
            }
            else if(result<500){
                System.out.println("500THB: 0" );
            }
            if(result>=100){
                System.out.println("100THB: "+result/100 );
                result = result%100;
            }
            else if(result<100){
                System.out.println("100THB: 0" );
            }
            if(result>=50){
                System.out.println("50THB: "+result/50 );
                result = result%50;
            }
            else if(result<50){
                System.out.println("50THB: 0" );
            }
            if(result>=20){
                System.out.println("20THB: "+result/20 );
                result = result%20;
            }
            else if(result<20){
                System.out.println("20THB: 0" );
            }
            if(result>=10){
                System.out.println("10THB: "+result/10 );
                result = result%10;
            }
            else if(result<10){
                System.out.println("10THB: 0" );
            }
            if(result>=5){
                System.out.println("5THB: "+result/5 );
                result = result%5;
            }
            else if(result<5){
                System.out.println("5THB: 0" );
            }
            if(result>=2){
                System.out.println("2THB: "+result/2 );
                result = result%2;
            }
            else if(result<2){
                System.out.println("2THB: 0" );
            }
            if(result>=1){
                System.out.println("1THB: "+result/1 );
                result = result%1;
            }
            else if(result<1){
                System.out.println("1THB: 0" );
            }
            
        }
    }
}
