package structural.decorate;

public class APP {
	public static void main(String[] args) {
		/*Component component = new Window("主窗体");
		Component sComponent=new ScrollBarDecorator(new BorderDecorator(component));
		sComponent.display();*/
		test();
	}
	private static void test() {
		TextAera textAera=new TextAera("留言板");
		textAera.setColor(new Red());
		textAera.setShape(new Rectangle());
		
		ComponentDecorator componentDecorator=new BorderDecorator(textAera);
		componentDecorator.setColor(new Blue());
		componentDecorator.setShape(new Circle());
		componentDecorator.display();
	}
}
