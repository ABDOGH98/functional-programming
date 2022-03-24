@FunctionalInterface
public interface Func<T,R> {
    R apply(T arg);
}
