package com.chorankates.traincast.bart;

import java.util.HashMap;

public class Station {

	public String[] lines;
	public String name;
	public String code;
	
	Station (String name) {
		this.name = name;		
		
		// TODO need to get our code and lines from a Stations object
	}
	
	Station (String name, Station[] stations) {
		this.name = name;

		// TODO should probably be storing this in a hash instead..
		for (Station s : stations) {
			if (s.getName().equals(this.name)) {
				continue; 
			}
			
			this.code  = s.getCode();
			this.lines = s.getLines();
		}		
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getCode() {
		return this.code;
	}
	
	public String[] getLines() {
		return this.lines;
	}
	
	public String getLine(int line) {
		return this.lines[line];
	}
	
	public String getNiceString() {
		// TODO figure out how you want this to look
		return "foo";
	}
	
	public String getNiceString(int line) {
		// TODO figure out how you want this to look
		return "bar";
	}

	public static Station getStationByName(String string) {
		// TODO this should invoke callStninfo()
		return null;
	}
	
	public static Station getStationByName(String string, Stations stations) {
		// TODO this should look at the Station objects in stations
		return null;
	}
	
	// should we really require the argument to be a station? or just use polymorphism? 
	private static Station callStninfo (Station station) {
		Station result = null;
		
		HashMap<String, String> document;
		String query = String.format("cmd=stninfo&orig=%s", station.getCode());

		document = Util.callBART(query);
		
		return result;
	}
	
		
}
