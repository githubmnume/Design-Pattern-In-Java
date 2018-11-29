package structural.facade.test;

import structural.facade.AbstractFacadeService;
import structural.facade.ShunXingService;

public class APP {

	public static void main(String[] args) {
		/*BoilingWater boilingWater=new BoilingWater();
		Teaset teaset=new Teaset();
		Tea tea=new Tea();
		
		boilingWater.work();
		teaset.work();
		tea.work();
		System.out.println("茶好了，喝茶");*/
		facadeService();
	}
	public  static void facadeService() {
		AbstractFacadeService facadeService=new ShunXingService();
		facadeService.service();
	}

}
