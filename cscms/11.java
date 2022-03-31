import java.util.Scanner;
class Main11{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        for(int i =0 ; i<n; i++){
            for(int j= 0; j<n-1-i; j++){//ข้างหน้า *
                System.out.print("-");
            }
            for(int j =0; j<n; j++){//ใส้ใน *
                if(i==0 ||i == n-1){
                    System.out.print('*');
                }else if (j ==0 || j==n-1){
                    System.out.print('*');
                }else{
                    System.out.print("-");
                }
            }
            for(int j = 0; j<i; j++){//ข้างหลังดอกจัน
                if(j == i-1){
                    System.out.print('*');
                }else{
                    System.out.print("-");
                }
            }
            System.out.println();
        }for(int i= 0; i<n-1; i++){ 
            for(int j =0; j<n; j++){
                if(i == n-2){
                    System.out.print('*');
                }else if(j == 0 || j == n-1){
                    System.out.print('*');
                }else{
                    System.out.print("-");
                }
            }
            for(int j = 0; j < n-i-2; j++){
                if(j == n-i-3){
                    System.out.print('*');
                }else{
                    System.out.print("-");
                }
            }
            System.out.println();
        }  
    }
}
