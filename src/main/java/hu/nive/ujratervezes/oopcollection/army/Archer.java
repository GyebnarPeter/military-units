package hu.nive.ujratervezes.oopcollection.army;

public class Archer extends MilitaryUnit {

    private int life = 50;
    private int damage = 20;
    private boolean shield = false;

    @Override
    public int doDamage() {
        return damage;
    }

    @Override
    public void sufferDamage(int damage) {
        life -= damage;
    }

    public int getHitPoints() {
        return 0;
    }

}