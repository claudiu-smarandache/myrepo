import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountryTests {
    private Country country;

    @Before
    public void setUp() {
        country = new Country("Romania", 21, 3);
    }

    @Test
    public void calculateTest() {
        assertEquals(24, country.getTotalPopulation(), 0.1);
    }
}
