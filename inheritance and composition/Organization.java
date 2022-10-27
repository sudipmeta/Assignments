import java.util.*;

public class Organization{
	private List<Departments> dep = new ArrayList();
	private List<Employee> allEmployees = new ArrayList();
	
	public boolean addDepartment(Departments d) {
		return dep.add(d);
	}
	
	public List<Employee> getAllEmployees() {
		for(int i = 0; i < dep.size(); i++) {
			allEmployees.addAll(dep.get(i).getEmployees());
		}
		
		return allEmployees;
	}
}