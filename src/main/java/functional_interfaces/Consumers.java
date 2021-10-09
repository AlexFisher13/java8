package functional_interfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumers {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        //Чистый потребитель, потребляет аргументы и что-то делает, ноничего не возвращает
        Consumer<Integer> print = System.out::println; //c -> System.out.println(c);

        list.forEach(print);
    }
}
