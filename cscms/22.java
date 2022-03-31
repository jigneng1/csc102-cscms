import java.util.Scanner;
class Main22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine().toLowerCase();
        int result = 0;
        for(int i=0; i<str1.length(); i++){
            char Str3 = str1.charAt(i);
            if(Str3 == 'a'){
                result += 1-i;
            }
            if(Str3 == 'b'){
                result += 2-i;
            }
            if(Str3 == 'c'){
                result += 3-i;
            }
            if(Str3 == 'd'){
                result += 4-i;
            }
            if(Str3 == 'e'){
                result += 5-i;
            }
            if(Str3 == 'f'){
                result += 6-i;
            }
            if(Str3 == 'g'){
                result += 7-i;
            }
            if(Str3 == 'h'){
                result += 8-i;
            }
            if(Str3 == 'i'){
                result += 9-i;
            }
            if(Str3 == 'j'){
                result += 10-i;
            }
            if(Str3 == 'k'){
                result += 11-i;
            }
            if(Str3 == 'l'){
                result += 12-i;
            }
            if(Str3 == 'm'){
                result += 13-i;
            }
            if(Str3 == 'n'){
                result += 14-i;
            }
            if(Str3 == 'o'){
                result += 15-i;
            }
            if(Str3 == 'p'){
                result += 16-i;
            }
            if(Str3 == 'q'){
                result += 17-i;
            }
            if(Str3 == 'r'){
                result += 18-i;
            }
            if(Str3 == 's'){
                result += 19-i;
            }
            if(Str3 == 't'){
                result += 20-i;
            }
            if(Str3 == 'u'){
                result += 21-i;
            }
            if(Str3 == 'v'){
                result += 22-i;
            }
            if(Str3 == 'w'){
                result += 23-i;
            }
            if(Str3 == 'x'){
                result += 24-i;
            }
            if(Str3 == 'y'){
                result += 25-i;
            }
            if(Str3 == 'z'){
                result += 26-i;
            }
        }
        System.out.print(result);
        
    }
}
