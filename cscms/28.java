import java.util.Scanner;
class Main28 {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       sc.nextLine();
       String str1 = sc.nextLine();
       int b = sc.nextInt();
       if(str1.contains("+")){
           System.out.print(a+b);
        }
       if(str1.contains("-")){
           System.out.print(a-b);
        }
       if(str1.contains("*")){
        System.out.print(a*b);
        }
        if(str1.contains("/")){
            if(b==0){
                System.out.print("error");
            }
            else{
                System.out.print(a/b);
            }
        }
        if(str1.contains("%")){
            if(b==0){
                System.out.print("error");
            }
            else{
                System.out.print(a%b);
            }
         
        }
    }
}
