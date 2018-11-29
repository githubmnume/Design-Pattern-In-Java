package behavior.state.demo;

public class Switch {
	StateContext stateContext;
	
	public Switch(StateContext stateContext) {
		super();
		this.stateContext = stateContext;
	}
	
	public void on() {
		stateContext.doAction();
	}
	public void off() {
		stateContext.doAction();
	}

}
