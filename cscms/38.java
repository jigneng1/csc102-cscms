
import java.util.Scanner;

import java.util.TreeSet;
class Main38 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        TreeSet<Integer> nums =new TreeSet<Integer>(); 
        for(int i=0; i<n; i++){
            num[i]=sc.nextInt();
            nums.add(num[i]);
        }
        for(Integer value:nums){
            for(int j=0; j<num.length; j++){
                if(value==num[j]){
                    System.out.print(j+1+" ");
                }
            }
        }
        }
}
