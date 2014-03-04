/**
 * 
 * This class contains information for places of interest.
 *
 */
public class PlaceOfInterest 
{
	private String name;
	private String area;
	private String description;
	private String country;
	
	/**
	 * This is the constructor for the PlaceOfInterest object.
	 * @param name Name of the place
	 * @param area Area of the place
	 * @param description Description of the place
	 * @param country Country the place belongs to
	 */
	public PlaceOfInterest(String name, String area, String description, String country)
	{
		this.name = name;
		this.area = area;
		this.description = description;
		this.country = country;
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
	public String getCountry()
	{
		return country;
	}
}
