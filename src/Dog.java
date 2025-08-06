public class Dog extends Animal{
    String name;

    public Dog(){
        super();
    }

    public Dog(String name){
        super(name);
    }

    public void makenoise(){
        System.out.println("This is cat making meow");
    }

    public void play(){
        System.out.println(getName() +" is playing");
    }
}
