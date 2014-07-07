package com.chorankates.traincast.bart;

public class Schedule {	
	
	// TODO figure out how we don't have to duplicate this information
	public Station destination;
	public Station origin;
	
	private int fare; // should this be from 'fare' or 'clipper'?
	private String originTimeMinute;
	private String destinationTimeMinute;
	
	
	Schedule (Station destination, Station origin) {
		this.destination = destination;
		this.origin = origin;
	}	

	public String getNiceString() {
		return String.format("%s -> %s [%s :: %s]", 
				this.origin.getName(), this.destination.getName(), 
				this.originTimeMinute, this.destinationTimeMinute
				);
	}
	
	public int getFare() {
		return this.fare;
	}
	
	public String getOriginTimeMinute() {
		return this.originTimeMinute;
	}
	
	public String getDestinationTimeMinute() {
		return this.destinationTimeMinute;
	}
	
}
