import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contest =sc.nextInt();
        int cage = sc.nextInt();
        int [] catlist =new int [contest*2];
        for(int i=0; i<contest*2; i++){
            catlist[i] = sc.nextInt();
        }
        int[] newlist = new int[contest*2];
        int index =0;
        for(int i=0; i<contest*2; i++){
            if(catlist[i] > cage){
                newlist[index] = catlist[i];
                index += 1;
            }
        }
        int count=0;
        boolean ok =true;
        for(int i=0; i<index; i++){
            if(count %2 ==0){
                count +=1;
            }
            else{
                if(newlist[i] == newlist[i-1]){
                    count +=1;
                }else{
                    ok = false;
                    break;
                }

            }
        }
        System.out.println(ok ? "Yes" : "No");
        
    }
}
