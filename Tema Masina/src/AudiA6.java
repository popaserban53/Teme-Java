public class AudiA6 extends Audi {
    private float availableFuel;
    private String chassisNumber;

    public AudiA6 (float availableFuel, String chassisNumber) {
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
        return "AudiA6{" + "Current fuel :" + availableFuel + "Chassis number :" + chassisNumber + '\''
                + "Fuel used :" + getFuelConsumption()+ "Available fuel :" + getAvailableFuel() +" " + '}';
    }
}
