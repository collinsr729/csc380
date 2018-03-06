package csc380;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.maps.*;
import com.google.maps.DirectionsApi.RouteRestriction;
import com.google.maps.errors.ApiException;
import com.google.maps.model.Distance;
import com.google.maps.model.DistanceMatrix;
import com.google.maps.model.DistanceMatrixElement; 
import com.google.maps.model.DistanceMatrixRow;
import com.google.maps.model.GeocodingResult;
import com.google.maps.model.TravelMode;

import org.json.*;

public class Main {
	
	public static void main(String[] args) {
		
		
		JOptionPane.showMessageDialog(null, "Welcome to the delivery service program.","Title",JOptionPane.WARNING_MESSAGE);
		String a[] = new String[3];
		a[0] = JOptionPane.showInputDialog(null,"Enter an address:");
		a[1] = null;
		a[2] = null;
		
		Map map = new Map();
		
		Order order1 = new Order(new Item("Steak", 20), new Item("Pizza", 30), new Item("Fries", 10));
		System.out.println(order1.getItem(1).getFoodName());
		
		order1.setName("Andrew");
		order1.setAddress("233 Slawson Drive, Camillus NY 13031");
		Order o2 = new Order(new Item("Fries", 10));
		o2.setAddress("7249 Dryer Rd Victor");
		Order o3 = new Order (new Item("Ice Cream", 5));
		o3.setAddress("7093 ny104 oswego");
		Load load = new Load(order1,o2,o3);
		
		map.DistanceCall(order1.getAddress());
		String addressOrder = map.calculateRoute("7060 ny104 oswego", load.getAddresses());
		System.out.println(addressOrder);
		
		
		/*GeocodingResult[] results = null;
			try {
				results = GeocodingApi.geocode(context, a1).await();
			} catch (ApiException | InterruptedException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Gson gson = new GsonBuilder().setPrettyPrinting().create();
			System.out.println(gson.toJson(results[0].geometry));
			
			JSONObject obj = new JSONObject(gson.toJson(results[0].geometry));
			System.out.println(obj);*/
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
