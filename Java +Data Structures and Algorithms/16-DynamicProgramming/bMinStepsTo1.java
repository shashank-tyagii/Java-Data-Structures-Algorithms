package gDynamicProgramming;

public class bMinStepsTo1 {

	public static int countMinStepsToOne(int n) {
		
		int[] storage = new int[n + 3];
		storage[0] = 0;
		storage[1] = 0;
		storage[2] = 1;
		storage[3] = 1;

		for (int i = 4; i <= n; i++) {
			int min1 = Integer.MAX_VALUE;
			int min2 = Integer.MAX_VALUE;
			int min3 = Integer.MAX_VALUE;

			min1 = 1 + storage[i - 1];
			if (i % 2 == 0) {
				int x = i/2;
				min2 = 1 + storage[x];
			}
			if (i % 3 == 0) {
				int x = i / 3;
				min3 = 1 + storage[x];
			}

			storage[i] = Math.min(min1, Math.min(min2, min3));

		}

		return storage[n];
	}
	
}
