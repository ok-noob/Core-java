public class Maiin {
    public static void main(String[] args) {

//        obj1
        coffeeMaker c1 = new coffeeMaker("Starbucks","Light",230);

//        Test getter (Getter = getting the value from private method)
        System.out.println("Brand: " + c1.getBrand());

//        Test setter (Setter = setting the new value to private variables)
        c1.setWaterM(20);

//        Normal method
        c1.brew();
        System.out.println();



//        obj2
        coffeeMaker c2 = new coffeeMaker("Lavazza","Italian",246);
        c2.brew();
    }
}