package strategy;

import parking.ParkingSlot;
import vehicle.Vehicle;
import java.util.List;

public class NearestSlotStrategy implements SlotAllocationStrategy {

    @Override
    public ParkingSlot allocateSlot(List<ParkingSlot> slots, Vehicle vehicle) {
        for (ParkingSlot slot : slots) {
            if (slot.canPark(vehicle)) {
                return slot;
            }
        }
        return null;
    }
}
