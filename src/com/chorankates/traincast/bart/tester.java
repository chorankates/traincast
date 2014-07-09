package com.chorankates.traincast.bart;

public class tester {

	// need to have stations to build routes
	//Stations stations = Stations.getAllStations();
	
	// need to build routes to get schedules
	Route toWork = new Route(
			Station.getStationByName("Powell"), 
			Station.getStationByName("Embarcadero")
	);
	
	Route toHome = new Route(
			Station.getStationByName("Embarcadero"),
			Station.getStationByName("Powell")
	);
	
	
}