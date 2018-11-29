package behavior.state.demo;

public class NFState implements State {

	@Override
	public void doAction(StateContext stateContext) {
		System.out.println(" Switch NFState ");
	}

}
