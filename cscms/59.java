import java.util.Scanner;
class Main59 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
      int n =sc.nextInt();
      int m =sc.nextInt();
      int [] bucket = new int[n];
      for(int i=0; i<m; i++){
        int a = sc.nextInt();
        int b = sc.nextInt();
        for(int j=a; j<=b; j++){
            bucket[j-1]++;
        }
      }
      for(int s : bucket){
        System.out.print(s+" ");
      }
    }
}
