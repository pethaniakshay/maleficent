package com.codepuran.maleficent.j8;

public class ObjectReference {
    public static void main(String[] args) {
        PersonFactory<Person> personFactory = Person::new;
        Person person = personFactory.creates("Peter", "Parker");

        System.out.printf("firstName: %s", person.firstName);
    }
}

class Person {
    String firstName;
    String lastName;

    Person() {}

    Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(String firstName) {
        this.firstName = firstName;
    }


}

interface PersonFactory<P extends Person> {
    P creates(String firstName, String lastName);
}