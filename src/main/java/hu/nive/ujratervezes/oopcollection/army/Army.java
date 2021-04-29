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
        int sum = 0;
        for (MilitaryUnit militaryUnit : unit) {
            sum += militaryUnit.doDamage();
        }
        return sum;
    }

    public int getArmySize() {
        return unit.size();
    }
}