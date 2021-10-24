package singleton;

public class Singleton6 {

    private static class Singleton{
        private static Singleton6 instance = new Singleton6();
    }

    private Singleton6(){
    }

    public static Singleton6 getInstatnce(){
        return Singleton.instance;
    }
}
