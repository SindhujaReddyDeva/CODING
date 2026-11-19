public class PrimeNo10 {
    public static void main(String[] args) {

        for (int n = 1000; n <= 2000; n++) {
            int i;

            for (i = 2; i < n; i++) {
                if (n % i == 0) {
                    break;
                }
            }

            if (i == n) {
                System.out.print(n + " ");
            }
        }
    }
}
