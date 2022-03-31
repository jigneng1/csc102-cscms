import java.util.ArrayList;
import java.util.Scanner;
class num4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String trandna=sc.nextLine().replaceAll("T", "U");
        int count =0;
        Boolean check = false;
        for(int i=0; i<trandna.length(); i+=3){
            String codon = trandna.substring(i,i+3);
            if(codon.equals("UAA") ||codon.equals("UGA") || codon.equals("UAG")){
                check = false;
            }
            else if(codon.equals("AUG")){
                count++;
                check = true;
            }
            else if(check){
                count++;
            }
        }
        System.out.print(count);
        
    }
}
