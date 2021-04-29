package hu.nive.ujratervezes.oopcollection.army;

public class HeavyCavalry extends MilitaryUnit {

    private int life = 150;
    private int damage = 20;
    private boolean shield = true;
    private int attack = 1;

    @Override
    public int doDamage() {
        if(attack == 1) {
            attack++;
            return damage * 3;
        }
        return damage;
    }

    @Override
    public void sufferDamage(int damage) {
        life -= damage / 2;
    }

    @Override
    public int getHitPoints() {
        return life;
    }
}