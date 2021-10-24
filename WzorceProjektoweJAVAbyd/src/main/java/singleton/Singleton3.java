package singleton;

public class Singleton3 {

    //LAZY

    private static Singleton3 instance;

    private Singleton3(){
    }

    public static Singleton3 getInstance(){
        if(instance == null){
            instance = new Singleton3();
        }
        return instance;
    }
}
