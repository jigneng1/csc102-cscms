import java.util.Scanner;
class Main61{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine().toLowerCase();
        char[] word = a.toCharArray();
        int result =0;
        int c =0;
        for(int i=1; i<word.length; i++){
            for(int j=c; j<i; j++ ){
                if(word[j] == word[i]){
                    result++;
                    c =i;
                    break;

                }
            }
        }
        System.out.print(result+1);
        sc.close();
    }
}