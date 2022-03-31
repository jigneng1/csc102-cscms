import java.util.Scanner;
class Main49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        String word2 = word.replace(" ", "").toLowerCase();
        boolean result = true;
        
        for(int i=0; i<word2.length(); i++){
            for(int j=i+1; j<word2.length(); j++){
                if(word2.charAt(i) == word2.charAt(j)){
                    result = false;
                    break;
                }
            }
        }
        if(result == false){
            System.out.print(word+" is not an isogram");
        }
        else{
            System.out.print(word+" is an isogram");
        }
    }
}
