import java.util.*;

/**
 * This class displays requested information using graphical elements.
 */
public class ShowGraphic 
{
	/**
	 * Displays a bar graph with requested information.
	 * @param list The list with information to display
	 * @param sortMethod How the information should be sorted
	 */
    public static void makeBarGraph(LinkedHashMap<String, Region> list, String sortMethod)
	{
		System.out.println("Bar Graph!");
	}
	
    /**
     * Displays a single bar composed of smaller segments
     * @param list The list with information to display
     * @param sortMethod How the information should be sorted
     */
    public static void segmentGraph(LinkedHashMap<String, Region> list, String sortMethod)
    {
        System.out.println("Segment Graph!");
    }
    /**
     * Displays a map with requested information.
     * @param cities The list of cities to display
     */
	public static void makeWorldMap(LinkedHashMap<String, Region> cities)
	{
        System.out.println("Map!");		
	}
}
