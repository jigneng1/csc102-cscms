import java.util.Scanner;
class Main93 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            StringBuilder word = new StringBuilder(sc.next().toLowerCase());
            word.reverse();
            String word1 = "";
            for(int j=0; j<word.length(); j++){
                if(j==0){
                    word1+=word.substring(0,1).toUpperCase();
                }
                else{
                    word1+= word.charAt(j);
                }
            }
            System.out.print(word1+" ");
        }
    }
}
