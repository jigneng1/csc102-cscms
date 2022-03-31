import java.util.Scanner;

public class quiz4 {

    public static boolean ltor(char arr[][],int r,int c,String text,int textind){
        if(textind == text.length())
            return true;
        if(arr[0].length == c)
            return false;
        if(arr[r][c] == text.charAt(textind))
            return ltor(arr, r, c+1, text, textind+1); 
        return false;
    }
    public static boolean ttob(char arr[][],int r,int c,String text,int textind){
        if(textind == text.length())
            return true;
        if(arr.length == r)
            return false;
        if(arr[r][c] == text.charAt(textind))
            return ttob(arr, r+1, c, text, textind+1);
        return false;
    }
    public static boolean tltobr(char arr[][],int r,int c,String text,int textind){
        if(textind == text.length())
            return true;
        if(arr.length == r || arr[0].length == c)
            return false;
        if(arr[r][c] == text.charAt(textind))
            return tltobr(arr, r+1, c+1, text, textind+1);
        return false;

    }
    public static boolean trtobl(char arr[][],int r,int c,String text,int textind){
        if(textind == text.length())
            return true;
        if(arr.length == r || c < 0)
            return false;
        if(arr[r][c] == text.charAt(textind))
            return trtobl(arr, r+1, c-1, text, textind+1);
        return false;
    }


    public static boolean check(char arr[][],char revarr[][],String text){
        boolean isok = false;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j] == text.charAt(0)){
                    if(ltor(arr, i, j+1, text, 1) || ttob(arr, i+1, j, text, 1) || tltobr(arr, i+1, j+1, text, 1) ||trtobl(arr, i+1, j-1, text, 1))
                        isok = true;
                }
            }
        }

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(revarr[i][j] == text.charAt(0)){
                    if(ltor(revarr, i, j+1, text, 1) || ttob(revarr, i+1, j, text, 1) || tltobr(revarr, i+1, j+1, text, 1) ||trtobl(revarr, i+1, j-1, text, 1))
                        isok = true;
                }
            }
        }

        return isok;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt(),c = sc.nextInt();
        char arr[][] = new char[r][c];
        char revarr[][] = new char[r][c];
        //init
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++){
                arr[i][j] = sc.next().charAt(0);
                revarr[r-1-i][c-1-j] = arr[i][j];
            }
        String texts[] = new String[sc.nextInt()];
        for(int i=0;i<texts.length;i++)
            texts[i] = sc.next();
        sc.close();
        for(int i=0;i<texts.length;i++){
            System.out.print(texts[i]+" ");
            System.out.print(check(arr,revarr, texts[i]) ? "found" : "not found");
            System.out.println();
        }
    }
}
