package advanced.designpatterns;

public class SingletonClass {
    private static SingletonClass singletonClass;

    private SingletonClass() {
    }
    public synchronized static SingletonClass getInstance() {
        if(singletonClass == null) {
            singletonClass = new SingletonClass();
        }
        return singletonClass;
    }
}
