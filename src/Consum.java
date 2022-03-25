@FunctionalInterface
public interface Consum<T> {
    void accept(T t);
    // upperCaseConsumer.andThen(printConsumer).accept(cities);
    /**
     *
     */
   default Consum<T> andThen(Consum<T> after){
       return (T t) -> {
           this.accept(t);
           after.accept(t);
       };
   }
}
