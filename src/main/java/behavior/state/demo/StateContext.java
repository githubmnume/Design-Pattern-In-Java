package behavior.state.demo;

public class StateContext {
	private State state;
	
	protected State getState() {
		return state;
	}

	protected void setState(State state) {
		this.state = state;
	}

	void doAction(){
		state.doAction(this);
	}

}
