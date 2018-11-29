package structural.decorate;

public class ScrollBarDecorator extends ComponentDecorator {

	public ScrollBarDecorator(Component component) {
		super(component);
	}

	@Override
	public void display() {
		super.display();
		this.setScrollBar();
	}
	 public  void setScrollBar()
     {
            System.out.println("为"+component+"增加滚动条！");
     }
}
