package gDynamicProgramming;
import java.util.HashMap;

public class fBytelandianCurrencyConversion {

	public static long bytelandian(long n, HashMap<Long, Long> dp) {
        // Write your code here
		if (n <= 1) return n;

        if (dp.get(n) != null) return dp.get(n);

        long breakDownValue = bytelandian(n / 2, dp) + bytelandian(n / 3, dp) + bytelandian(n / 4, dp);

        dp.put(n, Math.max(n, breakDownValue));

        return dp.get(n);
	}
}
