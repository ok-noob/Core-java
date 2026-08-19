package opps;

public class CoffeeMaker {
    private String brand;
    private String roastType;
    private int waterM;

    public CoffeeMaker(String brand, String roastType, int waterM) {
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

    public static class Maiin {
        public static void main(String[] args) {

    //        obj1
            CoffeeMaker c1 = new CoffeeMaker("Starbucks","Light",230);

    //        Test getter (Getter = getting the value from private method)
            System.out.println("Brand: " + c1.getBrand());

    //        Test setter (Setter = setting the new value to private variables)
            c1.setWaterM(20);

    //        Normal method
            c1.brew();
            System.out.println();



    //        obj2
            CoffeeMaker c2 = new CoffeeMaker("Lavazza","Italian",246);
            c2.brew();
        }
    }
}