import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;

/**

 * This is the driver class and contains the main method, as well
 * as various methods that manipulate the files
 * 
 * CS2334 Tyler Bell, Terry Thayer, Stanton Kent
 */

public class Driver 
{	
//	
//	private static ArrayList<Region> list;
//	private static ArrayList<Continent> continents = new ArrayList<Continent>();
	
	private static LinkedHashMap<String, Continent> continents = 
			new LinkedHashMap<String, Continent>();
	private static LinkedHashMap<String, Region> list = new LinkedHashMap<String, Region>();
	
	private static String continentsFile;
	private static String countriesFile;
	private static String citiesFile;
	private static String binaryFile;
	

	/**
	 * This is the main method
	 * @param args 
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException
	{

	}
	

	
	/**
	 * This method reads in, parses, and assigns variables
	 * @param file File to be read in 
	 * @throws IOException
	 */
	private static void readFile(String file) throws IOException
	{

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

	}

	/**
	 * This method will assign variable to their respective values	
	 * @param array Array that contains values
	 * @param file Name of the file
	 */
	private static void assignVariables(String[] array, String file)
	{		
	}	

}//end class
