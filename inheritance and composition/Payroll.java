import java.util.ArrayList;
import java.util.List;

public class Payroll{
	
	/**
	 * Calculates tax.
	 * @param double salary storing the amount an employee earns per annum
	 * @return tax calculated
	 */
	public static double taxCalc(double salary) {
		double tax = 0;
		
		if(salary >= 250000) {
			if(salary < 500000) {
				tax += (salary - 250000) * 5/100;
			}
			else {
				tax += (500000 - 250000) * 5/100;
			}
		}
		
		if(salary >= 500000) {
			if(salary < 750000) {
				tax += (salary - 500000) * 10/100;
			}
			else {
				tax += (750000 - 500000) * 10/100;
			}
		}
		
		if(salary >= 750000) {
			if(salary < 1000000) {
				tax += (salary - 750000) * 15/100;
			}
			else {
				tax += (1000000 - 750000) * 15/100;
			}
		}
		
		if(salary >= 1000000) {
			if(salary < 1250000) {
				tax += (salary - 1000000) * 20/100;
			}
			else {
				tax += (1250000 - 1000000) * 20/100;
			}
		}
		
		if(salary >= 1250000) {
			if(salary < 1500000) {
				tax += (salary - 1250000) * 25/100;
			}
			else {
				tax += (1500000 - 1250000) * 25/100;
			}
		}
		
		if(salary >= 1500000) {
				tax += (salary - 1500000) * 30/100;
		}
		
		return tax;
	}
	
	/**
	 * Prints the salary slip of the employee.
	 * @param Object of class organization
	 */
	public static void printSalarySlip(Organisation org) {
		List<Employee> itr = new ArrayList<Employee>();
		itr = org.getAllEmployees();
		
		double hra, pf, bs, bonus, comp;
		
		for(int i = 0; i < itr.size(); i++) {
			bonus = itr.get(i).getBonus();
			bs = itr.get(i).getBasicSalary();
			comp = itr.get(i).getCompensation();

			hra = bs * 10/100;
			pf = bs * 12/100;
			
			
			System.out.println("Basic Salary: " + bs);
			System.out.println("Bonus: " + bonus);
			System.out.println("Compensation: " + comp);
			System.out.println("HRA: " + hra);
			System.out.println("PF: " + pf);
			System.out.println("Tax: " + taxCalc(bs + bonus));
			System.out.println();
			System.out.println("---------------------------------------------");
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Organisation org = new Organisation();
		
		Department dev = new Department();
		Department hr = new Department();
		Department qa = new Department();
		Department admin = new Department();
		
		Employee e1 = new Department( 1200000 , 50000, 1000);
		Employee e2 = new Department( 500000, 25000, 400);
		Employee e3 = new Department(1450000, 40000, 500);
		Employee e4 = new Department( 700000, 12500, 2500);
		Employee e5 = new Department(1100000, 12000, 1500);
		Employee e6 = new Department( 900000, 10000, 1800);
		Employee e7 = new Department(1050000, 22000, 2500);
		Employee e8 = new Department( 110000, 20000, 1000);
		Employee e9 = new Department( 2000000, 24000, 4500);
		Employee e10 = new Department( 2000000, 24000, 4500);
		Employee e11 = new Department( 2000000, 24000, 4500);
		
		dev.join(e1);
		dev.join(e2);
		dev.relieve(e2);
		dev.join(e5);
		dev.join(e7);
		hr.join(e3);
		hr.join(e6);
		hr.join(e8);
		qa.join(e4);
		qa.join(e9);
		admin.join(e10);
		admin.join(e11);
		
		org.addDepartment(dev);
		org.addDepartment(hr);
		org.addDepartment(qa);
		org.addDepartment(admin);
		
		printSalarySlip(org);
	}
}