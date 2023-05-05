package skillTest2;

public class breakNumberUnique {

	public static void printCombination(int n){
		partition(n, n, "");
	}

    public static void partition(int n, int max, String prefix) {
        if (n == 0) {
            System.out.println(prefix);
            return;
        }

        for (int i = Math.min(max, n); i >= 1; i--) {
            partition(n-i, i, i + " " + prefix );
        }
    }
}
