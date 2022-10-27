import java.util.*;

public class Departments implements Employee{

	private double basicSalary;
	private double bonus;
	private double compensation;
	public List<Employee> emp = new ArrayList();
	
	Departments(double salary, double bon, double comp) {
		basicSalary = salary;
		bonus = bon;
		compensation = comp;
	}
	
	@Override
	public double getBasicSalary() {
		return basicSalary;
	}
	
	@Override
	public double getBonus() {
		return bonus;
	}

	@Override
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