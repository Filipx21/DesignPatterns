package factory;

public class FactoryMain {

    private static FactoryMain instance;

    private FactoryMain(){}

    public static FactoryMain getInstance() {
        if(instance == null) {
            synchronized (FactoryMain.class) {
                if(instance == null) {
                    instance = new FactoryMain();
                }
            }
        }
        return instance;
    }

    public void run() {

    }
}
