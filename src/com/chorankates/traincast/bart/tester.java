package com.chorankates.traincast.bart;

public class tester {

	// need to have stations to build routes
	Station[] stations = Station.getAllStations();
	
	// need to build routes to get schedules
	Route toWork = new Route(
			Station.getStationByName("Powell", stations), 
			Station.getStationByName("Embarcadero", stations)
	);
	
	Route toHome = new Route(
			Station.getStationByName("Embarcadero", stations),
			Station.getStationByName("Powell", stations)
	);
	
	//System.out.println("to work:");
	for (Schedule s : toWork.getSchedules()) {
		System.out.println(String.format("%s", s.toString()));
	}
	
	//System.out.println("to home:");
	for (Schedule s : toHome.getSchedules()) { 
		System.out.println(String.format("%s", s.toString()));
	}
	
}
