import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Cats> catCollection = new ArrayList<>();

        catCollection.add(new Cats("Барсик", "рыжий"));
        catCollection.add(new Cats("Мурзик", "серый"));
        catCollection.add(new Cats("Рыжик"));
        catCollection.add(new Cats("Матроскин", "белый", 10));
        catCollection.add(new Cats("Леопольд", "черный", 5));
        catCollection.add(new Cats("Том", "серый", 2));
        catCollection.add(new Cats("Гарфилд", "рыжий"));
        catCollection.add(new Cats("Котэ"));
        catCollection.add(new Cats("Симба", "рыжий", 1));
        catCollection.add(new Cats("Чеширский", "фиолетовый"));

        System.out.printf("Сейчас создано %d котов", Cats.getAllCatsCount());
        System.out.println();
        System.out.println();

        Comparator<Cats> nameComparator = (o1, o2) -> o1.getName().compareTo(o2.getName());
        Collections.sort(catCollection, nameComparator);

        System.out.println("Вывод коллекции котов отсортированной по полю name:");
        for(Cats cat : catCollection) {
            System.out.println(cat.getName());
        }
        System.out.println();

        Comparator<Cats> ageComparator = (o1, o2) -> Integer.compare(o1.getAge(), o2.getAge());
        Collections.sort(catCollection, ageComparator);

        System.out.println("Вывод коллекции котов отсортированной по полю age:");
        for(Cats cat : catCollection) {
            System.out.println(cat.getName() + " " + cat.getAge());
        }
    }
}
