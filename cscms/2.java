import java.util.*;
class Main2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Str1 = sc.nextLine();
        String Str2 = sc.nextLine();
        if(Str1.length()>Str2.length()){
            System.out.print(Str1.replace(Str2, ""));
        }else{
            System.out.print(Str2.replace(Str1, ""));
        }
    }

}