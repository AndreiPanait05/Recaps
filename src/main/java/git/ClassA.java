package git;

public class ClassA {
    public static void main(String[] args) {
        System.out.println("Hello world");

        ClassB classB = new ClassB();
        classB.sayHi("Andrei");
        System.out.println("Hi Andrei!");

        ClassC classC = new ClassC();
        classC.getName();

    }
}
