package attractions;

import behaviours.ISecure;
import people.Visitor;

public class RollerCoaster  extends Attraction implements ISecure {

    public RollerCoaster(String name, int rating) {
        super(name, rating);
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        return (visitor.getAge() >= 12 && visitor.getHeight() > 1.44) ? true : false ;
    }
}
