package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.*;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor youngVisitor;
    Visitor oldVisitor;
    Visitor tallVisitor;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        youngVisitor = new Visitor(14, 1.2, 40.0);
        oldVisitor = new Visitor(21, 1.9, 200.0);
        tallVisitor = new Visitor(25, 2.10, 150);
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
    public void allowsTallOldPerson() {
        assertTrue(rollerCoaster.isAllowedTo(oldVisitor));
    }

    @Test
    public void notAllowShortYoungPerson() {
        assertFalse(rollerCoaster.isAllowedTo(youngVisitor));
    }

    @Test
    public void chargeDefault() {
        assertEquals(8.40, rollerCoaster.priceFor(oldVisitor), 0.0);
    }

    @Test
    public void chargeDouble() {
        assertEquals(16.80, rollerCoaster.priceFor(tallVisitor), 0.0);
    }

}
