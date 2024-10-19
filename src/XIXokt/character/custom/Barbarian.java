package XIXokt.character.custom;

import XIXokt.character.Character;
import XIXokt.monster.Monster;

public class Barbarian extends Character {
    @Override
    public void attack(Monster target) {

    }

    @Override
    public void defend(int attackPower) {

    }

    public Barbarian(String name, int health, int power, String race) {
        super(name, health, power, race);
    }
}
