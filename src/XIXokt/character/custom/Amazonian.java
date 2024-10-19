package XIXokt.character.custom;

import XIXokt.character.Character;
import XIXokt.monster.Monster;

public class Amazonian extends Character {
    public Amazonian(String name, int health, int power, String race) {
        super(name, health, 5, race);
    }

    @Override
    public void attack(Monster target) {
        var healthAfterAttack = target.getHealth() - getPower();
    }

    @Override
    public void defend(int attackPower) {

    }
}
