// Count number of words
package iStrings;
public class aCountWords {

	public static int countWords(String str) {	
		if (str == ""){
            return 0;
        }
        
        String[] words = str.split(" ");
		return words.length;
		
		/*
		 if (str == ""){
            return 0;
        }
        int count = 0;
        for (int i =0; i< str.length(); i++){
        if (str.charAt[i] ==' '){
        count++
        }
        }
        return ++count;
		 */
	}	
	public static void main(String[] args) {
		String str = "My name is Shashank Tyagi";
		System.out.println(countWords(str));
		//printString(str);

	}
	public static void printString(String str) {
		for (int i =0; i < str.length(); i++) {
			System.out.print(str.charAt(i)+ " ");
		}
	}

}
