package builder;

import builder.pattern_builder.HouseMain;

public class BuilderMain {

    private static BuilderMain instance;
    private HouseMain houseMain;

    private BuilderMain(){
        houseMain = new HouseMain();
    }

    public static BuilderMain getInstance(){
        if(instance == null) {
            synchronized (BuilderMain.class) {
                if(instance == null){
                    instance = new BuilderMain();
                }
            }
        }
        return instance;
    }

    public void run() {
        houseMain.mainHouse();
    }

}
