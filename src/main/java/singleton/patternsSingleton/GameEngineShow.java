package singleton.patternsSingleton;

public class GameEngineShow {

    public int hp = 100;
    public String characterName = "";
    private static GameEngineShow instance;

    private GameEngineShow() { }

    public void run() {
        while(true){
            /**
             * - Czekamy na input gracza,
             * - Zmieniamy stan gry,
             * - Renderujemy grafike
             */
        }
    }

    public static GameEngineShow getInstance() {
        if (instance == null) {
            synchronized (GameEngineShow.class){
                if (instance == null) {
                    instance = new GameEngineShow();
                }
            }
        }
        return instance;
    }
}
