import java.util.Scanner;
class MorseCode{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word1 =sc.nextLine().toUpperCase();
                for(int j=0; j<word1.length(); j++){
                    if(word1.charAt(j)== 'A'){
                        System.out.print(".-");
                    }
                    if(word1.charAt(j)== 'B'){
                        System.out.print("-...");
                    }
                    if(word1.charAt(j) == 'C'){
                        System.out.print("-.-.");
                    }
                    if(word1.charAt(j) == 'D'){
                        System.out.print("-..");
                    }
                    if(word1.charAt(j) == 'E'){
                        System.out.print(".");
                    }
                    if(word1.charAt(j) == 'F'){
                        System.out.print("..-.");
                    }
                    if(word1.charAt(j) == 'G'){
                        System.out.print("--.");
                    }
                    if(word1.charAt(j) == 'H'){
                        System.out.print("....");
                    }
                    if(word1.charAt(j) == 'I'){
                        System.out.print("..");
                    }
                    if(word1.charAt(j) == 'J'){
                        System.out.print(".---");
                    }
                    if(word1.charAt(j) == 'K'){
                        System.out.print("-.-");
                    }
                    if(word1.charAt(j) == 'L'){
                        System.out.print(".-..");
                    }
                    if(word1.charAt(j) == 'M'){
                        System.out.print("--");
                    }
                    if(word1.charAt(j) == 'N'){
                        System.out.print("-.");
                    }
                    if(word1.charAt(j) == 'O'){
                        System.out.print("---");
                    }
                    if(word1.charAt(j) == 'P'){
                        System.out.print(".--.");
                    }
                    if(word1.charAt(j) == 'Q'){
                        System.out.print("--.-");
                    }
                    if(word1.charAt(j) == 'R'){
                        System.out.print(".-.");
                    }
                    if(word1.charAt(j) == 'S'){
                        System.out.print("...");
                    }
                    if(word1.charAt(j) == 'T'){
                        System.out.print("-");
                    }
                    if(word1.charAt(j) == 'U'){
                        System.out.print("..-");
                    }
                    if(word1.charAt(j) == 'V'){
                        System.out.print("...-");
                    }
                    if(word1.charAt(j) == 'W'){
                        System.out.print(".--");
                    }
                    if(word1.charAt(j) == 'X'){
                        System.out.print("-..-");
                    }
                    if(word1.charAt(j) == 'Y'){
                        System.out.print("-.--");
                    }
                    if(word1.charAt(j) == 'Z'){
                        System.out.print("--..");
                    }
                    if(word1.charAt(j)==' '){
                        System.out.print("/");
                    }
                    System.out.print(" ");
                }
            }
        }
    
