import static org.junit.Assert.*;

import org.junit.Test;


public class PlaceOfInterestTest {

    @Test
    public void testPlaceOfInterest() {
        // Test correct storage of attributes
        PlaceOfInterest testPlace = new PlaceOfInterest("Name", "Area",
                "Description", "Country");

        assertEquals(testPlace.getName(), "Name");
        assertEquals(testPlace.getArea(), "Area");
        assertEquals(testPlace.getDescription(), "Description");
        assertEquals(testPlace.getCountry(), "Country");
    }

}
