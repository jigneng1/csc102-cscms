import java.util.Scanner;
class Main29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a =sc.nextLine();
        int b =sc.nextInt();
        for(int i=0; i<a.length(); i++){
            if(i%b ==0){
                System.out.print(a.charAt(i));
            }
        }
    }
}
