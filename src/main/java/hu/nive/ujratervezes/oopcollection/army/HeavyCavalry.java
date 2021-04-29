package hu.nive.ujratervezes.oopcollection.army;

public class HeavyCavalry extends MilitaryUnit {

    private int life = 150;
    private int damage = 20;
    private boolean shield = true;
    private int attack = 1;

    @Override
    public int doDamage() {
        if(attack == 1) {
            return damage * 3;
        }
        attack++;
        return damage;
    }

    @Override
    public void sufferDamage(int damage) {
        life -= damage / 2;
    }

    public int getHitPoints() {
        return 0;
    }
}