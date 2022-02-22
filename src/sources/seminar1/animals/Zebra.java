package sources.seminar1.animals;

public class Zebra extends Animal{

    public Zebra(String nume) {
        super(nume);
    }

    @Override
    public void eat(String mancare) {
        System.out.println("zebra:" + super.getNume() + "->" + mancare);
    }
}
