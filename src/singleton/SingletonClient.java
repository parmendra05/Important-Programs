package singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonClient {
    public static void main(String[] args) throws Exception {
        Singleton s= Singleton.getInstance();
        System.out.println(s.hashCode());

        Singleton s2= Singleton.getInstance();
        System.out.println(s2.hashCode());

        // Breaking Singleton
        Constructor<Singleton> myInstance = Singleton.class.getDeclaredConstructor();
        myInstance.setAccessible(true);

        Singleton s3= myInstance.newInstance();
        System.out.println(s3.hashCode());

        // Preventing Singleton class using Singleton2
        Signleton2 obj = Signleton2.getInstance();
        System.out.println(obj.hashCode());

        Constructor<Signleton2> singletonInstance = Signleton2.class.getDeclaredConstructor();
        singletonInstance.setAccessible(true);

        Signleton2 obj2= singletonInstance.newInstance();
        System.out.println(obj2.hashCode());
    }
}
