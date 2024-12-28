package Model;

import Model.Enum.BuildingGateState;
import Model.Enum.GateType;

public class BuildingGate extends BaseModel {
    private String gateName;
    private String gateCode;
    private Building building;
    private BuildingGateState gateState;
    private Employee currentOperator;
    private GateType gateType;
}
