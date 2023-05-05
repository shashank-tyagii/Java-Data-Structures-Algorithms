package skillTest1;

public class printPattern {

	public static void printPattern(int si, int ei, int rows){

		if (rows <=0) {
			return;
		}
		if (rows >=1) {
			for (int i =si; i <=ei; i++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		printPattern(ei+ei-si + 2, ei+ei-si + 2 + ei-si , rows-2);
		
		if (rows >=2) {
			for (int i =ei+1; i <=ei + ei -si +1; i++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}

	}
	
	
	
	
	public static void main(String[] args) {
		printPattern(1,5, 5);
	}
}
