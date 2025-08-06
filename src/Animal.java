public class Animal {
    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal(){
        System.out.println("This is non parameterized constuctor");
    }
    public Animal(String name){
        this.name=name;
    }
    public void eat(){
        System.out.println("Eat is called");
    }
    public void makeNoise(){
        System.out.println("Dog is making noise");
    }
    public void sleep()
    {
        System.out.println("Dog is sleeping");
    }
    public void roam(){
        System.out.println("Roaming!");
    }
}
