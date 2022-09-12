package stalls;

import behaviours.ISecure;
import people.Visitor;

public class TobaccoStall extends Stall implements ISecure {

    public TobaccoStall(String name, String ownerName, ParkingSpot parkingSpot) {
        super(name, ownerName, parkingSpot);
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        return visitor.getAge() >= 18 ? true : false;
    }
}
