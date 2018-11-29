package structural.decorate;

public class BorderDecorator extends ComponentDecorator {

	public BorderDecorator(Component component) {
		super(component);
	}
	@Override
	public void display() {
		super.display();
		this.setBlackBorder();
	}
	
	 public  void setBlackBorder()
     {
            System.out.println(String.format("BorderDecorator 为 [component=%s] 增加[color=%s , shape=%s]边框！", component, color,shape));
     }
	
	@Override
	public String toString() {
		return String.format("BorderDecorator [component=%s, color=%s]", component, color);
	}
	@Override
	protected void setShape(Shape shape) {
		super.setShape(shape);
	}
	@Override
	protected void setColor(Color color) {
		super.setColor(color);
	}
}
