package behavior.obeserver;

public class APP {
	public static void main(String[] args) {

		Context subjectContext = new Context();
		subjectContext.setSubjectStrategy(new MediumPRI());

		Subject subject = new Concierge(subjectContext);
		subject.attach(new ObeserverA());
		subject.attach(new ObeserverB());
		subject.attach(new ObeserverC());
		subject.notifys();
		subjectContext.setSubjectStrategy(new LowPRI());
		subject.attach(new ObeserverA());
		subject.attach(null);
		subject.notifys();
		subjectContext.setSubjectStrategy(new MajorPRI());
		subject.notifys();
	}

}
