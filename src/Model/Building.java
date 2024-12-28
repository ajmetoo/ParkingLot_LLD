package Model;

import Model.Enum.BuildingState;
import java.util.List;

public class Building extends BaseModel{
    private List<ParkingFloor> parkingFloors;
    private List<ParkingSlot>  parkingSlots;
    private List<BuildingGate>  buildingGates;
    private BuildingState buildingState;

    public boolean isBuildingOpen() {
        return buildingState == BuildingState.Open;
    }

    public List<ParkingFloor> getParkingFloors() {
        return parkingFloors;
    }

    public void setParkingFloors(List<ParkingFloor> parkingFloors) {
        this.parkingFloors = parkingFloors;
    }
}
