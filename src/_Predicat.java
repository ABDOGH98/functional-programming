import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _Predicat {

    public static void main(String[] args) {
        /*List<String> list = Arrays.asList("Abdo","gh","abdoooo","ziiiii","zooooabdoza");
        Predicate<String> myTest = t -> t.contains("abdo") || t.equalsIgnoreCase("abdo");

        System.out.println(list.stream().filter(myTest).collect(Collectors.toList()));*/

        List<String> names = Arrays.asList("John", "Smith", "Samueal", "Catley", "Sie");
        Predicate<String> startPredicate = str -> str.startsWith("S");
        Predicate<String> lengthPredicate = str -> str.length() >= 5;
        names.stream().filter(startPredicate.and(lengthPredicate)).forEach(System.out::println);
    }
}
