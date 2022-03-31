import java.util.Scanner;
class Main86 {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b =sc.nextInt();
      int result = mutiplication(a, b);
      System.out.println(result);
  }
  static int mutiplication(int a, int b){
    if(b != 0){
        return a+=mutiplication(a, b-1);
    }
    else{
        return a;
    }
  }  
}
