package behavior.state.demo;

public class App {

	public static void main(String[] args) {
		StateContext stateContext=new StateContext();
		stateContext.setState(new OnState());
		
		Switch switch1=new Switch(stateContext);
		switch1.on();
		switch1.off();
		switch1.on();
	}

}
