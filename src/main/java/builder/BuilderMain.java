package builder;

public class BuilderMain {

    private BuilderMain instance;

    private BuilderMain(){}

    public BuilderMain getInstance(){
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

    }

}
