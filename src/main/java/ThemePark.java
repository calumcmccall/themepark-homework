import attractions.Attraction;
import behaviours.IReviewed;
import org.w3c.dom.Attr;
import people.Visitor;
import stalls.Stall;

import java.util.ArrayList;

public class ThemePark {

    private ArrayList<Attraction> attractions;
    private ArrayList<Stall> stalls;

    public ThemePark(ArrayList<Attraction> attractions, ArrayList<Stall> stalls) {
        this.attractions = attractions;
        this.stalls = stalls;
    }

    public ArrayList<IReviewed> getAllReviewed() {
        ArrayList<IReviewed> reviewed = new ArrayList<>();
        for (Attraction attraction: attractions) {
            reviewed.add(attraction);
        }
        return reviewed;
    }

    public void visit(Visitor visitor, Attraction attraction){
        visitor.visitAttraction(attraction);
        attraction.setVisitCount(attraction.getVisitCount() + 1);
    }
}
