package csc380;


import org.json.simple.JSONObject;

//import org.json.JSONObject;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.maps.DistanceMatrixApi;
import com.google.maps.DistanceMatrixApiRequest;
import com.google.maps.GeoApiContext;
import com.google.maps.errors.ApiException;
import com.google.maps.model.DistanceMatrix;
import com.google.maps.model.TravelMode;

public class Map {

	public String[] addresses;
	
	public Map() {

	}
	
	public String calculateRoute() {
		
		// Accesses a map API to get live updates on a route/ or find closest
		// address and go in order from the next closest house to that one
		
		return "";
	}
	
	public void DistanceCall(String address[])
	{
		final String HOME_BASE = "7060 NY104";
		
		int distanceAsNumber;
		String address1, address2, address3;
		
		address1 = address[0];
		address2 = null;
		String distanceAsString;
		
		final String GEO_API_KEY = "AIzaSyCUcSoFBlKCqqxApVpprxj9CK6L7RrBhTU";
		GeoApiContext context = new GeoApiContext.Builder()
			    .apiKey(GEO_API_KEY)
			    .build();
		DistanceMatrix trix = null;
		
		if(address2 == null)
		{
			try
			{
				DistanceMatrixApiRequest req = DistanceMatrixApi.newRequest(context); 
		         trix = req.origins(HOME_BASE)
		                .destinations(address1)
		                .mode(TravelMode.DRIVING)
		                //.avoid(RouteRestriction.TOLLS)
		                .language("en-EN")
		                .await();
			}
			
			catch(ApiException e)
			{
				System.out.println("There is an issue with the API request.");
			} 
			
			catch(Exception e)
			{
		        System.out.println(e.getMessage());
		    }   
			
			Gson gson = new GsonBuilder().setPrettyPrinting().create();
			System.out.println(gson.toJson(trix.rows[0]));		
			
			distanceAsString = gson.toJson(trix);
			
			distanceAsString = getDistance(distanceAsString);
			
			distanceAsNumber = Integer.parseInt(distanceAsString);
			
			System.out.println(distanceAsNumber - 22);
			
		}
	}

	private String getDistance(String o) {   //Finds inMeters value from output
		// TODO Auto-generated method stub
		o = o.substring(o.indexOf("\"inMeters\"")+12);
		return o.substring(0, o.indexOf(","));
	}

}
