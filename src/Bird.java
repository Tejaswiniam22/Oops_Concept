public class Bird extends Animal{
    @Override
    public void setName(String name) {
        super.setName(name);
    }

    public Bird() {
        super();
    }

    public Bird(String name) {
        super(name);
    }

    public void fly()
    {
        System.out.println(getName()+ "Fly");
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void makeNoise() {
        System.out.println(getName()+ "is making  noise");
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
