package players;

import java.util.Random;

public class Magic extends Hero {
    public Magic(int health, int damage) {
        super(health, damage, Ability.BOOST);
    }

    @Override
    public void applySuperAbility(Hero[] heroes, Boss boss) {
        Random ranNum = new Random(1);
       int r = ranNum.nextInt(30);
        for (int i = 0; i <heroes.length ; i++) {
            heroes[i].setDamage(heroes[i].getDamage()+r);
            System.out.println("magic использовал свою способность (прибовил урон)");

        }



    }
}
