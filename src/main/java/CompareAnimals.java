import java.util.Comparator;

class AnimalsNameComparator implements Comparator<Animal>
{
    @Override
    public int compare(Animal animal1, Animal animal2)
    {
        return  animal1.getName().compareTo(animal2.getName());
    }
}
class AnimalColourComparator implements Comparator<Animal>
{
    @Override
    public int compare(Animal animal1, Animal animal2)
    {
        return  animal1.getColour().compareTo(animal2.getColour());
    }
}