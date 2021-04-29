package hu.nive.ujratervezes.oopcollection.army;

public class Archer extends MilitaryUnit {

    private int life = 50;
    private int damage = 20;
    private boolean shield = false;
    private int hitPoints = 0;

    @Override
    public int doDamage() {
        return damage;
    }

    @Override
    public void sufferDamage(int damage) {
        life -= damage;
    }

    @Override
    public int getHitPoints() {
        return life;
    }

}