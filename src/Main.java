import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    /*Animal anm =new Animal();
    Animal anm1=new Animal("Horse");
    anm.setName("Cow");
    anm.getName();
        System.out.println("This is" +anm.getName());
    anm.eat();
    anm.sleep();
    anm.makeNoise();
    anm.roam();*/

    Animal c=new Cat("Billi");
    c.makeNoise();

    Cat ci=(Cat)c;
    ci.jump();


    Animal bat=new Bat("Bat ");
    bat.makeNoise();

    Animal bird = new Bird("New bird");
    Animal parrot=new Parrot("Parrot");
    Parrot pi=(Parrot)parrot;
    pi.fly();

    Bird ost=new Ostrich("Ostrich");
    ost.fly();
     /*   Address addr=new Address("Bengaluru","karnataka", 560042);
        Person p= new Person("tejaswini", 22, addr);
        p.displayInfo();


        Employee emp=new Employee("teju", 22, addr,1,"manager",124.5f );
        emp.displayInfo();
        emp.applyForLeave();


        Student stu =new Student("Rahul", 22, addr,25, "B");
        stu.displayInfo();*/

        int sum=0;
        for(String arg:args){
            sum+=Integer.parseInt(arg);
        }
        System.out.println("Sum: "+sum);

        Dog d= new Dog("Tisson");
        Cat cat=new Cat("Billi");
        AnimalUtils util=new AnimalUtils();
        util.addAnimal(d);
        util.addAnimal(cat);
    }
}