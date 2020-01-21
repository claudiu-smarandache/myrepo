import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BuildingTests {
    private Building building;

    @Before
    public void setUp() {
        building = new Building(18);
    }

    @Test
    public void calculateTest() {
        assertEquals(18, building.getNoOfFloors(), 0.1);
    }
}
