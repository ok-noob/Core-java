class Human {
    String name;
    int age;
    String gender;

    public void eat() {
        System.out.println(name+" is eating");
    }
    public void sleep() {
        System.out.println(name+" is sleeping");
    }
    public void wakeUp() {
        System.out.println(name+" woke up");
    }
    public void getAge(){
        System.out.println(name+" is "+age+" year old");
    }
    public void gender(){
        System.out.println(name+" gender is "+gender);
    }
    public void getName(){
        System.out.println("Name: "+name);
    }

}

public class OOPS {
    public static void main(String args[]) {
//    Project1
        Human human1 = new Human();
        human1.name = "Alex";
        human1.age = 16;
        human1.gender = "Male";
//    Methods
        human1.getName();
        human1.getAge();
        human1.gender();
        System.out.println();

//    Project2
        Human human2 = new Human();
        human2.name = "Jane";
        human2.age = 20;
        human2.gender = "Female";
//    Methods
        human2.getName();
        human2.gender();
        human2.eat();
    }
}