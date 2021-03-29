import attractions.Attraction;
import behaviours.IReviewed;
import people.Visitor;

import java.util.ArrayList;

public class ThemePark {

    private ArrayList<IReviewed> allReviewed;

    public ThemePark() {
        this.allReviewed = new ArrayList<>();
    }

    public ArrayList<IReviewed> getAllReviewed() {
        return this.allReviewed;
    }

    public int allReviewedCount() {
        return this.allReviewed.size();
    }

    public void addToAllReviewed(IReviewed reviewed) {
        this.allReviewed.add(reviewed);
    }

    public void visit(Visitor visitor, Attraction attraction) {
        attraction.addOneToVisitCount();
        visitor.addVisitedAttraction(attraction);
    }

}
