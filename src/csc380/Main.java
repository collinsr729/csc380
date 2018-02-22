package csc380;

import java.io.IOException;

import javax.swing.JOptionPane;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.maps.*;
import com.google.maps.errors.ApiException;
import com.google.maps.model.GeocodingResult;

public class Main {
	
	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "Welcome to the delivery service program.");
		String a1 = JOptionPane.showInputDialog(null,"Enter an address:");
		
		
		GeoApiContext context = new GeoApiContext.Builder()
			    .apiKey("AIzaSyCUcSoFBlKCqqxApVpprxj9CK6L7RrBhTU")
			    .build();
			GeocodingResult[] results = null;
			try {
				results = GeocodingApi.geocode(context, a1).await();
			} catch (ApiException | InterruptedException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Gson gson = new GsonBuilder().setPrettyPrinting().create();
			System.out.println(gson.toJson(results[0].addressComponents));
		
		/*JOptionPane.showMessageDialog(null, "Welcome to the delivery service program.");
		String a1 = JOptionPane.showInputDialog(null,"Enter an address:");
		Map m = new Map();
		m.addPoint(a1);*/
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
