package com.chorankates.traincast.bart;

public class Route {

	public Station destination;
	public Station origin;
	
	private Schedule[] schedule; // this model feels a little weird, but.. schedules are time labelled instances of routes
	
	Route (Station destination, Station origin) {
		// for now, not dealing with cached info, so only need to know start and end
		// TODO make the 'arrive' call
		
		
		// TODO construct Schedules based on response
	}	
	
}
