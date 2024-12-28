package Model;

import Model.Enum.ParkingSlotState;
import Model.Enum.VehiclesType;

public class ParkingSlot extends BaseModel {
    private String slotName;
    private String slotCode;
    private ParkingSlotState slotState;
    private ParkingFloor parkingFloor;
    private VehiclesType vehiclesType;
}
