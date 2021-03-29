package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.*;

public class PlaygroundTest {
    Playground playground;
    Visitor youngVisitor;
    Visitor oldVisitor;

    @Before
    public void setUp() throws Exception {
        playground = new Playground("Fun Zone", 7);
        youngVisitor = new Visitor(14, 1.2, 40.0);
        oldVisitor = new Visitor(21, 2.8, 200.0);

    }

    @Test
    public void hasName() {
        assertEquals("Fun Zone", playground.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(7, playground.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, playground.getVisitCount());
    }

    @Test
    public void allowsYoungPerson() {
        assertTrue(playground.isAllowedTo(youngVisitor));
    }

    @Test
    public void notAllowOldPerson() {
        assertFalse(playground.isAllowedTo(oldVisitor));
    }


}
