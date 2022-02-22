package sources.seminar1.main;

import sources.seminar1.animals.Animal;
import sources.seminar1.animals.Girafa;
import sources.seminar1.animals.Zebra;
import sources.seminar1.zoo.IngrijitorZOO;
import sources.seminar1.zoo.ZOO;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Zebra("X"));
        animals.add(new Girafa("Y"));
        animals.add(new Zebra("X2"));
        ZOO zoo = new ZOO("first zoo", new IngrijitorZOO("Gigel"),animals);
        zoo.hranesteAnimale();
    }
}
