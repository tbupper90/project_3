import java.util.*;

/**
 * 
 * This class contains the information for a Country object
 *
 */
public class Country extends Region
{
	/*
	 * an arraylist of cities, as well as the variables for a country
	 * object
	 */
	ArrayList<City> cities = new ArrayList<City>();

	private String continent;
	
	/**
	 * creates a Country object
	 */
	/**
	 * This is the contructor for the Country object
	 * @param name Name of the country
	 * @param pop Population of the country
	 * @param area Area of the country
	 * @param continent Continent the country belongs to
	 */
	public Country(String name, String pop, String area, String continent)
	{
		this.name = name;
		this.pop = pop;
		this.area = area;
		this.continent = continent;
	}
	/**
	 * these methods will get the different variables of
	 * the City object
	 */
	
	public String getContinent()
	{
		return continent;
	}

	/**
	 * This method will add a city to the city array list
	 * @param city The city object to be added
	 */
	public void addCity(City city)
	{
		cities.add(city);
	}
	
	public String toString()
	{
		return name;
	}
	

}


