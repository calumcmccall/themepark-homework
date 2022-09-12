package attractions;

import behaviours.ISecure;
import behaviours.ITicketed;
import people.Visitor;

public class RollerCoaster  extends Attraction implements ISecure, ITicketed {

    public RollerCoaster(String name, int rating) {
        super(name, rating);
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        return (visitor.getAge() >= 12 && visitor.getHeight() > 1.44) ? true : false ;
    }

    @Override
    public double defaultPrice() {
        return 8.40;
    }

    @Override
    public double priceFor(Visitor visitor) {
        return visitor.getHeight() > 2.00 ? 16.80 : 8.40;
    }
}
