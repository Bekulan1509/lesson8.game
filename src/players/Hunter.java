package players;

import java.util.Random;

public class Hunter extends Hero {
    public Hunter(int health, int damage) {
        super(health, damage, Ability.CRITICAL_DAMAGE);
    }

    @Override
    public void applySuperAbility(Hero[] heroes, Boss boss) {
        Random r = new Random(2);
        int ranNum = r.nextInt(4);
        heroes[2].setDamage(heroes[2].getDamage()*ranNum);
        System.out.println("hunter использовал свою суперспособность");
    }
}

