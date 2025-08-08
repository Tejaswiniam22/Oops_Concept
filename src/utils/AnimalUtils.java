package utils;
import com.teju.Animal;
import com.teju.Cat;
import com.teju.Dog;
import com.teju.Parrot;

public class AnimalUtils {
    public void addAnimal(Animal animal){
        System.out.println("added -" +animal.getName());
        animal.makeNoise();

        if(animal instanceof Cat){
            Cat cat=(Cat)animal;
            cat.jump();
        }else if(animal instanceof Parrot){
            Parrot p=(Parrot) animal;
            p.flyy();
        }
    }
}
