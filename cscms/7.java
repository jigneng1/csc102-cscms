import java.util.*;
class Main7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        if(n == 1){
            System.out.print("0");
        }else{
            arr[1] = 1;
            arr[0] = 0;
            for(int i=2; i<n; i++){
            arr[i] = arr[i-1]+arr[i-2];
        }
        Arrays.toString(arr);
        for(int i : arr){
            System.out.print(i+" ");
        }
        }
    }
}
