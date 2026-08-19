public class coffeeMaker {
    private String brand;
    private String roastType;
    private int waterM;

    public coffeeMaker(String brand, String roastType, int waterM) {
        this.brand = brand;
        this.roastType = roastType;
        this.waterM = waterM;

    }

    //    Getters
    public String getBrand() {
        return brand;
    }

    public String getRoastType() {
        return roastType;
    }

    public int getWaterM() {
        return waterM;
    }

    public void brew() {
        System.out.println("Brewing a fresh cup of " + brand + " using " + roastType + " roast with " + waterM + "ml of water");
    }

    //    Setter
    public void setWaterM(int waterM) {
        if (waterM < 50)
            throw new IllegalStateException("Water is too low!");
        else {
            this.waterM = waterM;
            System.out.println("Water update successfully to " + waterM + "ml");
        }
    }
}

