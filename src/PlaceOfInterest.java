/**
 * 
 * 
 *
 */
public class PlaceOfInterest 
{
	private String name;
	private String area;
	private String description;
	private String country;
	
	public PlaceOfInterest(String name, String area, String description, String country)
	{
		this.name = name;
		this.area = area;
		this.description = description;
		this.country = country;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getArea()
	{
		return area;
	}
	
	public String getDescription()
	{
		return description;
	}
	
	public String getCountry()
	{
		return country;
	}
}
