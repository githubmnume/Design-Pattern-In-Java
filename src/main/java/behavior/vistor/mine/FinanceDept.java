package behavior.vistor.mine;

import java.util.List;

public class FinanceDept implements Department {

	@Override
	public void excute(List<Employee> employees) {
		System.out.println("财务部在工作");
		//计算工资
//		for (Employee abstractEmployee : employees) {
//			if (abstractEmployee instanceof FTEmployee) {
//				int workHours = ((FTEmployee)abstractEmployee).getWorkHours();
//				abstractEmployee.setWorkPrice(workHours<40?abstractEmployee.getWorkPrice()-(40-workHours)*80:abstractEmployee.getWorkPrice()+(workHours-40)*100);
//			}
//			else if (abstractEmployee instanceof PTEmployee) {
//				int workHours = abstractEmployee.getWorkHours();
//				abstractEmployee.setWorkPrice(abstractEmployee.getWorkHours()*20);
//			}
//			else {
//				System.out.println("暂时不支持");
//			}
//		}
	}

}
