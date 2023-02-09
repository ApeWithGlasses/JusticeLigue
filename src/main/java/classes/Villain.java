package classes;

import org.example.Hero;

public class Villain {

    protected String name;
    public int power;
    private Hero hero;

    public int destroy() {
        int result = this.power-this.hero.getPower();
        return result;
    }

}
