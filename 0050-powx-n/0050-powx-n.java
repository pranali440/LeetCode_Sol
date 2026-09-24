class Solution {
    public double myPow(double x, int n) {
        long N = n;              // use long: -Integer.MIN_VALUE overflows int
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }

        double result = 1.0;
        while (N > 0) {
            if ((N & 1) == 1) {  // current bit is set, include this power of x
                result *= x;
            }
            x *= x;              // x -> x^2 -> x^4 -> ...
            N >>= 1;             // move to the next bit
        }
        return result;
    }
}