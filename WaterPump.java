package waterpump;

public class WaterPump {
    private String brand;
    private int powerConsumption;
    private int efficiency;

    private float price;
    private String color;
    private float weight;
    private int depthOfImmersion;
    private String typeOfPump;

    private static int numOfPump;

    protected String producingCountry;
    protected int cableLength;

 

    public WaterPump(String brand, int powerConsumption, int efficiency, float price, String color, float weight,
            int depthOfImmersion, String typeOfPump, String producingCountry, int cableLength) {
        resetValues(brand, powerConsumption, efficiency, price, color, weight, depthOfImmersion, typeOfPump,
                producingCountry, cableLength);
        numOfPump=+3;        
    }

    public WaterPump(String brand, int powerConsumption, int efficiency, float price) {
        this.brand = brand;
        this.powerConsumption = powerConsumption;
        this.efficiency = efficiency;
        this.price = price;
    }

    public WaterPump() {
        this(null, 0, 0, 0.0f, null, 0.0f, 0, null, null, 0);
    }

    public void resetValues(String brand, int powerConsumption, int efficiency, float price, String color, float weight,
            int depthOfImmersion, String typeOfPump, String producingCountry, int cableLength) {
        this.brand = brand;
        this.powerConsumption = powerConsumption;
        this.efficiency = efficiency;
        this.price = price;
        this.color = color;
        this.weight = weight;
        this.depthOfImmersion = depthOfImmersion;
        this.typeOfPump = typeOfPump;
        this.producingCountry = producingCountry;
        this.cableLength = cableLength;
    }

    public static void printStaticNumOfPump() {
            System.out.println("\nNumber of pump: " + numOfPump);
    }

    public void printNumOfPump() {
            System.out.println("\nNumber of pump: " + numOfPump);
    }
    

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPowerConsumption() {
        return this.powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public int getEfficiency() {
        return this.efficiency;
    }

    public void setEfficiency(int efficiency) {
        this.efficiency = efficiency;
    }

    public float getPrice() {
        return this.price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getWeight() {
        return this.weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getDepthOfImmersion() {
        return this.depthOfImmersion;
    }

    public void setDepthOfImmersion(int depthOfImmersion) {
        this.depthOfImmersion = depthOfImmersion;
    }

    public String getTypeOfPump() {
        return this.typeOfPump;
    }

    public void setTypeOfPump(String typeOfPump) {
        this.typeOfPump = typeOfPump;
    }

    public String getProducingCountry() {
        return this.producingCountry;
    }

    public void setProducingCountry(String producingCountry) {
        this.producingCountry = producingCountry;
    }

    public int getCableLength() {
        return this.cableLength;
    }

    public void setCableLength(int cableLength) {
        this.cableLength = cableLength;
    }

    public WaterPump brand(String brand) {
        setBrand(brand);
        return this;
    }

    public WaterPump powerConsumption(int powerConsumption) {
        setPowerConsumption(powerConsumption);
        return this;
    }

    public WaterPump efficiency(int efficiency) {
        setEfficiency(efficiency);
        return this;
    }

    public WaterPump price(float price) {
        setPrice(price);
        return this;
    }

    public WaterPump color(String color) {
        setColor(color);
        return this;
    }

    public WaterPump weight(float weight) {
        setWeight(weight);
        return this;
    }

    public WaterPump depthOfImmersion(int depthOfImmersion) {
        setDepthOfImmersion(depthOfImmersion);
        return this;
    }

    public WaterPump typeOfPump(String typeOfPump) {
        setTypeOfPump(typeOfPump);
        return this;
    }

    public WaterPump producingCountry(String producingCountry) {
        setProducingCountry(producingCountry);
        return this;
    }

    public WaterPump cableLength(int cableLength) {
        setCableLength(cableLength);
        return this;
    }

    @Override
    public String toString() {
        return " Бренд = " + getBrand() + "\n Споживна потужність = " + getPowerConsumption()
                + "\n Продуктивність = " + getEfficiency() + "\n Ціна = " + getPrice() + "\n Колір = " + getColor()
                + "\n Вага = " + getWeight() + "\n Глибина занурення = " + getDepthOfImmersion()
                + "\n Тип насоса = " + getTypeOfPump() + "\n Країна виробник = " + getProducingCountry()
                + "\n Довжина кабеля = " + getCableLength() ;
    }
}