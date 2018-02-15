package csc380;

public class Map {

	public String[] addresses;
	
	public Map() {
		addresses = new String[20];
	}
	
	public void addPoint(String a1) {
		for(int i = 0; i<addresses.length;i++)
			if(addresses[i].equals(null)) {
				addresses[i] = a1;
				break;
			}
	}
	
	public String calculateRoute() {
		
		// Accesses a map API to get live updates on a route/ or find closest
		// address and go in order from the next closest house to that one
		
		return "";
	}

}
