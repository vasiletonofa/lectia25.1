import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.*;

public class Main {
    public static void main(String[] args) {

     //Stream:
        // Sursa
        // Terminale

        // Intermediare -> filter, map, sort, limit, distinct, peek

        // Colectie de date -> Sursa

        // Operatie terminale -> Suma, Count, Colectie, ForEach, FindAny(Optional), FindFirst, AllMatch, anyMatch

//        Stream.of("A", "B", "C")
//                .forEach(t -> System.out.println(t));


//        boolean isOverEighTeen = list.stream()
//                .allMatch(t -> t.getAge() >= 18);
//
//        System.out.println(isOverEighTeen);


//        boolean anyPersonOver18 = list.stream()
//                .anyMatch(t -> t.getAge() >= 18);
//        System.out.println(anyPersonOver18);

//       list.stream()
//                .forEach(t -> t.setAge(1)); // 444 -> age = 1
//
//       list = list.stream()
//                .peek(t -> t.setAge(1))  // 666 -> age = 1
//                .collect(Collectors.toList());
//
//        for (Person person : list) {
//            person.setAge(1);
//            person.setName("Nicolae");
//            System.out.println(person);
//        }

//        list.stream()
//                .forEach(t -> t.setAge(2)); // 444 -> age = 1

//          list =  list.stream() // 111 -> 999
//                .map(t -> new Person(t.getName(), 1))  // 888 -> age = 1
//                .collect(Collectors.toList()); // 999
//
////        list.stream()
////                .map(t -> {
////                    t.setAge(1);
////                    return t;
////                })  // 444 -> age = 1
////                .collect(Collectors.toList());
//
//        System.out.println(list);  //


//      PersonService personService = new PersonService();
//      Optional<Person> personOptional = personService.findAnyPersonByName("Nicolae", list);
//
//      personOptional.ifPresent(t -> System.out.println(t));
//      Person person2 = personOptional.orElseThrow(() -> new RuntimeException("Nu a fost gasita asa persoana"));
//
//
//      Person person = personService.findAnyPersonByNameNoOptional("Nicolae", list);
//
//      if (person != null) {
//          System.out.println(person);
//      }
//
//      if(person != null) {
//          Person person3 = person;
//      } else {
//          throw new RuntimeException("Nu a fost gasita asa persoana");
//      }
//

        // Colectie -> Multe elemente
        // Optional -> max 1 element

        // Map -> Collection ?

       Integer value = Stream.of(1, 2, 3, 4)
                .reduce(1, (a, b) -> a * b);

        System.out.println(value);

        String result = Stream.of( "A", "B", "C", "D")
                .reduce("", (a,b) -> a + b);

        System.out.println(result);


        List<Integer> list1 = new ArrayList<>();

        list1.add(1);
        list1.add(5);
        list1.add(10);

       int val = list1.stream()
                .reduce(1, (a, b) -> a * b);

        System.out.println(val);

        System.out.println(list1.stream()
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList()));

        List<String> strings = new ArrayList<>();
        strings.add("A");
        strings.add("B");
        strings.add("C");

        Collections.reverse(strings);

        System.out.println(strings);

        List<Person> list = new ArrayList<>(); // 111 -> Garbage Collected
        list.add(new Person("Ion", 17)); // 444
        list.add(new Person("Andrei", 17)); // 555
        list.add(new Person("Vlad", 25)); // 666

       List<String> personNames = list.stream()
                .filter(p -> p.getAge() < 18)
                .map(t -> t.getName())
               .collect(Collectors.toList()); // new Person("Ion", 17)

        System.out.println(personNames);

      List<String> str = list.parallelStream()
                .filter(p -> p.getAge() < 18)
                .map(t -> t.getName())
                .collect(Collectors.toList());

      // Person1 -> Operatie Teriminala
      // Person2 -> Operatie Teriminala


      // Person1, Person2 -> Operatie Teriminala


        Person person = new Person("A", -2);

    }
}