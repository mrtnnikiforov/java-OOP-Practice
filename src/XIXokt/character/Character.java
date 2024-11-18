package XIXokt.character;

import XIXokt.interfaces.IDefendable;
import XIXokt.interfaces.IHealable;
import XIXokt.monster.Monster;

public abstract class Character implements IDefendable, IHealable {
    private String name;
    private int health;
    private int power;
    private String race;

    public abstract void attack(Monster target);

    @Override
    public int defend(int attackPower) {
        int newAttackPower = attackPower / 2;
//        var currHealth = getHealth() - newAttackPower;
//        setHealth(Math.max(currHealth, 0));
//        System.out.printf("%s defended against the attack! Remaining health: %d\n", getName(), getHealth());
        return newAttackPower;
    }

    @Override
    public void heal(Character character, int amount) {
        character.setHealth(Math.min(character.getHealth() + amount, character.getHealth()));
        System.out.printf("%s healed %d health! Current health: %d\n", getName(), amount, character.getHealth());
    }
    
    public Character(String name, int health, int power, String race) {
        this.name = name;
        this.health = health;
        this.power = power;
        this.race = race;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

}
