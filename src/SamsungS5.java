public class SamsungS5 extends Samsung{
    private String imei;
    private String colour;
    private String material;

    public SamsungS5 (String imei, String colour, String material) {
        this.imei = imei;
        this.colour = colour;
        this.material = material;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
