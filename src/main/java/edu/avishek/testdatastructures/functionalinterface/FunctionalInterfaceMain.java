package edu.avishek.testdatastructures.functionalinterface;

import edu.avishek.testdatastructures.functionalinterface.person.Person;

import java.util.Objects;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class FunctionalInterfaceMain {

    public static void main(String[] args) {
        Function<Long, Long> add = new AddFunction();
        System.out.println(add.apply(50L));

        Function<Long, Long> addLambda = (value) -> value + 100;
        System.out.println(addLambda.apply(50L));

        NullCheckPredicate checkForNull = new NullCheckPredicate();
        System.out.println(checkForNull.test("Hello"));
        System.out.println(checkForNull.test(null));

        Predicate<String> checkForNullPredicate = Objects::nonNull;
        System.out.println(checkForNullPredicate.test("Hello"));
        System.out.println(checkForNullPredicate.test(null));

        UnaryOperator<Person> integerUnaryOperator = FunctionalInterfaceMain::apply;

        System.out.println(integerUnaryOperator.apply(new Person()).toString());

        Predicate<String> startsWithCheck = (text) -> text.startsWith("Hello");
        Predicate<String> endsWithCheck = (text) -> text.endsWith("!");

        Predicate<String> doCheck = startsWithCheck.and(endsWithCheck);

        if(doCheck.test("Hello, this is avishek. I hope you are having a good day!"))
            System.out.println("Does it check out? YES");
        else
            System.out.println("Does it check out? NO");

        if(doCheck.test("Hello, this is avishek. I hope you are having a good day"))
            System.out.println("Does it check out? YES");
        else
            System.out.println("Does it check out? NO");
    }

    private static Person apply(Person person) {
        person.setFirstName("Avishek");
        person.setLastName("Datta");
        return person;
    }
}
