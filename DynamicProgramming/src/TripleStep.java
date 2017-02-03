import java.util.Arrays;

/**
 * Brute Force Method
 * Memoization Method
 *
 */

class TripleStep {

	public static void main(String[] args) {
		System.out.println("Hello");
		int n = 36;
        //System.out.println(btCountWays(n));
        System.out.println(countWays(n));
    }

	public static int btCountWays(int n) {
	    if (n <= 0) {
            return 0;
        }else if (n == 1) {
            return 1;
        }else if (n == 2) {
            return 2;
        }else if (n == 3) {
            return 4;
        }else {
	        return btCountWays(n-1) + btCountWays(n-2) + btCountWays(n-3);
        }

    }

    public static int countWays(int n) {
	    int[] memo = new int[n + 1];
        Arrays.fill(memo, -1);
        return countWays(n, memo);
    }

    public static int countWays(int n, int[] memo) {
        if (n <= 0) {
            return 0;
        }else if (n == 1) {
            return 1;
        }else if (n == 2) {
            return 2;
        }else if (n == 3) {
            return 4;
        }else {
            if (memo[n] == -1) {
                memo[n] = countWays(n - 1, memo) + countWays(n - 2, memo) + countWays(n - 3, memo);
            }
            return memo[n];
        }
    }
}