import java.util.*;
public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        ArrayList<String> sentence = new ArrayList<String>();
        for(int i=0; i<n; i++){
            String word =sc.next().toLowerCase();
            if(word.length()>2){
                char[] arr = word.toCharArray();
                char temp = arr[0];
                arr[0] = arr[word.length()-1];
                arr[word.length()-1] =temp;

                String newword = new String(arr);
                sentence.add(newword);
            }
            else{
                sentence.add(word);
            }
        }

        Collections.reverse(sentence);

        for(String s : sentence){
            System.out.print(s+" ");
        }
        
    }
}
