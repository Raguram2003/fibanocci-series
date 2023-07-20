public class FibonacciSeries {
    public static void main(String[] args) {
        int N = 10;
        for (int i = 0; i < N; i++) {
            System.out.print(findfib(i) + " ");
        }
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
