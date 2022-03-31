import java.util.Scanner;
public class test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int papaya = sc.nextInt();
        int[] result = new int [papaya];
        int ripe=0;
        int unripe =0;
        int medium =0;
        if(papaya == 0){
            System.out.print("There is no papaya!");
            
        }else{
            for(int i=0; i<papaya; i++){
                result[i] = sc.nextInt();
                if(result[i] == 0){
                    unripe++;
                }
                if(result[i] == 1){
                    medium++;
    
                }
                if(result[i] ==2){
                    ripe++;
    
                }
            }
            if(unripe>0){
                if(unripe ==1){
                    System.out.println("There is "+unripe+" unripe papaya");
                }else{
                    System.out.println("There are "+unripe+" unripe papayas");
                }
            }
            if(medium>0){
                if(medium ==1){
                    System.out.println("There is "+medium+" medium papaya");
                }else{
                    System.out.println("There are "+medium+" medium papayas");
                }
            }
            if(ripe>0){
                if(ripe ==1){
                    System.out.println("There is "+ripe+" ripe papaya");
                }else{
                    System.out.println("There are "+ripe+" ripe papayas");
                }
            }
        }

    }

    
}
