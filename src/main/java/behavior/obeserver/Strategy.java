package behavior.obeserver;

import java.util.List;

public interface Strategy {

	void notifyExcute(List<Observer> observers);
}
