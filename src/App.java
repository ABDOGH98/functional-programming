import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {

        Say<String> s = System.out::println;

        s.say("Hello");

        Func<String,Integer> ss = String::length;

        System.out.println(ss.apply("Hello ENSET"));

        List<? extends Number> foo1 = new ArrayList<Number>();
        List<? super Number> foo2 = new ArrayList<Number>();

    }
}
