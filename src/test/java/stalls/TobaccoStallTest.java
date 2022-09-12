package stalls;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;

    @Before
    public void setUp() throws Exception {
        tobaccoStall = new TobaccoStall("Jacks Drum", "Jack Jarvis", ParkingSpot.B1,3);
    }

    @Test
    public void hasName() {
        assertEquals("Jacks Drum", tobaccoStall.getName());
    }

    @Test
    public void hasOwner() {
        assertEquals("Jack Jarvis", tobaccoStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals(ParkingSpot.B1, tobaccoStall.getParkingSpot());
    }

    @Test
    public void dontAllowTooYoung() {
        Visitor visitor1 = new Visitor(7, 1.68, 32);
        assertEquals(false, tobaccoStall.isAllowedTo(visitor1));
    }

    @Test
    public void allowOldEnough() {
        Visitor visitor1 = new Visitor(18, 1.12, 3);
        assertEquals(true, tobaccoStall.isAllowedTo(visitor1));
    }
}
