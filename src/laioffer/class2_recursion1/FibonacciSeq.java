package laioffer.class2_recursion1;

/**
 * Created by guangshuo on 3/14/17.
 * F(0) = 0, F(1) = 1;
 * F(N) = F(N-1) + F(N-2)
 */
public class FibonacciSeq {
    public int fibonacci(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

}
