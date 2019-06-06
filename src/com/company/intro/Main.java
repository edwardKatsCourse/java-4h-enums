package com.company.intro;

public class Main {

    private static final String MY_CONSTANT = "constant";

    private static final String ORDER_STATUS_CREATED = "CREATED";
    private static final String ORDER_STATUS_SHIPPED = "SHIPPED";

    private static final String NEW_USER = "";
    private static final String CONFIRMED = "";
    private static final String BLOCKED = "";

    public static final String GUEST_USER = "";
    public static final String REGISTERED_USER = "";
    public static final String GOLDEN_MEMBER = "";
    public static final String ADMIN_USER = "";



    public static void main(String[] args) {

	    //Тип
        //1. classes (static, instances....)
        //2. arrays []
        //3. enum (classes--)

        //Order Status: CREATED, SHIPPED, DELIVERED, DISPUTE

        new Person("Pavel");
        new Person("Michael");
        new Person("Miri");
        new Person("Shir");
        new Person("Jack");
        new Person("Jack");
        new Person("Jack");
        new Person("Jack");
        new Person("Jack");
        new Person("Jack");
        new Person("Jack");
        new Person("Jack");

    }
}

enum OrderStatus {
    //OrderStatus CREATED = new OrderStatus()
    //OrderStatus SHIPPED = new OrderStatus()
    //OrderStatus DELIVERED = new OrderStatus()
    //OrderStatus CLOSED = new OrderStatus()
    CREATED, SHIPPED, DELIVERED, CLOSED
}

enum PersonEnum {
    IVAN, JOHN, PETER, MIRI
}

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }
}

