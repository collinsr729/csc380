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
		order1.setName("Andrew");
		order1.setAddress("233 Slawson Drive, Camillus NY 13031");
		
		Order order2 = new Order(1, new Item("Steak", 20));
		order2.setAddress("9060 NY104");
		
		Load load = new Load(order1, order2);
		
		map.DistanceCall(load.getAddresses());
		

	}

}
