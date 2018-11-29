package behavior.obeserver;

import java.util.List;
import java.util.Optional;

public class MediumPRI implements Strategy{

	@Override
	public void notifyExcute(List<Observer> observers) {
		System.out.println("MediumPRI notify");
		observers.stream().filter(o->Optional.ofNullable(o).isPresent()).filter(o->!(o instanceof ObeserverA)).forEach(o->o.update());
	}

}
