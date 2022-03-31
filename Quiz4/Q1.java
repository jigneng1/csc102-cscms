import java.nio.charset.CoderResult;
import java.util.*;
class Q1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String,Integer> course = new HashMap<String,Integer>();
        String keys ="";
        int max=0;
        while (true) {
            String word = sc.nextLine();
            if(word.equals("end")){
                break;
            }
            else{
                String[] arr = word.split(",");
                int n = Integer.parseInt(arr[1]);
                if(course.containsKey(arr[0])){
                    n+=course.get(arr[0]);
                    if(n>max){
                        max=n;
                        keys=arr[0];
                    }
                    course.put(arr[0], n);
                }
                else{
                    if(n>max){
                        max =n;
                        keys=arr[0];
                    }
                    course.put(arr[0], n);
                }
            }
            
        }
        System.out.print(keys+","+course.get(keys));
    }
}