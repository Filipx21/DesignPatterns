package singleton.patternsSingleton;

public enum GameEngineEnumShow {
    INSTANCE;

    private int hp = 100;
    private String characterName = "";

    private GameEngineEnumShow() {}

    public void run() {
        while(true){
            /**
             * - Czekamy na input gracza,
             * - Zmieniamy stan gry,
             * - Renderujemy grafike
             */
        }
    }
}
