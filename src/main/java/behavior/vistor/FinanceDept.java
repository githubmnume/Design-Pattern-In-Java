package behavior.vistor;

public class FinanceDept implements Department {

	@Override
	public void visit(Employee employee) {
		// 计算工资 这个需要策略了
		// TODO Auto-generated method stub
//		if (employee instanceof FulltimeEmployee) {
//			System.out.println("正式员工工资");
//		} else if (employee instanceof ParttimeEmployee) {
//			System.out.println("临时员工工资");
//		} else {
//			System.out.println("暂不支持");
//		}
		employee.accept(this);
	}

	@Override
	public void salaryCaculated(Employee ee) {
	}

	
	
}
