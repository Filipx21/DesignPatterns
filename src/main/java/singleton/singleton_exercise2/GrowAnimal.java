package singleton.singleton_exercise2;

import java.io.Serializable;

public class GrowAnimal implements Serializable {

    private GrowAnimal instance;

    private static final int MAX_LOOP = 100;

    private GrowAnimal() { }

    public GrowAnimal getInstance() {
        if(instance == null) {
            synchronized (GrowAnimal.class) {
                if(instance == null) {
                    instance = new GrowAnimal();
                }
            }
        }
        return instance;
    }

    protected Object readResolve() {
        return getInstance();
    }

    public void run() {
        for(int i = 0; i < MAX_LOOP ; i++){


        }
    }













}
