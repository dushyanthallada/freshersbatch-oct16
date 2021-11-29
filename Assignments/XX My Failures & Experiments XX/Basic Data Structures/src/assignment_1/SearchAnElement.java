package assignment_1;
import java.util.Scanner;
public class SearchAnElement {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int[] num = {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		System.out.println("Enter a number to search: ");
		int toFind= s.nextInt();
	  
	    boolean found = false;

	    for (int n : num) {
	      if (n == toFind) {
	        found = true;
	        break;
	      }
	    }
	    
	    if(found)
	      System.out.println(toFind + " is found.");
	    else
	      System.out.println(toFind + " is not found.");
	    s.close();
	}

}
