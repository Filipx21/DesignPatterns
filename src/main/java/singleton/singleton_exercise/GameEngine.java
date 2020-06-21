package singleton.singleton_exercise;

import java.io.Serializable;

import java.util.Random;
import java.util.Scanner;

public class GameEngine implements Serializable {

    private static GameEngine instance;

    private static final int MAX_LOOP = 10;
    private int totalScore;

    private GameEngine() {
        totalScore = 0;
    }

    public static GameEngine getInstance() {
        if(instance == null) {
            synchronized (GameEngine.class) {
                if(instance == null) {
                    instance = new GameEngine();
                }
            }
        }
        return instance;
    }

    protected Object readResolve(){
        return getInstance();
    }

    public int getTotalScore() {
        return totalScore;
    }

    public int run() {
        int actualLoop = 0;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Loteria totka");
        while(actualLoop < MAX_LOOP) {
            System.out.println((1 + actualLoop) + ") Podaj liczbe");
            int userValue = getDataFromUser(scanner);
            int systemValue = getRandomNumber(random);
            if(equalsNumbers(userValue, systemValue)) {
                totalScore++;
            }
            actualLoop++;
        }
        return totalScore;
    }

    private boolean equalsNumbers(int userValue, int systemValue) {
        return userValue == systemValue;
    }

    private int getRandomNumber(Random random) {
        return random.nextInt(MAX_LOOP) + 1;
    }

    private int getDataFromUser(Scanner scanner) {
        int userNumber = 0;
        for(int i = 0; i < 1; i++){
            userNumber = scanner.nextInt();
            if(userNumber <= 0 || userNumber >= 10){
                System.out.println("Niestety liczba nie pasuje do przedzialu [1 - 9]\nPonownie podaj liczbe");
                --i;
            }
        }
        return userNumber;
    }
}
