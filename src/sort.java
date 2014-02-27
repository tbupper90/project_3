import java.util.*;


/**
 * This class contains all the sort methods
 *
 */
public class sort 
{

	public static ArrayList<Region> sortByArea(ArrayList<Region> list)
	{
		Collections.sort(list, Region.Comparators.AREA);
		return list;
	}
	
	public static ArrayList<Region> sortByPopulation(ArrayList<Region> list)
	{
		Collections.sort(list, Region.Comparators.POP);
		return list;
	}
	
	public static ArrayList<City> sortByLat(ArrayList<City> cities)
	{
		Collections.sort(cities, City.Comparators.LAT);
		return cities;	
	}
	
	public static ArrayList<City> sortByLon(ArrayList<City> cities)
	{
		Collections.sort(cities, City.Comparators.LON);
		return cities;
	}
	
	public static ArrayList<City> sortByElev(ArrayList<City> cities)
	{
		Collections.sort(cities, City.Comparators.ELEV);
		return cities;
	}
	
	public static ArrayList<Region> sortByLexi(ArrayList<Region> list)
	{
		Collections.sort(list, Region.Comparators.NAME);
		return list;
	}
	
	public static ArrayList<Region> sortRandomly(ArrayList<Region> list)
	{
		Collections.shuffle(list);
		return list;
	}
	
	public static ArrayList<Region> sortTypeOfData(ArrayList<Continent> continents, String dataType)
	{
		//list that will be returned 
		ArrayList<Region> newList = new ArrayList<Region>();
		
		//String array used to check for countries within continents, and cities within countries.
		String[] dataTypeArray = dataType.split("_");
				
		switch(dataType)
		{
		case "All continents": 
			newList.addAll(continents);
			return newList;
			
		case "All countries":
			for(Continent continent : continents)
			{
				newList.addAll(continent.countries);
			}
			return newList;
			
		case "All cities":
			for(Continent continent : continents)
			{
				for(Country country : continent.countries)
				{
					newList.addAll(country.cities);
				}
			}
			
			return newList;
		}	
		
		//had to make a different switch for the countries within and cities within. Will look at revising
		switch(dataTypeArray[1])
		{
			case "countrieswithin":
				for(Continent continent : continents)
				{
					if(continent.getName().equalsIgnoreCase(dataTypeArray[2]))
					{
						newList.addAll(continent.countries);
						return newList;
					}
				}
			
			case "citieswithin":
				for(Continent continent : continents)
				{
					for(Country country : continent.countries)
					{
						if(country.getName().equalsIgnoreCase(dataTypeArray[2]))
						{
							newList.addAll(country.cities);
							return newList;
						}
					}
				}
			
				
				
		}//end switch
		
		return null;
	}//end method
	
	
	public static ArrayList<Region> performSort(ArrayList<Region> list, String sortMethod)
	{
		ArrayList<Region> newList = new ArrayList<Region>();
		ArrayList<City> cityList = new ArrayList<City>();	
		
		switch(sortMethod)
		{
		case "Area":
			newList = sortByArea(list);
			return newList;
		
		case "Population":
			newList = sortByPopulation(list);
			return newList;
		
		case "Lexicographic":
			newList = sortByLexi(list);
			return newList;
		
		case "Latitude": 
			
		    for(Region city : list)
			{
				cityList.add((City) city);
			}
			
			cityList = sortByLat(cityList);
			
			for(City city : cityList)
			{
				newList.add(city);
			}
			return newList;
			
		case "Longitude":
			
		    for(Region city : list)
			{
				cityList.add((City) city);
			}
			
			cityList = sortByLon(cityList);
			
			for(City city : cityList)
			{
				newList.add(city);
			}
			return newList;	
		
		case "Elevation":
			
		    for(Region city : list)
			{
				cityList.add((City) city);
			}
			
			cityList = sortByElev(cityList);
			
			for(City city : cityList)
			{
				newList.add(city);
			}
			return newList;
		
		case "Random":
		    newList = sortRandomly(list);
		    return newList;
		    
		}
		
		return null;
					
	}//end method
	

	
	
}//end class
