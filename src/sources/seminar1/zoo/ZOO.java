package sources.seminar1.zoo;

import sources.seminar1.animals.Animal;

import java.util.List;

public class ZOO {
    private String nume;
    private IngrijitorZOO ingrijitorZOO;
    private List<Animal> animals;

    public ZOO(String nume, IngrijitorZOO ingrijitorZOO, List<Animal> animals) {
        this.nume = nume;
        this.ingrijitorZOO = ingrijitorZOO;
        this.animals = animals;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public IngrijitorZOO getIngrijitorZOO() {
        return ingrijitorZOO;
    }

    public void setIngrijitorZOO(IngrijitorZOO ingrijitorZOO) {
        this.ingrijitorZOO = ingrijitorZOO;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }

    public void hranesteAnimale(){
        System.out.println("Numele meu este " + this.ingrijitorZOO.getNume() + " si hranesc animalele:");
        for(Animal animal: animals){
            this.ingrijitorZOO.hranesteAnimal(animal, "food");
        }
    }
}
