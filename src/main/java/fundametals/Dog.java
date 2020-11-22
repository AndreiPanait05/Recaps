package fundametals;

public class Dog extends Animal {


    public Dog(String name) {
        super(name);
    }
    public Dog() {
        this("Alfi");
    }

    public void walk() {
        System.out.println("Dog walks" + name);
    }

}
