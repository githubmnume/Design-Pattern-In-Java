package prototype;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Prototype implements Cloneable {
	public Prototype clone(){
		Prototype prototype = null;
		try{
			prototype = (Prototype)super.clone();
		}catch(CloneNotSupportedException e){
			e.printStackTrace();
		}
		return prototype; 
	}
}
 
class ConcretePrototype extends Prototype{
	private String testAttr;
	public void show(){
		Iterator<String> iterator = aList.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		System.out.println();
		
		Iterator<Domain> iterator2 = domainList.iterator();
		while (iterator2.hasNext()) {
			Domain domain = (Domain) iterator2.next();
			System.out.print(domain);
		}
		System.out.println("原型模式实现类 " +testAttr);
		System.out.println("原型模式实现类 " +testAttr);
	}
	public String getTestAttr() {
		return testAttr;
	}
	public void setTestAttr(String testAttr) {
		this.testAttr = testAttr;
	}
	public List<String> aList=new ArrayList<>();
	public List<Domain> domainList=new ArrayList<>();
	
}
 
class Domain {
	String name;
	String ID;
	public Domain(String name, String iD) {
		super();
		this.name = name;
		ID = iD;
	}
	@Override
	public String toString() {
		return String.format("Domain [name=%s, ID=%s]", name, ID);
	}
}
public class Client {
	public static void main(String[] args){
		ConcretePrototype cp = new ConcretePrototype();
		cp.setTestAttr("testAttr");
		for(int i=0; i< 10; i++){
			cp.aList.add(" list item " + i);
			cp.domainList.add(new Domain("name ", ""+i));
			ConcretePrototype clonecp = (ConcretePrototype)cp.clone();
			clonecp.show();
		}
	}
}