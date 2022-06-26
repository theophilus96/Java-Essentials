import java.util.ArrayList;

public class fibmemo {
    public static void main(String[] args) {
        int[] arr = new int[100]; 
        System.out.println(fib0(6, arr));
    }

    public static int fib0(int n, int[] arr) {
        int result;
        if (arr[n] != 0){
           return arr[n];
        }
        
        if (n == 1 || n == 2) {
            result = 1;
        } else {
            result = fib0(n - 1, arr) + fib0(n - 2, arr);
        }
        arr[n]=result;
        return result;
    }
}
