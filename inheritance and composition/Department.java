import java.util.*;

public class Department extends Employee{

	private double basicSalary; 
	private double bonus;
	private double compensation;
	public List<Employee> emp = new ArrayList();
	
	Department(double salary, double bon, double comp) {
		basicSalary = salary;
		bonus = bon;
		compensation = comp;
	}
	
	public double getBasicSalary() {
		return basicSalary;
	}
	
	public double getBonus() { 
		return bonus;
	}

	public double getCompensation() {
		return compensation;
	}
	
	public boolean join(Employee e) {
		return emp.add(e);
	}
	
	public boolean relieve(Employee e) {
		return emp.remove(e);
	}
	
	List<Employee> getEmployees() {
		return emp;
	}
}
