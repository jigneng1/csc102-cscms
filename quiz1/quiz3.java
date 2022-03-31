import java.util.Scanner;
public class quiz3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int members = sc.nextInt();
        int gifts  = sc.nextInt();
        int[] member = new int[members];
        int max =0;
        for(int i=0; i<gifts; i++){// loop 1-10
            int tag =sc.nextInt();
            member[tag%members]++; // index ที่ tag%member ให้ +1
            if(max < member[tag%members]){ 
                max = member[tag%members]; // เก็บค่าสูงสุดจำนวนที่ได้ gift
            }
        }

        for(int i=0; i<members; i++){
            if(max == member[i]){
                System.out.print(i+" ");
            }
        }
        System.out.println("");
        boolean check =true;
        for(int i =0; i<members; i++){
            if(member[i] ==0){
                System.out.print(i+" ");
                check = false;
            }
        }
        if(check){
            System.out.print("Everyone recieve the gifts");
        }   
    }
}
