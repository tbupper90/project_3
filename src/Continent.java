import java.util.*;

/**
 * This class contains the content for a continent object
 *
 */
public class Continent extends Region
{

	/**
	 * This is the arraylist of countries contained in the coninent
	 */
	ArrayList<Country> countries = new ArrayList<Country>();

	/**
	 * This is the contructor for a Continent object
	 * @param name Name of the Continent
	 * @param pop Population of the Continent
	 * @param area Area of the Continent
	 */
	public Continent(String name, String pop, String area)
	{
		this.name = name;
		this.pop = pop;
		this.area = area;
	}


	/**
	 * THis method will add a country to the Array list
	 * @param country Country object to be added
	 * 
	 */
	public void addCountry(Country country)
	{
		countries.add(country);
	}
	
	public ArrayList<Country> getCountries()
	{
		return countries;
	}
	
	public String toString()
	{
		return name;
	}
	
	
}
