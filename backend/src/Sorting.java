import java.util.Comparator;
import java.util.Map;

public class Sorting implements Comparator<Map.Entry<String, Integer>> {

	@Override

	public int compare(Map.Entry<String, Integer> mapObject1, Map.Entry<String, Integer> mapObject2) {
		if (mapObject2.getValue() == mapObject1.getValue())
			return mapObject2.getKey().compareTo(mapObject1.getKey());
		else
			return mapObject2.getValue().compareTo(mapObject1.getValue());
	}

}
