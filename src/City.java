import java.util.*;


/**
 * This class contains information for a city object
 * 
 *
 */
public class City extends Region 
{


	private String country;
	private String lat;
	private String lon;
	private String elev;
	

	/**
	 * This method creates a city object without lat, lon, or elevation
	 * @param name Name of the city
	 * @param pop Population of the city
	 * @param area Area of the city
	 * @param country Country the city is in
	 */
	public City(String name, String pop, String area, String country)
	{
		this.name = name;
		this.pop = pop;
		this.area = area;
		this.country = country;
		this.lat = "";
		this.lon = "";
		this.elev = "";
	}

	
	/**
	 * This method will create a city object 
	 * @param name Name of the city
	 * @param pop Population of the city
	 * @param area Area of the city
	 * @param country Country the city is in
	 * @param lat Latitude
	 * @param lon Longitude
	 * @param elev Elevation
	 */
	public City(String name, String pop, String area, String country, String lat, String lon, String elev)
	{
		this.name = name;
		this.pop = pop;
		this.area = area;
		this.country = country;
		this.lat = lat;
		this.lon = lon;
		this.elev = elev;
	}
	/*
	 * These methods will get the different variables of the City
	 */
	
	public String getCountry()
	{
		return country;
	}
	
	public String getLat()
	{
		return lat;
	}
	
	public String getLon()
	{
		return lon;
	}
	
	public String getElev()
	{
		return elev;
	}
	
	public String toString()
	{
		return name;
	}
	
	
	/**
	 * This class contains the comparators for a city object that aren't 
	 * inherited from a Region 
	 * 
	 *
	 */
	public static class Comparators
	{
		
	}



	
	
}
