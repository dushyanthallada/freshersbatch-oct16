package assignment_1;
import java.util.Scanner;
public class ResultOfStudent {

	public static void main(String[] args) {
	        Scanner s=new Scanner(System.in);
	        System.out.println("Enter First Subj-1  Marks :");
	        int subj1=s.nextInt();
	        System.out.println("Enter First Subj-2  Marks:");
	        int subj2=s.nextInt();
	        System.out.println("Enter First Subj-3  Marks:");
	        int subj3=s.nextInt();
	        if (subj1>=60&&subj2>=60&&subj3>=60) {
	            System.out.println("3 subjects are passsed");
	        }
	        else if (((subj1>=60&&subj2>=60)) ||  ((subj2>=60&&subj3>=60 )) || ((subj3>=60&&subj1>=60 ))) {
	            System.out.println("Promoted");
	        }
	        else if(subj1>60|| subj2 >60|| subj3>60 || (subj1<60&&subj2<60&&subj3<60)) {
	            System.out.println("Failed");
	        s.close();
	    }
	}

}
