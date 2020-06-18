package singleton;

import singleton.exercise.GameEngine;

public class SingletonMain {

    public void start(){

        GameEngine gameEngine = GameEngine.getInstance();

        int gameResult = gameEngine.run();
        int result = gameEngine.getTotalScore();


        System.out.println("Wynik z samej gry: " + gameResult);
        System.out.println("Wynik z metody getScore: " + result);

        GameEngine gameEngine2 = GameEngine.getInstance();

        System.out.println("Wynik kolejnej instancji: " + gameEngine2.getTotalScore());

    }
}
