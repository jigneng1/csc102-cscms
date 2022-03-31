import java.util.Scanner;
class Main45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine().toLowerCase();
        char[] alpha = word.toCharArray();
        for(int i=0; i<alpha.length; i++){
            boolean check =false;
            for(int j=0; j<alpha.length; j++){
                if(alpha[i]==alpha[j] &&j!=i){
                    check = true;
                }
            }
            if(check){
                System.out.print("-");
            }
            else{
                System.out.print("*");
            }
        }
    }
}
