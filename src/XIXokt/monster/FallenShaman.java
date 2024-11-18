package XIXokt.monster;

import XIXokt.character.Character;
import XIXokt.interfaces.IDefendable;

public class FallenShaman extends Monster{
    public FallenShaman(String name, int health, int power, String race) {
        super(name, health, power, race);
    }

    @Override
    public void attack(Character target) {
        int effectivePower = getPower();
        int newPower = target.defend(effectivePower);

        assert target != null;
        int healthAfterAttack = target.getHealth() - newPower;
        System.out.printf("%s of type %s dealt %d damage to %s, health remaining: %d\n", getName(), getRace(), newPower, target.getName(), healthAfterAttack);
        target.setHealth(healthAfterAttack);

        if (healthAfterAttack <= 0) {
            System.out.printf("%s was slain by %s\n", target.getName(), getName());
            target.setHealth(0);
        }
    }

}
