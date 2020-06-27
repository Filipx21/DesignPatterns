package factory.factory_introduce;

import lombok.Getter;
        import lombok.ToString;

@ToString
public abstract class Unit {

    @Getter private int hp;
    @Getter private int exp;
    @Getter private int dps;

    protected Unit(int hp, int exp, int dps) {
        this.hp = hp;
        this.exp = exp;
        this.dps = dps;
    }

}
