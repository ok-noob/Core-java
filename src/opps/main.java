package opps;

public class main {
    public static void main(String[] args) {


//    obj1
        Smartphone p1 = new Smartphone("Apple", "iPhone 14", 256);
        p1.setStorage(128);
        p1.showDetails();
        System.out.println();
//    obj2
        Smartphone p2 = new Smartphone("Samsung", "Galaxy S24", 512);

        p2.showDetails();
    }
}