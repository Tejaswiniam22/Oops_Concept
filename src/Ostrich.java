public class Ostrich extends Bird{
    public Ostrich() {
    }

    public Ostrich(String name) {
        super(name);
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void fly() {
        System.out.println(getName()+ " This cannot fly");
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void makeNoise() {
        super.makeNoise();
    }

    @Override
    public void sleep() {
        super.sleep();
    }

    @Override
    public void roam() {
        super.roam();
    }

    @Override
    public String getName() {
        return super.getName();
    }
}
