package functional_interfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Functions {
    public static void main(String[] args) {
        List<Double> list = Arrays.asList(1.1, 2.2, 3.3, 4.4);

        //Фукция округления чисел и приведения их к Long
        Function<Double, Long> round = Math::round; //d -> Math.round(d)
        //Функция замены чисел на слова обозначающие четность
        Function<Long, String> everOrOdd = l -> l % 2 == 0 ? "четное" : "не четное";

        list.stream()
                .map(round.andThen(everOrOdd))
                .forEach(System.out::println);
    }
}
