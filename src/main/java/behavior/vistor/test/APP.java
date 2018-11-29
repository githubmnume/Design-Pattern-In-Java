package behavior.vistor.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import behavior.vistor.mine.AbstractEmployee;
import behavior.vistor.mine.Department;
import behavior.vistor.mine.FTEmployee;
import behavior.vistor.mine.FinanceDept;
import behavior.vistor.mine.HRDept;
import behavior.vistor.mine.PTEmployee;

public class APP {

	public static void main(String[] args) {

		List<AbstractEmployee> employees = new ArrayList<>();

		AbstractEmployee employee = new FTEmployee();
		employee.work();
		employee.setWorkHours(45);
		employee.setWorkPrice(5000);

		AbstractEmployee employee2 = new PTEmployee();
		employee2.work();
		employee2.setWorkHours(8);

		employees.add(employee);
		employees.add(employee2);

//		Department department = new FinanceDept();
//		department.excute(employees);
//
//		Department department2 = new HRDept();
//		department2.excute(employees);

		for (AbstractEmployee abstractEmployee : employees) {
			System.out.println(abstractEmployee);
		}
	}
}
