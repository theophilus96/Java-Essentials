import javax.naming.spi.DirStateFactory.Result;

public class fib1 {
    public static void main(String[] args) {
        System.out.println(fib0(50));

    }

    public static int fib0(int n) {
        int result;
        if (n == 1 || n == 2) {
            result = 1;
        } else {
            result = fib0(n - 1) + fib0(n - 2);
        }
        return result;
    }
}
