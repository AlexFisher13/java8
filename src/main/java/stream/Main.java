package stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Саша", 27));
        persons.add(new Person("Юля", 24));
        persons.add(new Person("Женя", 23));
        persons.add(new Person("Влад", 27));
        persons.add(new Person("Сергей", 25));

        /** Stream. Агрегатные операции */

        /** Stream. Foreach */

        //Вывод элементов коллекции с помощью лямбды
        persons.stream().forEach((Person p) -> System.out.println(p));

        //Тоже самое, только мы опустили тип Person, который и так уже изместен компилятору
        persons.stream().forEach(p -> System.out.println(p));

        //Так как у нас только один параметр (элемент коллекции) мы тоже можем его опустить,
        // и передавать только ссылку на метод
        persons.stream().forEach(System.out::println);


        /** Stream. Filter */

        //Филльтруем элементы коллекции, возраст которых большо 24 и выводим через foreach
        persons.stream()
                .filter(p -> p.getAge() > 24)
                .forEach(System.out::println);


        /** Stream. Sorted */

        //Сортировка с указанием компаратору по какому полю сортировать
        persons.stream()
                .sorted(Comparator.comparing(Person::getName))
                .forEach(System.out::println);

        /** Stream. Map */

        //Преобразование нашей коллекции
        persons.stream()
                .map(p -> p.getName())
                .forEach(System.out::println);

    }
}
