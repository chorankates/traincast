package com.chorankates.traincast.bart;

import java.util.HashMap;

public class Util {
	// TODO implement a basic http getter
	// TODO implement xml deserialization
	
	// TODO get a list of stations to ease creation of Station.java objects
	// TODO get a list of station advisories

	public String endpoint = "http://api.bart.gov/api/etd.aspx";
	public String key      = "MW9S-E7SL-26DU-VV8V"; // don't worry, it's public.. 


	HashMap<String, Station> callStns () {
		HashMap<String, Station> stations;		
		
		HashMap<String, String> document;
		String url = String.format("%s?key=%s&cmd=stns", endpoint, key);		
		
		document = callBART(url);  
		
		return stations;
	}
	
	
	HashMap<String, Schedule> callArrive (Station origin, Station destination) {
		HashMap<String, Schedule> arrivals;
		HashMap<String, String> document;
		
		// TODO should probably have a way for users to control these..
		String time            = "now";
		int howManyTripsBefore = 0;
		int howManyTripsAfter  = 3;

		String url = String.format("%s?&key=%s&cmd=arrive&time=%s&b=%s&a=%s",
					endpoint,
					key,
					time,
					howManyTripsBefore,
					howManyTripsAfter
				);
		
		document = callBART(url);
		
		return arrivals;
	}
	
	
	HashMap<String, String> callBART (String url) {
		HashMap<String, String> response;
		
		return response;
	}
	
	
}
