public class factorial {
    public static int calculateFactorial (int n) {
        int f = 1;

        for (int i=1; i<=n; i++) {
            f = f * i;
        }
        return f;
    }
    public static void main(String[] args) {
        int n = 4;

        System.out.println("Factorial of 4: "+calculateFactorial(n));
    }
}
