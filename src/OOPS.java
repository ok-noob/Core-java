class Human {
    String name;
    int age;
    String gender;
    String colour;

//    Constructor
    Human(String name, int age, String gender,String colour) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.colour = colour;
    }

        public void eat () {
            System.out.println(name + " is eating");
        }
        public void sleep () {
            System.out.println(name + " is sleeping");
        }
        public void wakeUp () {
            System.out.println(name + " woke up");
        }
        public void printAge () {
            System.out.println(name + " is " + age + " year old");
        }
        public void printGender () {
            System.out.println(name + " gender is " + gender);
        }
        public void printName () {
            System.out.println("Name: " + name);
        }

    }


public class OOPS {
    public static void main(String[] args) {


//    Project1
        Human human1 = new Human("Brian", 16,"Male","White");

//    Methods
        human1.printName();
        human1.printAge();
        human1.printGender();
        human1.sleep();
        System.out.println();

//    Project2
        Human human2 = new Human("Jane",20,"Female","Brown");

//    Methods
        human2.printName();
        human2.printGender();
        human2.wakeUp();
        human2.eat();

    }
}