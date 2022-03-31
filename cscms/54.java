import java.util.Arrays;
import java.util.Scanner;
class Main54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        for(int i=0; i<n; i++){
            num[i] = sc.nextInt();
        }
        Arrays.sort(num);
        if(num.length%2 !=0){
            for(int i=0; i<num.length/2; i++){
                System.out.print(num[num.length-i-1]+" ");
                System.out.print(num[i]+" ");
    
            }
            System.out.print(num[n/2]);
        }
        else{
            for(int i=0; i<num.length/2; i++){
                System.out.print(num[num.length-i-1]+" ");
                System.out.print(num[i]+" ");
    
            }
        }
    }
}
