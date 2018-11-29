package behavior.obeserver;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractSubject implements Subject {
	protected List<Observer> observers=new ArrayList<>();
	protected Context subjectContext;
	
	
	public AbstractSubject(Context subjectContext) {
		super();
		this.subjectContext = subjectContext;
	}

	protected Context getSubjectContext() {
		return subjectContext;
	}

	protected void setSubjectContext(Context subjectContext) {
		this.subjectContext = subjectContext;
	}

	@Override
	public void attach(Observer observer) {
		observers.add(observer);
		
	}

	@Override
	public void detach(Observer observer) {
		observers.remove(observer);
		
	}

	@Override
	public void notifys() {
		System.out.println("Subject "+this+ " notifys");
		subjectContext.ContextStrategy(observers);
		System.out.println();
	}

	@Override
	public String toString() {
		return String.format(this.getClass().getSimpleName());
	}
	
	
}
