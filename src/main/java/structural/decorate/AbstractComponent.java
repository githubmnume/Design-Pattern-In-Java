package structural.decorate;

public class AbstractComponent implements Component {

	protected String name;
	protected Color color;
	protected Shape shape;
	
	public AbstractComponent(String name) {
		super();
		this.name = name;
	}

	
	protected String getName() {
		return name;
	}


	protected void setName(String name) {
		this.name = name;
	}


	protected Color getColor() {
		return color;
	}


	protected void setColor(Color color) {
		this.color = color;
	}


	protected Shape getShape() {
		return shape;
	}


	protected void setShape(Shape shape) {
		this.shape = shape;
	}


	@Override
	public void display() {
//		 System.out.println(this.toString());
	}

	@Override
	public String toString() {
		return String.format(" Default AbstractComponent [name=%s, color=%s, shape=%s]", name, color, shape);
	}

}
