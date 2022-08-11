import java.util.Scanner;
class Main69 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        int Leu=0,Pro=0,His=0,Gln=0,Arg=0;
        for(int i=0; i<word.length(); i+=3){
            String Rna = word.substring(i, i+3);
            
            if(Rna.equals("CUU")||Rna.equals("CUC")||Rna.equals("CUA")||Rna.equals("CUG")){
                Leu++;
            }
            else if(Rna.equals("CCU")||Rna.equals("CCC")||Rna.equals("CCA")||Rna.equals("CCG")){
                Pro++;
            }
            else if(Rna.equals("CAU")||Rna.equals("CAC")){
                His++;
            }
            else if(Rna.equals("CAA")||Rna.equals("CAG")){
                Gln++;
            }
            else if(Rna.equals("CGU")||Rna.equals("CGC")||Rna.equals("CGA")||Rna.equals("CGG")){
                Arg++;
            }
            
        }
        System.out.println(Leu+" "+Pro+" "+His+" "+Gln+" "+Arg);
    }
}
