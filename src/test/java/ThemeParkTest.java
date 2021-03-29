import attractions.Attraction;
import attractions.Dodgems;
import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    Visitor visitor;
    Dodgems dodgems;
    ThemePark themePark;

    @Before
    public void before() {
        visitor = new Visitor(14, 1.2, 40.0);
        dodgems = new Dodgems("Bumper Cars", 5);
        themePark = new ThemePark();
    }

    @Test
    public void allReviewedStartsEmpty() {
        assertEquals(0, themePark.allReviewedCount());
    }

    @Test
    public void canAddToAllReviewed() {
        themePark.addToAllReviewed(dodgems);
        assertEquals(1, themePark.allReviewedCount());
    }

    @Test
    public void canVisitAttraction() {
        themePark.visit(visitor, dodgems);
        assertEquals(1, visitor.visitedAttractionsCount());
        assertEquals(1, dodgems.getVisitCount());
    }

}
