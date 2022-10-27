
class PayrollTest extends Payroll {
	public static void main(String[] args) {
		Organisation org = new Organisation();
		Employee e1 = new Department(2,2,2);
		Employee e2 = new Department(3,3,3);
		Department dev = new Department(2,2,2);
		dev.join(e1);
		dev.join(e2);
		dev.relieve(e2);
		Employee e3 = new Department(4,4,4);
		Department hr = new Department(1,1,1);
		hr.join(e3);
		Employee e4 = new Department(7,7,7);
		Department qa = new Department(1,1,1);
		qa.join(e4);
		org.addDepartment(dev);
		org.addDepartment(hr);
		org.addDepartment(qa);
		printSalarySlip(org);
	}
}
