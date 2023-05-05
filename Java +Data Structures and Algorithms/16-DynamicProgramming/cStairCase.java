package gDynamicProgramming;

public class cStairCase {

	public static long staircase(int n) {
		
		int[] ways = new int[n + 1]; // DP array

		if (n == 0)
			return 1;

		if (n == 1 || n == 2)
			return n;

		ways[0] = 1;
		ways[1] = 1;
		ways[2] = 2;

		for (int i = 3; i <= n; i++)
			ways[i] = ways[i - 1] + ways[i - 2] + ways[i - 3];

		return ways[n];
	}
	
}
