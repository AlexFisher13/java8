package functional_interfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Predicates {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        /*Предикаты это методы которые принимают один аргумент и возвращают boolean*/
        Predicate<Integer> evenPredicate = p -> p % 2 == 0; //этот предикат возвращать true если число четное
        Predicate<Integer> fivePredicate = p -> p == 6; //этот предикат возвращать true если число равно 5

        list.stream()
                .filter(evenPredicate.negate().or(fivePredicate))
                //тут мы применили наш предикат в фильтре,
                //далее вызвали дефолтный метод negate который инверсировал на фильтр
                //далее вызвали дефолтный метод or в который передали еще один предикат
                //и так можно создавать бесконечные цепочки предикатов
                .forEach(System.out::print);
    }
}
