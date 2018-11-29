package behavior.state.demo;

public class OffState implements State {

	@Override
	public void doAction(StateContext stateContext) {
		System.out.println("Switch OFF");
		stateContext.setState(new OnState());
	}

}
