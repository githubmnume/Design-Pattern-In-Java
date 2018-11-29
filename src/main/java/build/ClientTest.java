package build;

/**
 * test client
 * @author zhouufen
 *
 */
public class ClientTest {
	public void testBuilder() {
		
		/*//乡村基
		ChineseFoodBuilder builder=new CSC();
		//点餐
		builder.addOthers().addRice().addVeg().addWater();
		
		//服务员
		Waiter waiter=new CSCWaiter();
		//供餐
		Food food = waiter.supply(builder);
		System.out.println(food);*/
		
		/*WesternFoodBuilder wBuilder=new FoodSource();
		wBuilder.addBreff().addBreff().addSoup().addVegs();
		
		Waiter waiter=new CSCWaiter();
		Food wfood = waiter.supply(wBuilder);
		System.out.println(wfood);*/
		
		/*ChineseFoodBuilder chineseFoodBuilder=new FoodSource();
		chineseFoodBuilder.addRice().addSalt().addVeg().addWater().addOthers();
		Waiter waiter=new CSCWaiter();
		Food wfood = waiter.supply(chineseFoodBuilder);
		System.out.println(wfood);*/
		
		WesternFoodBuilder westernFoodBuilder=new FoodSource();
		westernFoodBuilder.addBreff().addSauce().addSoup().addVegs();
		Waiter waiter= new CSCWaiter();
		Food supply = waiter.supply(westernFoodBuilder);
		System.out.println(supply);
		
	}
	public static void main(String[] args) {
		new ClientTest().testBuilder();
	}
}
