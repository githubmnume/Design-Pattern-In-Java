package structural.facade;

public class ShunXingService extends AbstractFacadeService {

	@Override
	public void service() {
		setTea(new LongjingTea());
		setWater(new BoilingWater());
		setTeaset(new Boccaro());
		super.service();
		System.out.println("老顺兴茶馆备好茶了");
	}
}
