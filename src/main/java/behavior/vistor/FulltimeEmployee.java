package behavior.vistor;

public class FulltimeEmployee extends AbstractEmployee {

	public FulltimeEmployee(String name, double weeklyWage, int workTime) {
		super(name, weeklyWage, workTime);
	}

	@Override
	public int getBaseSalary() {
		return 5000;
	}

	@Override
	public int setSalary(int sa) {
		// TODO Auto-generated method stub
		return 0;
	}


}
