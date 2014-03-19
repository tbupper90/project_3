import java.io.Serializable;
import java.util.*;

/**
 * 
 * This class contains information for places of interest.
 *
 */
public class PlaceOfInterest implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -5566762757484533693L;
	
	private String name;
	private String area;
	private String description;
	private ArrayList<Country> countries;
	
	/**
	 * This is the constructor for the PlaceOfInterest object.
	 * @param name Name of the place
	 * @param area Area of the place
	 * @param description Description of the place
	 * @param country Country the place belongs to
	 */
	public PlaceOfInterest(String name, String area, String description, ArrayList<Country> countries)
	{
		this.name = name;
		this.area = area;
		this.description = description;
		this.countries = countries;
	}
	
	/**
	 * @return The place's name
	 */
	public String getName()
	{
		return name;
	}
	
	/**
	 * @return The place's area
	 */
	public String getArea()
	{
		return area;
	}
	
	/**
	 * @return The place's description
	 */
	public String getDescription()
	{
		return description;
	}
	
	/**
	 * @return The country the place belongs to
	 */
	public ArrayList<Country> getCountry()
	{
		return countries;
	}
}
