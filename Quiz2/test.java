import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 =sc.nextLine().replace(".", " ");
        String[] ip = str1.split(" ");
        int[] result = new int[4];
        for(int i=0; i<4; i++){
            result[i] =Integer.parseInt(ip[i]);
        }
        boolean check = false;
        for(int i=0; i<4; i++){
            if(result[i] >=0 && result[i] <= 255){
                check=true;
            }
            else if(result[i] >255 || result[i] <0){
                check =false;
                break;
            }
        }

        if(check == true){
            System.out.print("Valid");
        }
        else if(check == false){
            System.out.print("Invalid");
        }
    }
}


