package test_commons_lib;

import test_commons_lib.test_lang.CommonsLang;

public class CommonsMain {

    private static CommonsMain instance;
    private CommonsLang commonsLang;

    private CommonsMain() {
        commonsLang = new CommonsLang();
    }

    public void run(String... args) {
        commonsLang.start(args);
    }

    public static CommonsMain getInstance() {
        if(instance == null) {
            synchronized (CommonsMain.class) {
                if(instance == null) {
                    instance = new CommonsMain();
                }
            }
        }
        return instance;
    }
}
