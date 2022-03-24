public class App {

    public static void main(String[] args) {

        Say<String> s = System.out::println;

        s.say("Hello");

        Func<String,Integer> ss = String::length;

        System.out.println(ss.apply("Hello ENSET"));
    }
}
