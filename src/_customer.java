import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class _customer {

    public static void main(String[] args) {
        //Consumer<String> printConsumer = message -> System.out.println("Hello "+message);
        //List<String> cities = Stream.of("Sydney", "Dhaka", "New York", "London");
        //cities.forEach(printConsumer);
        Consumer<List<String>> upperCaseConsumer = list -> {
            for(int i=0; i< list.size(); i++){
                list.set(i, list.get(i).toUpperCase());
            }
        };
        List<String> cities = Arrays.asList("Sydney", "Dhaka", "New York", "London");
        Consumer<List<String>> printConsumer = list -> list.stream().forEach(System.out::println);
        upperCaseConsumer.andThen(printConsumer).accept(cities);
    }
}
