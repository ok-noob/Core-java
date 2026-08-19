package opps;

public class Smartphone {
   private String brand;
   private String model;
   private int storage;

    public Smartphone (String brand, String model, int storage) {
        this.brand = brand;
        this.model = model;
        this.storage = storage;
    }
    public void showDetails() {
        System.out.println("Your smartphone is "+brand+" "+model+" with "+storage+"GB storage");
    }

//    Getters
    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public int getStorage(){
        return storage;
    }
//    Setters
    public void setStorage(int storage){
        if (storage < 64)
            throw new IllegalStateException("Storage must be at least 64GB! ");
        else {
            this.storage = storage;
            System.out.println("Your storage is "+storage+"GB!");
        }
    }

}
