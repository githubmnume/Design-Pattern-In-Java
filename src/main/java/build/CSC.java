package build;

public class CSC implements ChineseFoodBuilder {

	private ChineseFood food=new ChineseFood();
	@Override
	public Food getFood() {
		return food;
	}

	@Override
	public ChineseFoodBuilder addRice() {
		// TODO Auto-generated method stub
		food.setRice("rice");
		return this;
	}

	@Override
	public ChineseFoodBuilder addWater() {
		food.setWater("water");
		return this;
	}

	@Override
	public ChineseFoodBuilder addSalt() {
		food.setSalt("Salt");
		return this;
	}

	@Override
	public ChineseFoodBuilder addVeg() {
		food.setVeg("veg");
		return this;
	}

	@Override
	public ChineseFoodBuilder addOthers() {
		food.setOthers("others");
		return this;
	}

}
