import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class PayrollTest {

	@Test
	void payrollTest() {
		Organisation org = new Organisation();
		Department dev = new Department();
		Employee e1 = new Department(1200000 , 50000, 1000);
		List<Employee> l = new ArrayList<Employee>();
		l.add(e1);
		assertEquals(true,dev.join(e1));
		assertEquals(true,org.addDepartment(dev));
		assertEquals((double)1200000,e1.getBasicSalary());
		assertEquals((double)50000,e1.getBonus());		
		assertEquals((double)1000,e1.getCompensation());
		assertEquals(l,org.getAllEmployees());
		assertEquals(true,dev.relieve(e1));
		l.remove(e1);
	}

}