import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.io.*;


/**
 * THis class will get the files as well as user input
 *
 */
public class Prompt 
{

	/**
	 * THis method will get the files	
	 * @return String array containing file names
	 */
	public static String[] getFiles()
	{
		return null;
	}
	

	 /**
	  * This method will get the data type the user inputs
	  * @return Data type user is interested in
	  */
	public static String getDataType()
	{
        return null;
	}
	

	/**
	 * This will get the way the data will be sorted
	 * @param dataType Type of data user is interested in
	 * @return Way to be sorted as string
	 */
	public static String getSortMethod(String dataType)
	{
        return null;
	}
	

	/**
	 * this will determine whether to output to console, file, or get further data
	 * @param list List to be printed from 
	 * @param sortMethod Way the list was sorted
	 * @throws IOException
	 */
	public static void getOutputPreference(LinkedHashMap<String, Region> list,
	        String sortMethod) throws IOException
	{
		
		
	}
	
	/**
	 * This writes the information to a file determined by the User
	 * @param list List Region objects are contained in	
	 * @param filename Name of file to be written
	 * @throws IOException
	 */
	public static void fileWriter (LinkedHashMap<String, Region> list, String filename)
	        throws IOException
	{
	}

	/**
	 * Searches for a region if the user is looking for a specific one
	 * @param list List of Region objects
	 * @param region Region name the user is interested in
	 * @param sortMethod Way the list was sorted
	 * @return 
	 */
	
	public static String searchRegion(LinkedHashMap<String, Region> list, String region,
	        String sortMethod)
	{
		
		return null;
	}
	

	/**
	 * This will determine whether to continue with the program
	 * @return true if continue, false if not
	 */
	public static boolean getContinue()
	{
        return true;
	}
	
	
}
