package behavior.vistor.mine;

public abstract class AbstractEmployee implements Employee {

	private int workHours;
	private int workPrice;
	@Override
	public void work() {
		System.out.println(this.getClass().getSimpleName()+" work");
	}
	public int getWorkHours() {
		return workHours;
	}
	public void setWorkHours(int workHours) {
		this.workHours = workHours;
	}
	public int getWorkPrice() {
		return workPrice;
	}
	public void setWorkPrice(int workPrice) {
		this.workPrice = workPrice;
	}
	@Override
	public String toString() {
		return this.getClass().getSimpleName()+ " 工作时长 ：" +this.getWorkHours() +"\n" +"结算工资 ：" +this.getWorkPrice();
	}
}
