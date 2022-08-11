import java.util.Scanner;

class Main44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int [] result = new int[n];
        for(int i =0; i<n; i++){
            int number = sc.nextInt();
            for(int j=1; j<number; j++){
                boolean flag = false;
                for (int k = 2; k <= j / 2; ++k) {
                    if (j % k == 0) {
                        flag = true;
                        break;
                    }
                }
                if (!flag)
                result[i]++;
            }
        }
        for (int s : result) {
            System.out.println(s+" ");
        }
    }    
}
