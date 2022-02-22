package sources.seminar1.zoo;

import sources.seminar1.animals.Animal;

public class IngrijitorZOO {
    private String nume;

    public IngrijitorZOO(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void hranesteAnimal(Animal animal, String mancare) {
        animal.eat(mancare);
    }
}
