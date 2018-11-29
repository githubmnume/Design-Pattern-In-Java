package behavior.vistor;

public class HRDept implements Department {

	@Override
	public void visit(Employee employee) {
		System.out.println("工作时间 " + ((AbstractEmployee)employee).getWorkTime());
		//具体算法 这个可以策略吗？哈哈哈
	}

	@Override
	public void salaryCaculated(Employee ee) {
		// TODO Auto-generated method stub
		ee.setSalary(ee.getBaseSalary()+200);	
}

}
