package gArrayList;
import java.util.*;
public class aArrayList {

	public static void main(String[] args) {
		// Declaring the ArrayList without mentioned its size
        ArrayList<Integer> arrli = new ArrayList<>(); 
 
        // Appending new elements at 
        // the end of the list 
        for (int i = 1; i <= 9; i++) 
            arrli.add(i); 
 
        // Printing elements 
        System.out.println(arrli); 
 
        // Remove element at index 3 
        arrli.remove(3); 
 
        // Displaying the ArrayList 
        // after deletion 
        System.out.println(arrli); 
 
        // Printing elements one by one 
        for (int i = 0; i < arrli.size(); i++) 
            System.out.print(arrli.get(i) + " "); 
    } 
	}

