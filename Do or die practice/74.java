import java.util.Scanner;
class Main74 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next().toLowerCase();
        String surname = sc.next().toLowerCase();
        String newname = "";
        String newsurname = "";
        for(int i=0; i<name.length(); i++){
            if(i==0){
                newname += name.substring(0,1).toUpperCase();
            }
            else{
                newname += name.charAt(i);
            }
        }
        for(int i=0; i<surname.length(); i++){
            if(i==0){
                newsurname += surname.substring(0,1).toUpperCase();
            }
            else{
                newsurname += surname.charAt(i);
            }
        }
        System.out.println(newname+" "+newsurname);
    }
}
