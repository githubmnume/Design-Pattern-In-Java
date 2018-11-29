package behavior.obeserver;

import java.util.List;
import java.util.Optional;

public class MajorPRI implements Strategy{

	@Override
	public void notifyExcute(List<Observer> observers) {
		System.out.println("MajorPRI notify, notify all");
		observers.stream().parallel().filter(o->Optional.ofNullable(o).isPresent()).forEach(o->o.update());
	
	}

}

