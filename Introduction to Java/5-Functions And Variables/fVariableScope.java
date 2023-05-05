// Scope of a variable

package fFunctionsAndVariables;

public class fVariableScope {

	public static int func(int a){
	    a += 10;
	    return a;
	}

	public static void main(String[] args) {
	    int a = 5;
	    func(a);                 // Will not change as we are not updating the value of a 
	    System.out.println(a);
	}

}
