import java.util.*;
class Main67{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int distance = sc.nextInt();
        int result = 0;
        for(int i=1; i<=distance; i++){
            if(i%15==0){
                result += 10*i;
            }
            else if(i%5==0){
                result += 3*i;
            }
            else if(i%3==0){
                result += 2*i;
            }
            else{
                result+=i;
            }
        }
        System.out.println(result);
    }
}