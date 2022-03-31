import java.util.Scanner;
public class test3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        if(word.length() %2 ==0){
            System.out.print("Invalid word input");
        }else{
            int n = word.length();
            for(int i=0; i<n; i++){
                for(int j =0; j<n; j++){
                    if( i==j){
                        System.out.print(word.charAt(i));
                    }else if(i ==word.length()-1-j){
                        System.out.print(word.charAt(j));
                    }else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        } 
    }
}