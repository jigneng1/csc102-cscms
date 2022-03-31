import java.util.Arrays;
import java.util.Scanner;
class M43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] a = sc.nextLine().split(" ");
        int size =a.length;
        int [] num = new int[size];
        int [] result = new int [size];

        for(int i=0; i<size; i++){
            num[i] =Integer.parseInt(a[i]); // change string to int
        }
        Arrays.sort(num);

        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                result[i] += Math.abs(num[i]-num[j]);
            }
        }
        Arrays.sort(result);
        System.out.println(result[0]);
    }
}
