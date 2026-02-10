package parking;

import enums.SlotStatus;
import enums.VehicleType;
import vehicle.Vehicle;

public class ParkingSlot {

    private int slotId;
    private VehicleType allowedType;
    private SlotStatus status;
    private Vehicle parkedVehicle;

    public ParkingSlot(int slotId, VehicleType allowedType) {
        this.slotId = slotId;
        this.allowedType = allowedType;
        this.status = SlotStatus.FREE;
        this.parkedVehicle = null;
    }

    public boolean isFree() {
        return status == SlotStatus.FREE;
    }

    public void park(Vehicle vehicle) {
        this.parkedVehicle = vehicle;
        this.status = SlotStatus.OCCUPIED;
    }

    public void unpark() {
        this.parkedVehicle = null;
        this.status = SlotStatus.FREE;
    }

    public int getSlotId() {
        return slotId;
    }

    public VehicleType getAllowedType() {
        return allowedType;
    }
}
