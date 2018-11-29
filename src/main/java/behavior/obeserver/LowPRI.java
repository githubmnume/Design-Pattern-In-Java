package behavior.obeserver;

import java.util.List;
import java.util.Optional;

public class LowPRI implements Strategy {

	@Override
	public void notifyExcute(List<Observer> observers) {
		System.out.println("LowPRI notify");
		observers.stream().filter(o->Optional.ofNullable(o).isPresent()).filter(o->o instanceof ObeserverC).forEach(o->o.update());
	}

}
