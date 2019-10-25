package streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
// https://docs.oracle.com/javase/8/docs/api/java/util/stream/package-summary.html#NonInterference

  public static void main(String[] args) {
    List<Student> students = Arrays.asList(
        // name, age, points
        new Student("Tom", 31, 40),
        new Student("George", 25, 35),
        new Student("Eve", 33, 35),
        new Student("Rose", 15, 23),
        new Student("Adam", 33, 13),
        new Student("Nicole", 15, 30)
    );

    //region Intermediate operations
    //> Collect and display those students whose age is higher than 18
    List<Student> adults = students.stream()
        .filter(student -> student.getAge() > 18)
        .collect(Collectors.toList());

    System.out.println(adults);


    //> Display the ages of those students in a sorted manner whose name ends with "a"
    List<Integer> ages1 = students.stream()
        .filter(s -> s.getName().endsWith("a"))
        .map(s -> s.getAge())
        .sorted()
        .collect(Collectors.toList());

        // ez ugyanaz:
        Stream < Student > studentsWithAEnding = students.stream()
        .filter(s -> s.getName().endsWith("Q"));
    Stream<Integer> ages = studentsWithAEnding.map(s -> s.getAge());
    Stream<Integer> sortedAges = ages.sorted();
    List<Integer> result = sortedAges.collect(Collectors.toList());
    //endregion


    //region Terminal operations
    // collect:
    // collects the result into a collection
    // List<>: as used above: .Collectors.toList()

    // grouping:
    //> Group students by their ages
    Map<Integer, List<Student>> studentsByAge = students.stream()
        .collect(Collectors.groupingBy(student -> student.getAge()));

    System.out.println(studentsByAge);

    //> Group students depending on whether their age equals to 17
    Map<Boolean, List<Student>> studentsWith17Years = students.stream()
        .collect(Collectors.groupingBy(student -> student.getAge() == 17));

    System.out.println(studentsWith17Years);

    Map<Boolean, List<Student>> studentsWith17Years2 = students.stream()
        .collect(Collectors.partitioningBy(student -> student.getAge() == 17));

    System.out.println(studentsWith17Years2);
    // Difference: partitioningBy can only use a Predicate!!!


    // :: is a method reference
    // In general A::B refers to method B in class A.

    // min()/max() & Optional usage
    //> Get the age of the younger student
    Optional<Integer> result1 = students.stream()
        .map(s -> s.getAge())
        .min(Comparator.comparing(age -> age.longValue()));
    //.min(Comparator.comparing(Integer::valueOf));

    // isPresent() & get()
    // if isPresent then get the value with get()
    if (result1.isPresent()) {
      System.out.println(result1.get());
    }

    // or:
    students.stream()
        .map(s -> s.getAge())
        .min(Comparator.comparing(age -> age.longValue()))
        .ifPresent(age -> System.out.println(age));


    // Get the students whose name ends with "Q" and get the one who has less points
    // orElse() - when there is no value
    Student student = students.stream()
        .filter(s -> s.getName().endsWith("Q"))
        .min(Student::compareTo)
        .orElse(new Student("No one", 4, 5));


    // Comparator
    //> Get the student with maximum age
    Comparator<Student> comparator = Comparator.comparing(Student::getPoints);
    Optional<Student> result3 = students.stream().max(comparator);
    System.out.println(result3.get());


    // forEach:
    // executes an action on all elements in the collection
    //> Show all student ages and names with uppercase
    students.stream().forEach(s -> {
      System.out.println(s.getName().toUpperCase());
      System.out.println(s.getAge());
    });

    //endregion
  }
}
