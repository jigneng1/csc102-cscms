import java.util.Scanner;
class Main75{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine().toLowerCase();
        String b = sc.nextLine().toLowerCase();
        if(a.equals("rock")){
            if(b.equals("paper")){
                System.out.print("Dr.Worarat Krathu");
            }
            else if(b.equals("scissors")){
                System.out.print("Mr.Ukrit Ruckcharti");
            }
            else{
                System.out.print("Draw");
            }
        }
        if(a.equals("scissors")){
            if(b.equals("rock")){
                System.out.print("Dr.Worarat Krathu");
            }
            else if(b.equals("paper")){
                System.out.print("Mr.Ukrit Ruckcharti");
            }
            else{
                System.out.print("Draw");
            }
        }
        if(a.equals("paper")){
            if(b.equals("scissors")){
                System.out.print("Dr.Worarat Krathu");
            }
            else if(b.equals("rock")){
                System.out.print("Mr.Ukrit Ruckcharti");
            }
            else{
                System.out.print("Draw");
            }
        }
    }    
}
