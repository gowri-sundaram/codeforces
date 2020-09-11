package numberTheory;

/**
 * Uses the Euclidean algorithm to find the GCD of 2 non negative numbers.
 * Problems:
 *      https://codeforces.com/contest/1407/problem/B
 */
public class Gcd {
    public static long evaluate(long a, long b) {
        if (a == b) {
            return a;
        }
        long min = Math.min(a, b);
        long max = Math.max(a, b);
        if (min == 0) {
            return max;
        }
        return evaluate(max % min, min);
    }
}
