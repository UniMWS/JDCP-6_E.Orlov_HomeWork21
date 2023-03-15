# Домашнее задание по теме «Лямбда-выражения и функциональные интерфейсы»
*JDCP-6_E.Orlov_HomeWork21*

> Для выполнения этого ДЗ, решение из **JDCP-6_E.Orlov_HWork20** скопировано в новый репозиторий **JDCP-6_E.Orlov_HWork21** с целью сохранения "порядка" и уникальности домашних заданий.

## Задача 1 (обязательная)
⚠️ Эта задача является продолжением задачи по теме *«Коллекции TreeMap и TreeSet»*, поэтому для выполнения этой задачи лучше сперва получить зачёт по предыдущей.

Возьмите репозиторий с решением задачи *«Коллекции TreeMap и TreeSet»*. Отведите ветку `lambda`. Удалите класс компаратора и в методе `main` замените объект этого удалённого класса на лямбду с той же логикой. Т.е. по сути мы дадим имплементацию компаратору на лету с помощью лямбды.

Если вы делали вторую задачу, то параметра не будет (их у лямбд не бывает) - вместо этого просто используйте напрямую в коде лямбды то значение, которое раньше передавали в конструктор компаратора.

Сделайте коммит и пуш в ветку `lambda`, создайте PR и не сливая скиньте ссылку на него в качестве решения этой задачи.

## Задача 2 (обязательная)
Эту задачу делаем в том же репозитории. Отведите ветку `eraser` от `main`.

Нашей целью будет удалить в списке людей в `main` тех людей, которые младше 18 лет (если сейчас в демонстрации нет таких людей - добавьте, чтобы их было как минимум 2). Но мы не будем для этого сами проходиться по списку, мы воспользуемся его готовым методом `removeIf`. Вызовите его у списка и передайте туда предикат (`Predicate<Person>`), метод которого отвечал бы `true` тогда и только тогда, когда человеку из его параметра меньше 18 лет. Таким образом список сам пройдётся по своим элементам и оттестирует каждый вашим предикатом, на ком покажет `true` - тот и будет удалён.

Реализацию нужно сделать с помощью лямбды.

Сделайте коммит и пуш в ветку `eraser`, создайте PR и не сливая скиньте ссылку на него в качестве решения этой задачи.

---

## Домашнее задание по теме «Коллекции TreeMap и TreeSet»
*JDCP-6_E.Orlov_HomeWork20*

### Задача 1 (обязательная)
Перед вами класс, описывающий человека:
```java
public class Person {
    private String name;
    private String surname;
    private int age;
    
    // создайте конструктор на все поля
    
    // создайте геттеры и сеттеры
    
    // создайте toString
}
```
Ваша задача написать класс-компаратор, который сравнивал бы людей по принципу знатности:

У кого больше слов в фамилии, тот более знатен
Если количества слов в фамилии одинаковы, то знатен больше тот, кто старше
Продемонстрируйте работу этого компаратора, создав в `Main.main()` список из нескольких людей и отсортировав его с помощью компаратора: `Collections.sort(СПИСОК, КОМПАРАТОР)`. После чего выведите список на экран.

### Задача 2 (необязательная)
⚠️ ВНИМАНИЕ эта задача делается на основе предыдущей и в том же репозитории, т.е. в итоге вы присылаете только одну ссылку на две задачи. Зачёт по этой будет означать автоматический зачёт по предыдущей.

Добавьте в ваш компаратор конструктор, в котором указывается максимальное количество слов в фамилии, которое имеет смысл при сравнении. Т.е. теперь мы будем при сравнении двух людей считать, что если обе фамилии состоят из количества слов не меньше чем число, указанное в конструкторе, то обе фамилии равнозначны и по ним нельзя определить знатность (что нужно продолжать сравнение уже по возрасту).
