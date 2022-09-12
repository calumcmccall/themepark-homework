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

    @Test
    public void rollerCoasterPrice(){
        assertEquals(8.40, rollerCoaster.defaultPrice(), 0.0);
    }

    @Test
    public void rollercoasterDoublePrice(){
        Visitor visitor = new Visitor(12, 2.23, 4);
        assertEquals(16.80, rollerCoaster.priceFor(visitor), 0.0);
    }
}
