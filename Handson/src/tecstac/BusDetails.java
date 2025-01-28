package tecstac;

import java.util.HashMap;
import java.util.HashSet;

public class BusDetails {

	private HashMap<String, String> hm = new HashMap<>();

	public HashMap<String, String> getHm() {
		return hm;
	}

	public void setHm(HashMap<String, String> hm) {
		this.hm = hm;
	}

	public void addBusDetails(String busNumber, String ownerName) {
		hm.put(busNumber, ownerName);
	}

	public HashSet<String> searchBusNumbersByOwnersName(String ownerName) {
		HashSet<String> myset = new HashSet<String>();
		for (String k : hm.keySet()) {
			if (hm.get(k).equalsIgnoreCase(ownerName)) {
				myset.add(k);
			}
		}
		return myset;
	}

}
