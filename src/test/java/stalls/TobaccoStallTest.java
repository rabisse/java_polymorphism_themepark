package stalls;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.*;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;
    Visitor youngVisitor;
    Visitor oldVisitor;

    @Before
    public void setUp() throws Exception {
        tobaccoStall = new TobaccoStall("Jacks Drum", "Jack Jarvis", ParkingSpot.B1, 3);
        youngVisitor = new Visitor(14, 1.2, 40.0);
        oldVisitor = new Visitor(21, 2.8, 200.0);
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
    public void allowsOldPerson() {
        assertTrue(tobaccoStall.isAllowedTo(oldVisitor));
    }

    @Test
    public void notAllowYoungPerson() {
        assertFalse(tobaccoStall.isAllowedTo(youngVisitor));
    }

    @Test
    public void hasRating() {
        assertEquals(3, tobaccoStall.getRating());
    }

}
