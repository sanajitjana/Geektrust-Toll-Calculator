import java.util.HashMap;
import java.util.Map;

public class Toll {

	private Map<String, Integer> tollMap = new HashMap<>();

	public Toll() {
		// TODO Auto-generated constructor stub

		tollMap.put("MOTORBIKE", 50);
		tollMap.put("SCOOTER", 50);
		tollMap.put("RICKSHAW", 100);
		tollMap.put("CAR", 100);
		tollMap.put("VAN", 100);
		tollMap.put("BUS", 200);
		tollMap.put("TRUCK", 200);
	}

	public Integer getAmount(String vehicleType) {
		return tollMap.getOrDefault(vehicleType, 0);
	}

}
