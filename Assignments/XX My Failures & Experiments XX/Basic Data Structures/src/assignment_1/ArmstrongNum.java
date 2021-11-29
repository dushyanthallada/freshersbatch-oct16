package assignment_1;

public class ArmstrongNum {

	public static void main(String[] args) {
		 int number = 407, orgNumber, rem, result = 0;

	        orgNumber = number;

	        while (orgNumber != 0)
	        {
	            rem = orgNumber % 10;
	            result += Math.pow(rem, 3);
	            orgNumber /= 10;
	        }

	        if(result == number)
	            System.out.println(number + " is armstrong number.");
	        else
	            System.out.println(number + " is not armstrong number.");
	}

}
