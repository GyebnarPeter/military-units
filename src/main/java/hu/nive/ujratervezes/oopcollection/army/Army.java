package hu.nive.ujratervezes.oopcollection.army;

import java.util.ArrayList;
import java.util.List;

public class Army {

    List<MilitaryUnit> unit = new ArrayList<>();

    public void addUnit(MilitaryUnit militaryUnit) {
        unit.add(militaryUnit);
    }

    public void damageAll(int damage) {
        unit.forEach(unit -> unit.sufferDamage(damage));
        unit.removeIf(unit -> unit.doDamage() < 25);
    }

    public int getArmyDamage() {
        return 0;
    }

    public int getArmySize() {
        return unit.size();
    }
}