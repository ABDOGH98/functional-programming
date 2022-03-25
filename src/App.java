import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {

        Say<String> s = System.out::println;

        s.say("Hello");

        Func<String,Integer> ss = String::length;

        System.out.println(ss.apply("Hello ENSET from Say Function"));

        String hello = "Hello Abdo From Consum Like Consumer";

        Consum<String> consum1 = t -> System.out.println(t);
        Consum<String> consum2 = t -> System.out.println(t.length());

        consum1.andThen(consum2).accept(hello);

    }
}
