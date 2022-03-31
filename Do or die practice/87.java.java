import java.util.Scanner;
class Main84{
 	static long sum_of_digit(long n)
    {
        if (n == 0)
            return 0;
        return (n % 10 + sum_of_digit(n / 10));
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
      	long num = sc.nextLong();
        long result = sum_of_digit(num);
        System.out.println(result);
    }
}