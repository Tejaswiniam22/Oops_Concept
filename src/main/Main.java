package main;


import com.teju.*;
import utils.AnimalUtils;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    /*com.teju.Animal anm =new com.teju.Animal();
    com.teju.Animal anm1=new com.teju.Animal("Horse");
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


    Animal bat=new Bat("com.teju.Bat ");
    bat.makeNoise();

    Animal bird = new Bird("New bird");
    Animal parrot=new Parrot("com.teju.Parrot");
    Parrot pi=(Parrot)parrot;
    pi.fly();

    Bird ost=new Ostrich("com.teju.Ostrich");
    ost.fly();
     /*   com.teju.Address addr=new com.teju.Address("Bengaluru","karnataka", 560042);
        com.teju.Person p= new com.teju.Person("tejaswini", 22, addr);
        p.displayInfo();


        com.teju.Employee emp=new com.teju.Employee("teju", 22, addr,1,"manager",124.5f );
        emp.displayInfo();
        emp.applyForLeave();


        com.teju.Student stu =new com.teju.Student("Rahul", 22, addr,25, "B");
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