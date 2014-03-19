import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;


public class PlaceOfInterestTest {

    @Test
    public void testPlaceOfInterest() {
        // Test correct storage of attributes
        ArrayList<Country> testCountries = new ArrayList<>();
        testCountries.add(new Country("Name1", "Pop1", "Area1", "Continent1"));
        testCountries.add(new Country("Name2", "Pop2", "Area2", "Continent2"));

        PlaceOfInterest testPlace = new PlaceOfInterest("Name", "Area",
                "Description", testCountries);

        assertEquals(testPlace.getName(), "Name");
        assertEquals(testPlace.getArea(), "Area");
        assertEquals(testPlace.getDescription(), "Description");
        assertEquals(testPlace.getCountry(), testCountries);
    }

}
