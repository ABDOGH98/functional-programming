@FunctionalInterface
public interface Predi<T> {

    boolean test(T t) ;

    // greaterThanTen.and(lowerThanTwenty).test(15);
    default Predi<T> and(Predi<T> other){
        return (T t) -> this.test(t) && other.test(t);
    }
}
