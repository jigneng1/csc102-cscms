import java.util.Arrays;
import java.util.Scanner;
class Main84 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        for(int i=0; i<n; i++){
            String word = sc.next();
            String word1 = sc.next();
            char[] sort1 = word.toCharArray();
            char[] sort2 = word1.toCharArray();
            Arrays.sort(sort1);
            Arrays.sort(sort2);
            if(word.length() == word1.length()){
                boolean check = false;
                for(int j=0; j<sort1.length; j++){
                    if(sort1[j] == sort2[j]){
                        check = true;
                    }
                    else{
                        check = false;
                        break;
                    }
                }
                if(check){
                    System.out.println("Yes");
                }
                else{
                    System.out.println("No");
                }
            }
            else{
                System.out.println("No");
            }

        }
    }
}
