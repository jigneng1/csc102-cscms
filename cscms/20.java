import java.util.Scanner;
class Main20{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        int [] arr = new int[amount];
        int max = 0;
        for(int i=0; i<amount; i++){
            arr[i] = sc.nextInt();
            if(max<arr[i]){
                max = arr[i];
                continue;
            }
        }
        System.out.print(max);

    }
}