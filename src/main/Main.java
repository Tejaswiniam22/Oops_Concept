package main;


import com.teju.*;
import utils.AnimalUtils;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

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

//    Animal c=new Cat("Billi");
//    c.makeNoise();
//
//    Cat ci=(Cat)c;
//    ci.jump();
//
//
//    Animal bat=new Bat("com.teju.Bat ");
//    bat.makeNoise();
//
//    Animal bird = new Bird("New bird");
//    Animal parrot=new Parrot("com.teju.Parrot");
//    Parrot pi=(Parrot)parrot;
//    pi.fly();
//
//    Bird ost=new Ostrich("com.teju.Ostrich");
//    ost.fly();
     /*   com.teju.Address addr=new com.teju.Address("Bengaluru","karnataka", 560042);
        com.teju.Person p= new com.teju.Person("tejaswini", 22, addr);
        p.displayInfo();


        com.teju.Employee emp=new com.teju.Employee("teju", 22, addr,1,"manager",124.5f );
        emp.displayInfo();
        emp.applyForLeave();


        com.teju.Student stu =new com.teju.Student("Rahul", 22, addr,25, "B");
        stu.displayInfo();*/

//        int sum=0;
//        for(String arg:args){
//            sum+=Integer.parseInt(arg);
//        }
//        System.out.println("Sum: "+sum);

//        Dog d= new Dog("Tisson");
//        Cat cat=new Cat("Billi");
    AnimalUtils util=new AnimalUtils();
//        //util.addAnimal(d);
//        //util.addAnimal(cat);

        Parrot p=new Parrot("Pinky");
        util.addAnimal(p);
//
//        Addmethod adding = new Addmethod();
//        System.out.println(adding.Varag(1,2,3,4,5));
//
//        Days today = MONDAY;
//        switch(today)
//        {
//            case MONDAY:
//                System.out.println("This is start of the week");
//                break;
//            case FRIDAY:
//                System.out.println("You are at the end of the week");
//                break;
//            default:
//                System.out.println("You are good to go!");
//        }
//
//        Order order= new Order(1,OrderStatus.PROCESSING);
//        System.out.println(order.printDetails());
//
//
//        Role role=Role.ADMIN;
//        switch(role){
//            case USER :
//                System.out.println("Welcome USER!");
//                break;
//            case ADMIN:
//                System.out.println("Hello Admin");
//                break;
//            case GUEST:
//                System.out.println("Enter your credentials");
//                break;
//            default:
//                System.out.println("Please go out");
//
//        }
//
//        Status stat=Status.NOT_FOUND;
//        System.out.println("Status: " +stat);
//        System.out.println("Code: " +stat.getCode());


//        AddOperate add=new AddOperate();
//        int a = add.operate(2,3);
//        System.out.println(a);

//        SubOperate sub = new SubOperate();
//        System.out.println(sub.operate(4,3));

        MultiOperate multi= new MultiOperate();
        System.out.println(multi.operate(3,4));

        DiviOperate divi=new DiviOperate();
        System.out.println(divi.operate(4,2));


        FunnctinalInt r = (x, y) -> x - y;
        System.out.println(r.operate(5, 3));


        Flayble f = () -> System.out.println("This is a good expression");
        f.willfly();

        FunnctinalInt add=Integer::min;
        System.out.println("add: "+add.operate(10,20));

        Consumer<String> printerr = (s) -> System.out.println(s);
        printerr.accept("Hellloo! Tejaswini!");

        Predicate<Integer> isEven = (n) ->n%2==0;
        System.out.println(isEven.test(4));
        System.out.println(isEven.test(7));


        Function<Integer, String> concatInt = (n) ->"Numbet - " +n;
        System.out.println(concatInt.apply(120));

        //Supplier<Double> getRandomValue = () -> Math.random();
        Supplier<Double> getRandomValue=Math::random;
        System.out.println(getRandomValue.get());

        List<String> names= List.of("Rahul", "Teju", "Pushpa");
        names.stream()
                .filter(n -> n.startsWith("R"))
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.toList())
                .forEach(e-> System.out.println(e));
        Long numnames=names.stream()
                .filter(n ->n.startsWith("R"))
                .map(String::toUpperCase)
                .sorted().count();
        System.out.println("Total names starting with R: " +numnames);
        System.out.println(names);


        List<Integer> numbers= Arrays.asList(1,2,3,4,5,6);
        List<Integer> evenum=numbers.stream()
                .filter(n ->n %2 ==0)
                .collect(Collectors.toList());
        System.out.println(evenum);


        List<Employee> employee = Arrays.asList(new Employee("Rahul", "Doctor"),new Employee("Teju", "Developer"));
        List<String> dev= employee.stream()
                .filter(e ->e.getRole().equals("Doctor"))
                .map(Employee::getName)
                .collect(Collectors.toList());
        System.out.println(dev);


        List<String> words = Arrays.asList("Apple","mango","Banana","Anant","Amphibian" );
        long count = words.stream()
                .filter(w->w.startsWith("A"))
                .count();
        System.out.println(count);

        RemDup remove = new RemDup();
        remove.RemoveDuplicate();


      Employee.sorting();

//        List<Employee> employees = Arrays.asList(new Employee("Rahul", 120000.0),new Employee("Teju", 300000.0));
//        List<String> sorted= (List<String>) employees.stream()
//                .sorted(Comparator.comparing(Employee::getSalary));
//        System.out.println(sorted);

    }
}