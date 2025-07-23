package singleton;

public class Signleton2 {
    private static Signleton2 instance = new Signleton2();

    private Signleton2(){
        if (instance != null) throw new RuntimeException("Use getInstance() method");
    }

    public static Signleton2 getInstance() {
        return instance;
    }
}
