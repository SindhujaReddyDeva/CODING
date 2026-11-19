import java.util.Scanner;
public class SumofEven9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n = sc.nextInt();

        int sum = 0;
        int pos = 1;

        while (n > 0) {
            int digit = n % 10;

            if (pos % 2 == 0) {
                sum = sum + digit;
            }

            pos++;
            n = n / 10;
        }

        System.out.println("Sum = " + sum);
    }
}
