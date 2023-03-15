import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("JDCP-6 + Евгений Орлов + ДЗ-21 + Лямбда-выражения и функциональные интерфейсы" +
                "\nЗадача 1 - имплементация компаратора на лету с помощью лямбды.");
        System.out.println("(сортировка с ограничением количества СЛОВ в фамилии и возрасту)");
        List<Person> people = new ArrayList<>();
        people.add(new Person("Донат", "Фон Типа Принц Польский", 19));
        people.add(new Person("Омар", "Шейх Мирза Тамерлан", 17));
        people.add(new Person("Гарри", "Поттер Фром Хогвардс Мимо Хагрид", 12));
        people.add(new Person("Али", "Баба Ибн Сорок Коллекторов", 16));
        // форматированный вывод списка до сортировки
        System.out.printf("\nСписок людей до сортировки:%s.\n", people.toString().replaceAll("\\[|\\]", ""));
        // Лямбда-выражение как аргумент: сортировка с максимальным количеством СЛОВ в фамилии 4
        Comparator<Person> PersonsSurnameAgeComparator = (o1, o2) -> {
            if (o1.getSurnameSet().size() == o2.getSurnameSet().size()
                    || (!(o1.getSurnameSet().size() < 4)
                    && o2.getSurnameSet().size() >= 4))
                return Integer.compare(o1.getAge(), o2.getAge());
            else return Integer.compare(o1.getSurnameSet().size(), o2.getSurnameSet().size());
        };
        Collections.sort(people, PersonsSurnameAgeComparator);// Задача 1: ветка lambda
        // форматированный вывод списка
        System.out.printf("\nСписок после сортировки:%s.\n", people.toString().replaceAll("\\[|\\]", ""));
    }
}