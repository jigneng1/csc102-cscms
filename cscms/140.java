import java.util.Scanner;
class main140 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        String[] arr = new String[a];
        for(int i=0; i<a; i++){
            arr[i] = sc.next();
            if(i%2==0){
                System.out.print(arr[i]+" ");
            }
            else{
                StringBuilder s = new StringBuilder(arr[i]);
                System.out.print(s.reverse()+" ");
            }
        }
        sc.close();
    }
}
