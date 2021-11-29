package assignment_1;

public class TotalAvgMarks {

	public static void main(String[] args) {
		int n=3,avg=0;
	    int a[]=new int[n];
	    a[0]=10;
	      a[1]=20;
	 a[2]=30;
	    for(int i=0;i<n;i++)
	    avg=avg+a[i];
	    System.out.println("average of  ("+a[0]+","+a[1]+","+a[2]+")  is ="+ avg/n);
	}

}
