package exercise.funcationalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Streams {
  public static void main(String[] args) {

    List<Person> personList = Arrays.asList(new Person("Bob", 44));


    Predicate<Person> personPredicate = p -> p.name.equalsIgnoreCase("xx");

    Consumer<String> consumerCheck = s -> {
      System.out.println("consume inputs but no output like void method");
    };

    BiConsumer<String, Boolean> biconsumerCheck =
        (in, r) -> System.out.println("inputs received.." + in + "" + r);

    Supplier<String> databaseUrlSupplier = () -> "url";


    personList.stream().map(p -> p.name)
    .mapToInt(name->name.length())
    .forEach(System.out::println);
  }
}
