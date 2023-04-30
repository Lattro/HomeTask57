import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Comparator<Animal> comparator = new AnimalsNameComparator().thenComparing( new AnimalColourComparator());
        Set<Animal> animalSet = new TreeSet<>(comparator);
        Animal animal1 = new Animal("Кит", "Синий");
        Animal animal2 = new Animal("Медведь", "Белый");
        Animal animal3 = new Animal("Пантера", "Черная");
        Animal animal4 = new Animal("Фламинго", "Розовый");
        Animal animal5 = new Animal("Лягушка", "Зеленая");
        animalSet.add(animal1);
        animalSet.add(animal2);
        animalSet.add(animal3);
        animalSet.add(animal4);
        animalSet.add(animal5);
        for (Animal animal: animalSet)
        {
            System.out.println(animal.getName()+" "+ animal.getColour());
        }
    }
}
