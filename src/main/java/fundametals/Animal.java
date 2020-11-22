package fundametals;

public class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
        System.out.println(name);
    }


    public void walk() {
        System.out.println("Animal Walks");
    }

}
