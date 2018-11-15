public class AudiA4 extends Audi {
    private float availableFuel;
    private String chassisNumber;

    public AudiA4(float availableFuel, String chassisNumber) {
        this.availableFuel = availableFuel;
        this.chassisNumber = chassisNumber;
    }

    public float getAvailableFuel() {
        float fuelUsed = getFuelConsumption();
        availableFuel = availableFuel - fuelUsed;
        return availableFuel;

    }

    @Override

    public String toString() {
        return "AudiA4{" + "Current fuel :" + availableFuel + "Chassis number :" + chassisNumber + '\''
                + "Fuel used :" + getFuelConsumption()+ "Available fuel :" + getAvailableFuel() +" " + '}';

    }
}
