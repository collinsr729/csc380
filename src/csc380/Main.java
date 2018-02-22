package csc380;

import javax.swing.JOptionPane;

public class Main {
	
	public static void main(String[] args) {
		GeoApiContext context = new GeoApiContext.Builder()
			    .apiKey("AIzaSyCUcSoFBlKCqqxApVpprxj9CK6L7RrBhTU")
			    .build();
			GeocodingResult[] results =  GeocodingApi.geocode(context,
			    "1600 Amphitheatre Parkway Mountain View, CA 94043").await();
			Gson gson = new GsonBuilder().setPrettyPrinting().create();
			System.out.println(gson.toJson(results[0].addressComponents));
		
		JOptionPane.showMessageDialog(null, "Welcome to the delivery service program.");
		String a1 = JOptionPane.showInputDialog(null,"Enter an address:");
		Map m = new Map();
		m.addPoint(a1);
	}

	public void printDeliverySchedule()
	{
		int orders = 0;

		System.out.println("Delivery Schedule:");
		if(orders == 1)
		{
			System.out.println("Address one: ");
		}

		else if(orders == 2)
		{
			System.out.println("Address one: ");
			System.out.println("Address two: ");
		}

		else if(orders == 3)
		{
			System.out.println("Address one: ");
			System.out.println("Address two: ");
			System.out.println("Address three: ");
		}
		
		
	}

}
