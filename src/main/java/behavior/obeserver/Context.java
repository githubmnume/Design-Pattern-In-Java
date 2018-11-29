package behavior.obeserver;

import java.util.List;

public class Context {
	private Strategy strategy;

	
	protected Strategy getSubjectStrategy() {
		return strategy;
	}


	protected void setSubjectStrategy(Strategy subjectStrategy) {
		this.strategy = subjectStrategy;
	}

	public void ContextStrategy(List<Observer> observers) {
		strategy.notifyExcute(observers);
	}
}
