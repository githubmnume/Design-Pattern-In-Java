package build;

public class FoodSource implements FoodBuilder {
	
	private String food="";
	
	private ChineseFood chineseFood=new ChineseFood();
	private WesternFood westernFood=new WesternFood();
	
	@Override
	public ChineseFoodBuilder addRice() {
		// TODO Auto-generated method stub
		food=food+"Rice "; 
		chineseFood.setRice("东北珍珠米");
		return this;
	}

	@Override
	public ChineseFoodBuilder addWater() {
		// TODO Auto-generated method stub
		food=food+"water ";
		chineseFood.setWater("百岁山");
		return this;
	}

	@Override
	public ChineseFoodBuilder addSalt() {
		food=food+"Salt ";
		chineseFood.setSalt("少盐");
		return this;
	}

	@Override
	public ChineseFoodBuilder addVeg() {
		food=food+"veg ";
		chineseFood.setVeg("时蔬");
		return this;
	}

	@Override
	public ChineseFoodBuilder addOthers() {
		food=food+"others ";
		chineseFood.setOthers("不要葱");
		return this;
	}

	@Override
	public Food getFood() {/*

		String buildName=this.getClass().getName();
		
		return new Food() {
			
			 * (non-Javadoc)
			 * @see java.lang.Object#toString()
			 
			public String toString() {
				return buildName+"{"+food+"}";
			}
		};
	*/
		
	return westernFood;
	
	
	}

	@Override
	public WesternFoodBuilder addChicken() {
		food=food+"chicken  ";
		westernFood.setChicken("鸡肉");
		return this;
	}

	@Override
	public WesternFoodBuilder addBreff() {
		food=food+"beff ";
		westernFood.setBreff("牛肉");
		return this;
	}

	@Override
	public WesternFoodBuilder addVegs() {
		food=food+"vegs ";
		westernFood.setVegs("蔬菜");
		return this;
	}

	@Override
	public WesternFoodBuilder addSauce() {
		food=food+"sauce ";
		westernFood.setSauce("番茄酱");
		return this;
	}

	@Override
	public WesternFoodBuilder addSoup() {
		food=food+"Soup ";
		westernFood.setSoup("配汤");
		return this;
	}

}
