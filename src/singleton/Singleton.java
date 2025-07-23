package singleton;

import java.security.Signature;

public class Singleton {

    /*
    // Eager Initialization -> create instance even without need
    private static Singleton instance= new Singleton();

    private Singleton(){}

    public static Singleton getInstance() {
        return instance;
    }

     */

    /*
    // Lazy Initialization -> Not thread safe
    private static Singleton instance;

    private Singleton(){}

    public static Singleton getInstance() {
        if (instance ==null) instance=new Singleton();
        return instance;
    }
     */
    /*
    //  Thread safe with method level synchronization -> slower due to synchronization
    private static Singleton instance;

    private Singleton(){}

    public static synchronized Singleton getInstance() {
        if (instance ==null) instance=new Singleton();
        return instance;
    }  */

    // Double-checked locking -> fast and recommended
    private static Singleton instance;

    private Singleton(){}

    public static Singleton getInstance() {
        if(instance == null) {
            synchronized (Singleton.class){
                if (instance==null) instance = new Singleton();
            }
        }
        return instance;
    }
}
