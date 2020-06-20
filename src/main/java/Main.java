import builder.BuilderMain;

public class Main {

    public static void main(String[] args) {
//        ObserverMain observer = new ObserverMain();
//        observer.start();

//        WeatherMain weatherMain = new WeatherMain();
//        weatherMain.weatherMain();

//        SingletonMain singletonMain = new SingletonMain();
//        singletonMain.start();

//        MainObserverExercise mainObserverExercise = MainObserverExercise.getInstance();
//        mainObserverExercise.run();

        BuilderMain builderMain = BuilderMain.getInstance();
        builderMain.run();

//        CommonsMain commonsMain = CommonsMain.getInstance();
//        commonsMain.run();


    }

}
