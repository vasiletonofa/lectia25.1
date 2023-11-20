import java.util.function.Function;

public class FunctionImpl implements Function<Person, Person> {
    @Override
    public Person apply(Person person) {
        return new Person(person.getName(), person.getAge());
    }
}
