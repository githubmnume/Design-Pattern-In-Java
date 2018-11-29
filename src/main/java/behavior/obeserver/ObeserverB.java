package behavior.obeserver;

public class ObeserverB implements Observer {

	@Override
	public void update() {
		System.out.println("ObeserverB updated");
	}

}
