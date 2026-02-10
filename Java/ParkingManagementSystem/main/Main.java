package main;

import enums.VehicleType;
import parking.ParkingLot;
import parking.ParkingSlot;
import service.ParkingService;
import strategy.NearestSlotStrategy;
import vehicle.Bike;
import vehicle.Car;

import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        List<ParkingSlot> slots = new ArrayList<>();
        slots.add(new ParkingSlot(1, VehicleType.CAR));
        slots.add(new ParkingSlot(2, VehicleType.CAR));
        slots.add(new ParkingSlot(3, VehicleType.BIKE));

        ParkingLot parkingLot = new ParkingLot(slots);
        ParkingService service = new ParkingService(parkingLot, NearestSlotStrategy());
    }
}