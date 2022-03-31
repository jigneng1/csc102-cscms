import java.util.Scanner;
class Main111 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String word = sc.nextLine().toLowerCase();
        String search = sc.next().toLowerCase();
        String front = word.substring(0,search.length());
        String back = word.substring(search.length());
        if(word.equals(search)){
            System.out.print("Front,Back");
        }
        else{
            if(front.contains(search)){
                System.out.print("Front");
                if(back.contains(search)){
                    System.out.print(",Back");
                }
            }
            else if(back.contains(search)){
                System.out.print("Back");
            }
            else{
                System.out.print("No");
            }

        }
    }
}
