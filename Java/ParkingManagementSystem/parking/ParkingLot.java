package parking;

import java.util.List;

public class ParkingLot {

    private List<ParkingSlot> slots;

    public ParkingLot(List<ParkingSlot> slots) {
        this.slots = slots;
    }

    public List<ParkingSlot> getSlots() {
        return slots;
    }
}
