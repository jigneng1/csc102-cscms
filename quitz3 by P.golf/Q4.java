import java.util.Scanner;

public class Q4 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String dna = sc.nextLine();
    String transcriptedDNA = dna.replace("T", "U");
    int count = 0;
    boolean start = false;
    for (int i = 0; i < transcriptedDNA.length(); i += 3) {
      String codon = transcriptedDNA.substring(i, i + 3);
      if (codon.equals("UAA") || codon.equals("UAG") || codon.equals("UGA")) {
        start = false;
      } else if (codon.equals("AUG")) {
        count++;
        start = true;
      } else if (start) {
        count++;
      }
    }
    System.out.println(count);
  }
}
