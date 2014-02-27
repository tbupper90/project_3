import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;

/*

 * This is the driver class and contains the main method, as well
 * as various methods that manipulate the files
 * 
 * CS2334 Tyler Bell, Terry Thayer, Stanton Kent
 */

public class Driver 
{	
	
	private static ArrayList<Region> list;
	private static ArrayList<Continent> continents = new ArrayList<Continent>();
	private static String continentsFile;
	private static String countriesFile;
	private static String citiesFile;
	

	/**
	 * This is the main method
	 * @param args 
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException
	{
		boolean continueTest = true;
		String dataType;
		String sortMethod;

		//get correct files
		String[] files = Prompt.getFiles();
		continentsFile = files[0];
		countriesFile = files[1];
		citiesFile = files[2];
		
		//read in the files and assign the data contained within
		readFile(continentsFile);
		readFile(countriesFile);
		readFile(citiesFile);
		
		do{
		dataType = Prompt.getDataType();
		list = sort.sortTypeOfData(continents, dataType);
		
		sortMethod = Prompt.getSortMethod(dataType);
		list = sort.performSort(list, sortMethod);

		Prompt.getOutputPreference(list, sortMethod);
		
		continueTest = Prompt.getContinue();
		
		}while(continueTest);
		
		JOptionPane.showMessageDialog(null, "Thank you for using GeoData!",
		        "GeoData", JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	}
	

	/**
	 * This method reads in, parses, and assigns variables
	 * @param file File to be read in 
	 * @throws IOException
	 */
	private static void readFile(String file) throws IOException
	{
		//opens and reads the file 
		FileReader fr = new FileReader(file);
		
		BufferedReader br = new BufferedReader(fr);
		
		String line; //variable that stores the line temporarily 
		
		int test = 0; //tester for loop below
		
		//iterates through all the lines in the file and parses them using parseLine()
		do
		{
			line = br.readLine();
			if(line != null)
			{
				parseLine(line, file);
			}
			else
			{
				test = 1;
			}
		}while(test == 0);
		
		//closes the file 		
		br.close();
	}
	
	/*
	 * this method will split up the file
	 */
	/**
	 * This method parses a line by commas
	 * @param line Line to be parsed
	 * @param file Filename
	 */
	private static void parseLine(String line, String file)
	{
		String[] array = line.split(", ");
		
		assignVariables(array, file);
	}

	/**
	 * This method will assign variable to their repective values	
	 * @param array Array that contains values
	 * @param file Name of the file
	 */
	private static void assignVariables(String[] array, String file)
	{		
		if(file.equals(continentsFile))
		{
			continents.add(new Continent(array[0],array[1],array[2]));	
		}
		
		else if(file.equals(countriesFile))
		{
			Country country = new Country(array[0],array[1],array[2],array[3]);
			
			for(Continent continent : continents)
			{
				if(continent.getName().equals(country.getContinent()))
				{
					continent.countries.add(country);
					break;
				}
			}
			
		}//end else if
		
		else if(file.equals(citiesFile))
		{
			
			if(array.length == 7)
			{
				City city = new City(array[0],array[1],array[2],array[3],array[4],array[5],array[6]);
				
				for(Continent continent : continents)
				{
					for(Country country : continent.countries)
					{
						if(country.getName().equals(city.getCountry()))
						{
							country.cities.add(city);
							//System.out.println(city.getName() + " added to " + country.getName());
						}
					}//end country for
				}//end continent for
			}//end if 
			
			else
			{
				City city = new City(array[0],array[1],array[2],array[3]);
				
				for(Continent continent : continents)
				{
					for(Country country : continent.countries)
					{
						if(country.getName().equals(city.getCountry()))
						{
							country.cities.add(city);
							//System.out.println(city.getName() + " added to " + country.getName());
						}
					}//end country for
				}//end continent for
			}//end else
			
		}
		
	}//end Assign

}//end class
