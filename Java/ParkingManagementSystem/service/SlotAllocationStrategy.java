package service;

import parking.ParkingSlot;
import vehicle.Vehicle;
import java.util.List;

public interface SlotAllocationStrategy {
    ParkingSlot allocateSlot(List<ParkingSlot> slots, Vehicle vehicle);
}
