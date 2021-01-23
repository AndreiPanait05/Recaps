package advanced.designpatterns;

public class Main {
    public static void main(String[] args) {
//        SingletonClass singletonClass = SingletonClass.getInstance();
//        System.out.println(singletonClass);
//
//        SingletonClass singletonClass1 = SingletonClass.getInstance();
//        System.out.println(singletonClass1);

        ThreadClass threadClass1 = new ThreadClass();
        ThreadClass threadClass2 = new ThreadClass();
        Thread thread1 = new Thread(threadClass1);
        Thread thread2 = new Thread(threadClass2);
        thread1.start();
        thread2.start();

    }
}
