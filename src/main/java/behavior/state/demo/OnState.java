package behavior.state.demo;

public class OnState implements State {

	@Override
	public void doAction(StateContext stateContext) {
		System.out.println("Switch ON");
		stateContext.setState(new OffState());
	}

}
