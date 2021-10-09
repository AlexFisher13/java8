package functional_interfaces;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumers {
    public static void main(String[] args) {
        Map<String, String> contacts = new HashMap<>();
        contacts.put("111", "James Smith");
        contacts.put("222", "Mikel Smith");
        contacts.put("333", "David Smith");

        BiConsumer<String, String> printer
                = (phoneNumber, fullName) -> System.out.println(phoneNumber + " - " + fullName);

        contacts.forEach(printer);

    }
}
