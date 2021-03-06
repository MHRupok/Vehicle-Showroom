/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homepage;

/**
 *
 * @author mehed
 */
public class SportsVehicle extends Vehicle {

    private boolean turbo;

    public SportsVehicle(VehicleType vehicleType, String modelNumber, int enginePower, int tireSize, boolean turbo) {
        super(vehicleType, modelNumber, EngineType.Oil, enginePower, tireSize);
        this.setTurbo(turbo);
    }

    //Make space string
    private String calculateGap(int a, int b) {
        String gap = "";
        for (int i = b; i <= a; i++) {
            gap = gap + " ";
        }
        return gap;
    }

    @Override
    public String getDetails() {

        String v1 = getVehicleType().toString();
        String v2 = getModelNumber().toString();
        String v3 = getEngineType().toString();
        String v4 = Integer.toString(getEnginePower());
        String v5 = Integer.toString(getTireSize());
        String v6 = Boolean.toString(isTurbo());
        String v7 = "X";

        v1 = calculateGap(15, v1.length());
        v2 = calculateGap(15, v2.length());
        v3 = calculateGap(15, v3.length());
        v4 = calculateGap(15, v4.length());
        v5 = calculateGap(15, v5.length());
        v6 = calculateGap(15, v6.length());
        v7 = calculateGap(15, v7.length());

        String details = getVehicleType() + v1 + getModelNumber() + v2 + getEngineType() + v3 + Integer.toString(getEnginePower()) + v4 + Integer.toString(getTireSize()) + v5 + Boolean.toString(isTurbo()) + v6 + "X" + v7;
        return details;
    }

    public boolean isTurbo() {
        return turbo;
    }

    public void setTurbo(boolean turbo) {
        this.turbo = turbo;
    }

}
