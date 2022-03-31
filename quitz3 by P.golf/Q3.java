import java.util.*;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> set = new HashSet<String>(); //ใช้ set เพราะมันจะไม่นับตัวซ้ำกัน
        String text = sc.nextLine();
        for(int i = 0; i < text.length(); i++) {
            set.add(text.substring(i,i+1).toUpperCase()); 
        }
        String[] arr = new String[set.size()];
        int index = 0;
        for(String s: set) {
            arr[index] = s;
            index++;
        }
        Arrays.sort(arr);
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}