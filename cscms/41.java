import java.util.ArrayList;
import java.util.Scanner;
class Main41 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int number = sc.nextInt();
        ArrayList<Integer> result = new ArrayList<Integer>();
        for(int i=2; i<number; i++){
            while(number%i ==0){     
                result.add(i);  
                number = number/i;
            }
        }
        if(number>2){
            result.add(number);
        }
        for(int i=0; i<result.size(); i++){
            if(i != result.size()-1){
                System.out.print(result.get(i)+" x ");
            }
            else{
                System.out.print(result.get(i));
            }
        }
        if(result.size()==0){
            System.out.print(number);
        }

    }
}
