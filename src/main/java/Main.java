import builder.BuilderMain;
import builder.classical_builder.BuilderWithInterface;
import builder.classical_builder.classical_builder_airport.AirLine;
import observer.observer_exercise2.MainObserverExercise;

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
//
//        BuilderWithInterface builderWithInterface = new BuilderWithInterface();
//        builderWithInterface.run();

//        CommonsMain commonsMain = CommonsMain.getInstance();
//        commonsMain.run();


    }

}
