package players;

public class Warrior extends Hero {
    public Warrior(int health, int damage) {
        super(health, damage, Ability.SAVE_DAMAGE_AND_REVERT);
    }



    @Override
    public void applySuperAbility(Hero[] heroes, Boss boss) {
        heroes[0].setDamage(heroes[0].getDamage()+boss.getDamage());
        System.out.println("warrior использовал свою спосоьность!");

    }



}
