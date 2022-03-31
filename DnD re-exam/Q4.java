import java.util.Scanner;
class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        String[] sentence = new String[n];
        for(int i=0; i<n; i++){
            String word = sc.next().toLowerCase();
            if(word.length()>2){
                String reverse="";
                reverse += word.charAt(word.length()-1);
                for(int j=1; j<=word.length()-2; j++){
                    reverse += word.charAt(j);
                }
                reverse += word.charAt(0);
                sentence[i] = reverse;
            }
            else{
                sentence[i] = word;
            }
        }
        for(int i =sentence.length-1; i>=0; i--){
            System.out.print(sentence[i]+" ");
        }
    }
}
