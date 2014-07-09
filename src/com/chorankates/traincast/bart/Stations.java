package com.chorankates.traincast.bart;

import java.util.Collection;
import java.util.HashMap;

// class to contain Station information affecting multiple stations
public class Stations {

	Collection<Station> stations;
	
	// strings to be station names (codes?)
	HashMap<String, Station> callStns () {
		HashMap<String, Station> stations = null;		
		
		HashMap<String, String> document;
		String query = "cmd=stns";		
		
		document = Util.callBART(query);  
		
		return stations;
	}

	public Station[] getAllStations() {
		// TODO implement some cache invalidation 
		if (this.stations.isEmpty()) {
			HashMap<String, Station> stations = callStns();
			
			this.stations = stations.values();
		} 		
		
		// TODO this looks a little forced.. should we just be returning a collection?
		return (Station[]) this.stations.toArray();
	}
}
