import java.util.*;
class Main144{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();
        String findStr = sc.nextLine().toLowerCase();
        //System.out.println(str.split(findStr).length);  
        String[] arr = str.split(findStr,-1);
        for(String i : arr){
            System.out.println(i);
        }
        System.out.println(arr.length-1);
    }
}
