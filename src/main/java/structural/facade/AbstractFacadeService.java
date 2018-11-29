package structural.facade;

public abstract class AbstractFacadeService implements FacadeService {
	
	private Water water;
	private Teaset teaset;
	private Tea tea;
	protected void setWater(Water water) {
		this.water = water;
	}
	protected void setTeaset(Teaset teaset) {
		this.teaset = teaset;
	}
	protected void setTea(Tea tea) {
		this.tea = tea;
	}
	@Override
	public void service() {
		water.work();
		teaset.work();
		tea.work();
	}
	
}
