package behavior.vistor.mine;

import java.util.List;

public class HRDept implements Department {

	@Override
	public void excute(List<Employee> employees) {
		System.out.println("人力资源部在工作");
		//计算工时
		/*for (AbstractEmployee abstractEmployee : employees) {
			abstractEmployee.setWorkHours(42);
		}*/
	}

}
