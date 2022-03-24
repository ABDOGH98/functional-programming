import java.util.Random;
import java.util.function.DoubleSupplier;
import java.util.function.Supplier;

public class _Supplier {


    public static void main(String[] args) {
        Supplier<Double> sup1 = ()-> Math.random();
        DoubleSupplier sup2 = Math::random;

        System.out.println(sup1.get());
        System.out.println(sup2.getAsDouble());
    }
}
