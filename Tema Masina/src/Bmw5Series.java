public class Bmw5Series extends Bmw{
    private float availableFuel;
    private String chassisNumber;

    public Bmw5Series(float availableFuel, String chassisNumber) {
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
        return "Bmw5Series{" + "Current fuel :" + availableFuel + "Chassis number :" + chassisNumber + '\''
                + "Fuel used :" + getFuelConsumption()+ "Available fuel :" + getAvailableFuel() +" " + '}';
    }
}
