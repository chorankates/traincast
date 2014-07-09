package com.chorankates.traincast.bart;

import java.util.HashMap;

public class Util {
	// TODO implement a basic http getter
	// TODO implement xml deserialization
	
	// TODO get a list of station advisories

	public static String BARTendpoint = "http://api.bart.gov/api/etd.aspx";
	public static String BARTkey      = "MW9S-E7SL-26DU-VV8V"; // don't worry, it's public.. 

	// TODO this probably belongs somewhere else..
	Schedule[] callArrive (Station origin, Station destination) {
		Schedule[] arrivals = null;
		HashMap<String, String> document;
		
		// TODO should probably have a way for users to control these..
		String time            = "now";
		int howManyTripsBefore = 0;
		int howManyTripsAfter  = 3;

		String url = String.format("cmd=arrive&orig=%s&dest=%s&time=%s&b=%s&a=%s",
					origin.getCode(),
					destination.getCode(),
					time,
					howManyTripsBefore,
					howManyTripsAfter
				);
		
		document = callBART(url);
		
		return arrivals;
	}
	
	// we probably need to return XML here.. 
	public static HashMap<String, String> callBART (String query) {
		// callBART() with a query, the endpoint and key (and trailing &) will be prepended to your query
		HashMap<String, String> parsed_response = null;
		
		String url = String.format("%s?key=%s&%s", BARTendpoint, BARTkey, query);
		
		// call something to convert stringy XML to an object of some sort
		
		return parsed_response;
	}
	
	
}
