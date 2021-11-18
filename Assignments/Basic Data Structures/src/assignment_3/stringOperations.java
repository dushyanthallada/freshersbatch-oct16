package assignment_3;

public class stringOperations {

	public static void main(String[] args) {
        String str = new String("JavaString pool refers to collection of Strings which are stored in heap memory");
		
		String s1 = str.toLowerCase();
		System.out.println(s1);
		
		String s2 = str.toUpperCase();
		System.out.println(s2);
		
		String s3 = str.replace('a','$');
		System.out.println(s3);
		
		if(str.contains("collections"))
			System.out.println("Contains");
		else
			System.out.println("Does not contain");
		
		String str2 = new String("JavaString pool refers to collection of Strings which are stored in heap memory");
		if(str.contentEquals(str2))
			System.out.println("The content matches");
		else
			System.out.println("The content does not match");

	}

}
