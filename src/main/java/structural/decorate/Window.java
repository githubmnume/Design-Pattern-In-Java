package structural.decorate;

public class Window implements Component{
	private String name;
	
	
	public Window() {
		super();
	}

	public Window(String name) {
		super();
		this.name = name;
	}

	@Override
	public void display() {
		this.toString();
	}

	@Override
	public String toString() {
		return String.format(" Window [name=%s] ", name);
	}
}
