import java.util.*;
class Main42 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int number = sc.nextInt();
        ArrayList<Integer> result = new ArrayList<Integer>();
        for(int i=1; i<=number; i++){
            if(number%i ==0){     
                result.add(i);  
            }
        }
        System.out.print(result.size());
    }
}
