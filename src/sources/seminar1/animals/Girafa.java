package sources.seminar1.animals;

public class Girafa extends Animal{
    public Girafa(String nume) {
        super(nume);
    }

    @Override
    public void eat(String mancare) {
        System.out.println("girafa:" + super.getNume() + "->" + mancare);
    }
}
