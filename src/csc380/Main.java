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
		
		
		JOptionPane.showMessageDialog(null, "Welcome to the delivery service program.");
		String a[] = new String[3];
		a[0] = JOptionPane.showInputDialog(null,"Enter an address:");
		
		Map map = new Map();
		
		Order order1 = new Order(3, new Item("Steak", 20), new Item("Pizza", 30), new Item("Fries", 10));
		System.out.println(order1.getItem(1).getFoodName());
		
		order1.setName("Andrew");
		order1.setAddress("233 Slawson Drive, Camillus NY 13031");
		
		Load load = new Load(order1);
		
		map.DistanceCall(load.getAddresses());
		
		
		
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
