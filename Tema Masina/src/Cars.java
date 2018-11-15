public abstract class Cars implements Vehicle{
    private int fuelTankSize = 75;
    private int gears;
    private String fuelType = "diesel";
    private float fuelConsumption;
    private float averageFuelConsumption = 7.5f;

    public int getFuelTankSize() {
        return fuelTankSize;
    }

    public int getGears() {
        return gears;
    }

    public void setGears(int gears) {
        if(this.gears + 1 == gears) {
            this.gears = gears;
        }
        else {
            System.out.println("Vehicle is not in gear!!");
        }
    }

    public String getFuelType() {
        return fuelType;
    }

    public float getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(float fuelConsumption) {

        this.fuelConsumption = (this.fuelConsumption + fuelConsumption);

    }

    public float getAverageFuelConsumption() {
        return averageFuelConsumption;
    }

    @Override

    public void Start() {
        fuelConsumption = 0;
    }

    @Override
    public void Drive(int km) {
        if (gears == 1) {
            float fuelConsumption1 = (averageFuelConsumption * km / 100) + 0.6f*(averageFuelConsumption * km / 100);
             setFuelConsumption(fuelConsumption1);
        }
        else if (gears == 2) {
            float fuelConsumption1 = (averageFuelConsumption * km / 100) + 0.5f*(averageFuelConsumption * km / 100);
            setFuelConsumption(fuelConsumption1);
        }
        else if (gears == 3) {
            float fuelConsumption1 = (averageFuelConsumption * km / 100) + 0.4f*(averageFuelConsumption * km / 100);
            setFuelConsumption(fuelConsumption1);
        }
        else if (gears == 4) {
            float fuelConsumption1 = (averageFuelConsumption * km / 100) + 0.3f*(averageFuelConsumption * km / 100);
            setFuelConsumption(fuelConsumption1);
        }
        else if (gears == 5) {
            float fuelConsumption1 = (averageFuelConsumption * km / 100) + 0.2f*(averageFuelConsumption * km / 100);
            setFuelConsumption(fuelConsumption1);
        }
        else if (gears == 6) {
            float fuelConsumption1 = (averageFuelConsumption * km / 100) + 0.1f*(averageFuelConsumption * km / 100);
            setFuelConsumption(fuelConsumption1);
        }
    }

    @Override

    public void Stop() {
        System.out.println("Fuel consumption : " + fuelConsumption);
    }
}

