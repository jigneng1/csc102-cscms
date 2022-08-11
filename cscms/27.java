import java.util.Arrays;
import java.util.Scanner;

class Main27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int[] sortedArr = arr.clone();
        Arrays.sort(sortedArr);
        //find index of percentile
        int P10 = (int)Math.ceil((10*(n+1))/100.0)-1;
        int P30 = (int)Math.ceil(((30*(n+1))/100.0))-1;
        int P50 = (int)Math.ceil(((50*(n+1))/100.0))-1;
        int P70 = (int)Math.ceil(((70*(n+1))/100.0))-1;
        int P90 = (int)Math.ceil(((90*(n+1))/100.0))-1;
        
        for(int i=0; i<arr.length; i++){
            int score = arr[i];
            if(score>=sortedArr[P90]){
                System.out.print("A");
            }
            else if(score>=sortedArr[P70] && score<sortedArr[P90]){
                System.out.print("B");
            }
            else if (score>=sortedArr[P50] && score<sortedArr[P70]){
                System.out.print("C");
            }
            else if(score>=sortedArr[P30] && score<sortedArr[P50]){
                System.out.print("D");
            }
            else if (score>=sortedArr[P10] && score<sortedArr[P30]){
                System.out.print("E");
            }
            else{
                System.out.print("F");
            }
            System.out.print(" ");
        }
    }
}
