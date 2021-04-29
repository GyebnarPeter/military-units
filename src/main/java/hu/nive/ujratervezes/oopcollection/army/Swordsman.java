package hu.nive.ujratervezes.oopcollection.army;

public class Swordsman extends MilitaryUnit {

    private int life = 100;
    private int damage = 10;
    private boolean shield;
    private int attack = 1;

    public Swordsman(boolean isShield) {
        shield = isShield;
    }

    @Override
    public int doDamage() {
        return damage;
    }

    @Override
    public void sufferDamage(int damage) {
        if(attack == 1) {
            life -= 0;
        } else if (shield) {
            life -= damage / 2;
        } else {
            life -= damage;
        }
        attack++;
    }

    @Override
    public int getHitPoints() {
        return life;
    }
}