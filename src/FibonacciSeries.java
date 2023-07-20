import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.print(findfib(N));

    }
    public static int findfib(int n)
    {
        if (n <= 1) {
            return n;
        }
        return findfib(n - 1)
                + findfib(n - 2);
    }
}
