import java.util.Scanner;
class Main48{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n1 =sc.next();
        String n2 = sc.next();
        String n3 = sc.next();
        String n4 = sc.next();

        if(n1.equals("0")&&n2.equals("0") ){
            if(n3.equals("-") &&n4.equals("1")){
                System.out.print("DnD");
            }
            else if(n3.equals("1") &&n4.equals("-")){
                System.out.print("MuR");
            }
            else if(n4.equals("-") &&n4.equals("-")){
                System.out.print("NEUTRAL");
            }
        }
        else if(n1.equals("0")&&n2.equals("1") ){
            if(n3.equals("-") &&n4.equals("1")){
                System.out.print("NEUTRAL");
            }
            else if(n3.equals("1") &&n4.equals("-")){
                System.out.print("MuR");
            }
            else if(n4.equals("-") &&n4.equals("-")){
                System.out.print("DnD");
            }
        }
        else if(n1.equals("1")&&n2.equals("0") ){
            if(n3.equals("-") &&n4.equals("1")){
                System.out.print("DnD");
            }
            else if(n3.equals("1") &&n4.equals("-")){
                System.out.print("NEUTRAL");
            }
            else if(n4.equals("-") &&n4.equals("-")){
                System.out.print("MuR");
            }
        }
    }
}