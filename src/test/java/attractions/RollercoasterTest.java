package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void allowedOn() {
        Visitor visitor1 = new Visitor(18, 1.68, 32);
        assertEquals(true, rollerCoaster.isAllowedTo(visitor1));
    }

    @Test
    public void notAllowedOn() {
        Visitor visitor1 = new Visitor(7, 1.12, 3);
        assertEquals(false, rollerCoaster.isAllowedTo(visitor1));
    }
}
