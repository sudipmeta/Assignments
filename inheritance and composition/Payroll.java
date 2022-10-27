import java.util.ArrayList;
import java.util.List;

public class Payroll{	
	public static void printSalarySlip(Organisation org) {
		
		List<Employee> itr = new ArrayList();
		itr = org.getAllEmployees();
		
		double da, hra, pf, fund, bs, grossSalary, netSalary, bonus, comp;
		
		for(int i = 0; i < itr.size(); i++) {
			bonus = itr.get(i).getBonus();
			bs = itr.get(i).getBasicSalary();
			comp = itr.get(i).getCompensation();
			
			da = bs * 97/100;
			hra = bs * 10/100;
			pf = bs * 12/100;
			fund = bs * 0.1/100;
			grossSalary = bs + da + hra;
			netSalary = grossSalary - (pf + fund);
			
			System.out.println("Bonus: " + bonus);
			System.out.println("DA: " + da);
			System.out.println("HRA: " + hra);
			System.out.println("PF: " + pf);
			System.out.println("Fund: " + fund);
			System.out.println("Gross Salary: " + grossSalary);
			System.out.println("Net Salary: " + netSalary + "\n");
		}
	}
	
	
}