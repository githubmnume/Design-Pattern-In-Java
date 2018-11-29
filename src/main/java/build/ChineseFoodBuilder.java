package build;

public interface ChineseFoodBuilder extends Builder {
	public ChineseFoodBuilder addRice();
	public ChineseFoodBuilder addWater();
	public ChineseFoodBuilder addSalt();
	public ChineseFoodBuilder addVeg();
	public ChineseFoodBuilder addOthers();
}
