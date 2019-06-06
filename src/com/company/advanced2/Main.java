package com.company.advanced2;

public class Main {
    public static void main(String[] args) {
        Person pp1 = new Person("Jack");
        Person pp2 = new Person("Jack");

        System.out.println(pp1 == pp2);     //false
        System.out.println(pp1.equals(pp2));//true


        Person person = MyPersonEnum.ELEMENT_1.getPerson();
        Person person2 = MyPersonEnum.ELEMENT_1.getPerson();
        System.out.println(person == person2);      //true
        System.out.println(person.equals(person2)); //true

    }
}

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }
}
enum MyPersonEnum {
    ELEMENT_1(new Person("Jack")),
    ELEMENT_2(new Person("Shirly")),
    ELEMENT_3(new Person("Peter")),
    ELEMENT_4(new Person("James"))
    ;

    private Person person;

    MyPersonEnum(Person person) {
        this.person = person;
    }

    public Person getPerson() {
        return person;
    }
}