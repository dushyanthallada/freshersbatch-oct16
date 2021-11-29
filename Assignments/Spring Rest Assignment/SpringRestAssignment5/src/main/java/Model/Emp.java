package Model;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
@Document(collection="Employee")
public class Emp {
	@Id
	private int id;
	@Field
	private  String Ename;
	@Field
	private String Dept;
	@Field
	private String Job;
	@Field
	private int Sal;
	

	public Emp(int id, String Ename, String Dept, String Job, int Sal) {
		
		super();
		this.id = id;
		this.Ename = Ename;
		this.Dept = Dept;
		this.Job = Job;
		this.Sal = Sal;
	}
	
	public int getId() {
		return id;
	}
	public String getEname() {
		return Ename;
	}
	public String getDept() {
		return Dept;
	}
	public String getJob() {
		return Job;
	}
	public int getSalary() {
		return Sal;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", EmployeeName=" + Ename + ", EmployeeDept=" + Dept
				+ ", EmployeeDesg=" + Job + ", Salary=" + Sal + "]";
	}
	
}