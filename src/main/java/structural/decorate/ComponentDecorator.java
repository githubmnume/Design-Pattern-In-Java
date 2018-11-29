package structural.decorate;

public class ComponentDecorator implements Component {

	protected Component component;
	protected Shape shape;
	protected Color color;
	
	
	public ComponentDecorator(Component component) {
		super();
		this.component = component;
	}


	@Override
	public void display() {
		component.display();
	}


	protected Shape getShape() {
		return shape;
	}


	protected void setShape(Shape shape) {
		this.shape = shape;
	}


	protected Color getColor() {
		return color;
	}


	protected void setColor(Color color) {
		this.color = color;
	}

}
