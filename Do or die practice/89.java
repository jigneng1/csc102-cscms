import java.util.Scanner;
class Main89 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        char[] arr = word.toCharArray();
        for(int i=0; i<arr.length; i++){
            if(Character.isUpperCase(arr[i])){
                System.out.print(arr[i]);
            }
        }
    }
}
