package behavior.vistor;

public interface Employee {

	public void accept(Department department);
	public int  getBaseSalary();
	public int  setSalary(int sa);
}
