package structural.bridge;

public class Windows extends AbstractOS {

	public Windows(Standard standard) {
		super(standard);
	}

	@Override
	public void work() {
		System.out.print("Windows ");
		standard.play();
	}



}
