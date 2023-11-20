import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class PersonService {

    public Person findAnyPersonByNameNoOptional(String name, List<Person> personList) {
        List<Person> people = personList.stream()
                .filter(s -> s.getName().equals(name))
                .collect(Collectors.toList());

        if (people.size() > 0) {
            return people.get(0);
        } else {
            return null;
        }
    }


        public Optional<Person> findAnyPersonByName(String name, List<Person> personList) {
       return personList.stream()
                .filter(s -> s.getName().equals(name))
                .findFirst();

        // FindAny
        //    -> Daca mai multe entitati au ajuns la operatie terminala, alegem oricare
        //    -> Daca nicio entiate nu a ajuns la operatie terminala, returnam Optional.empty()
//
//        Optional<Person> personOptional = Optional.empty();
//
//        personOptional.isEmpty(); // true
//
//        Person person = personOptional.get(); // in caz ca nu exista o persoana in Optional primim eroare, daca exista o returnam

//        if(!personOptional.isEmpty()) {
//            person = personOptional.get();
//        } else {
//           new RuntimeException()
//
//        }
//
//        person = personOptional.orElseGet(() -> null);
//        person = personOptional.orElse(new Person());
//        person = personOptional.orElseThrow(() -> new RuntimeException("Error"));






    }

}
