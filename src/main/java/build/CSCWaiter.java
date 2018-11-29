package build;

public class CSCWaiter implements Waiter{

	@Override
	public Food supply(Builder builder) {
		return builder.getFood();
	}

}
