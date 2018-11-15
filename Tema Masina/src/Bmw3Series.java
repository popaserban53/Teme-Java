public class Bmw3Series extends Bmw {
    public float availableFuel;
    public String chassisNumber;

    public Bmw3Series( float availableFuel, String chassisNumber) {
        this.availableFuel = availableFuel;
        this.chassisNumber = chassisNumber;
    }

    public float getAvailableFuel() {
        float usedFuel = getFuelConsumption();
        availableFuel = availableFuel - usedFuel;
        return availableFuel;
    }

    @Override

    public String toString() {
        return "Bmw3Series{" + "Current fuel :" + availableFuel + "Chassis number :" + chassisNumber + '\''
                + "Fuel used :" + getFuelConsumption()+ "Available fuel :" + getAvailableFuel() +" " + '}';
    }
}
